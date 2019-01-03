package me.nielcho.wechat.handler;

import org.springframework.stereotype.Component;

import me.nielcho.wechat.constants.WeChatConstants;

@Component
public class SpecialEmotionMessageHandler extends ImageMessageHandler {
    @Override
    public WeChatConstants.MessageType getSupportedType() {
        return WeChatConstants.MessageType.SPECIAL_EMOTION;
    }

}
