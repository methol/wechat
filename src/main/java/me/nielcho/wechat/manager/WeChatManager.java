package me.nielcho.wechat.manager;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import me.nielcho.wechat.context.WeChatContext;
import me.nielcho.wechat.session.WeChatSession;
import me.nielcho.wechat.util.Util;

import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;


public class WeChatManager {

    private ThreadPoolTaskExecutor threadPoolTaskExecutor;
    private ConcurrentHashMap<String, WeChatSession> sessionMap = new ConcurrentHashMap<>();

    public WeChatContext getContext() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        String sessionId = request.getSession().getId();
        return getSession(sessionId).getContext();
    }

    public void setThreadPoolTaskExecutor(ThreadPoolTaskExecutor threadPoolTaskExecutor) {
        this.threadPoolTaskExecutor = threadPoolTaskExecutor;
    }

    public WeChatSession createSession(String id) {
        WeChatSession session = new WeChatSession(id);
        session.startLogin();
        String uuid = session.getUUID();
        if (StringUtils.isEmpty(uuid)) {
            return null;
        } else {
            sessionMap.put(id, session);
            session = Util.initializeBean(session);
            threadPoolTaskExecutor.submit(session);
            return session;
        }
    }


    public WeChatSession getSession(String id) {
        return sessionMap.get(id);
    }


}
