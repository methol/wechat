package me.nielcho.wechat.handler;

import me.nielcho.wechat.constants.WeChatConstants;
import me.nielcho.wechat.context.WeChatContext;
import me.nielcho.wechat.domain.WeChatMessage;
import me.nielcho.wechat.response.MessageResponse;
import org.springframework.stereotype.Component;


@Component
public class VoiceMessageHandler extends MessageHandler {
    @Override
    public WeChatConstants.MessageType getSupportedType() {
        return WeChatConstants.MessageType.VOICE;
    }
    
    @Override
    public void handleInternal(WeChatContext context, MessageResponse message, WeChatMessage weChatMessage) {
        weChatMessage.setContent("");
    }
}
