package me.nielcho.wechat.handler;

import org.springframework.stereotype.Component;

import me.nielcho.wechat.constants.WeChatConstants;
import me.nielcho.wechat.context.WeChatContext;
import me.nielcho.wechat.domain.WeChatMessage;
import me.nielcho.wechat.response.MessageResponse;

@Component
public class FileMessageHandler extends MessageHandler {

    @Override
    public WeChatConstants.MessageType getSupportedType() {
        return WeChatConstants.MessageType.FILE;
    }

    @Override
    public void handleInternal(WeChatContext context, MessageResponse message, WeChatMessage weChatMessage) {
        weChatMessage.setFileName(message.getFileName());
        weChatMessage.setFileSize(Long.valueOf(message.getFileSize()));
    }
}
