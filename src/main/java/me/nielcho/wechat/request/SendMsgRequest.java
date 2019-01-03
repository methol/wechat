package me.nielcho.wechat.request;


import org.apache.commons.collections.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

public class SendMsgRequest {
    private String to;
    private List<String> receivers;
    private String content;

    public void validate() {
        if (StringUtils.isEmpty(to) && CollectionUtils.isEmpty(receivers)) {
            throw new IllegalArgumentException("接收人为空");
        }
        if (StringUtils.isEmpty(content)) {
            throw new IllegalArgumentException("消息为空");
        }
        if (content.length() > 5000) {
            throw new IllegalArgumentException("发送内容过长, 最大5000个汉字!");
        }
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<String> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<String> receivers) {
        this.receivers = receivers;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
