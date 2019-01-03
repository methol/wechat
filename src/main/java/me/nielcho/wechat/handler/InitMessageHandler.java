package me.nielcho.wechat.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import me.nielcho.wechat.constants.WeChatConstants;
import me.nielcho.wechat.context.WeChatContext;
import me.nielcho.wechat.domain.ContactInfo;
import me.nielcho.wechat.response.MessageResponse;

@Component
public class InitMessageHandler extends MessageHandler {
    private static final Logger log = LoggerFactory.getLogger(InitMessageHandler.class);


    @Override
    public WeChatConstants.MessageType getSupportedType() {
        return WeChatConstants.MessageType.INIT;
    }

    @Override
    public void handle(WeChatContext context, MessageResponse message) {
        String username = message.getToUserName();
        ContactInfo contactInfo = contactRepository.getContact(context.getUin(), username);
        switch (message.getStatusNotifyCode()) {
            case 2:
                //进入聊天窗口
                log.info("[*] |{}|{}|:你打开了聊天窗:{}", context.getId(), context.getUuid(), contactInfo == null ? "未知" : contactInfo.getNickname());
                break;
            case 5:
                //离开聊天窗口, 暂时不处理
                log.info("[*] |{}|{}|:你离开了聊天窗:{}", context.getId(), context.getUuid(), contactInfo == null ? "未知" : contactInfo.getNickname());
                break;
        }
    }
}
