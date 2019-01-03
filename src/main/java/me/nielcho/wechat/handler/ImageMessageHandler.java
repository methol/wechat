package me.nielcho.wechat.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import me.nielcho.wechat.constants.WeChatConstants;
import me.nielcho.wechat.context.WeChatContext;
import me.nielcho.wechat.domain.WeChatMessage;
import me.nielcho.wechat.response.MessageResponse;

@Component
public class ImageMessageHandler extends MessageHandler {
    private static final Logger LOG = LoggerFactory.getLogger(ImageMessageHandler.class);

    @Override
    public WeChatConstants.MessageType getSupportedType() {
        return WeChatConstants.MessageType.IMAGE;
    }

    @Override
    public void handleInternal(WeChatContext context, MessageResponse message, WeChatMessage weChatMessage) {
        String rawContent = message.getContent();
        message.setContent(rawContent.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("<br/>", ""));
        weChatMessage.setContent("");
    }
}
