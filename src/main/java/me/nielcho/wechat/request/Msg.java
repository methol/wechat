package me.nielcho.wechat.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;

import me.nielcho.wechat.constants.WeChatConstants;
import me.nielcho.wechat.context.WeChatContext;
import me.nielcho.wechat.util.WeChatUtil;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Msg {
    @JSONField(name = "Type")
    private int Type;
    @JSONField(name = "FromUserName")
    private String FromUserName;
    @JSONField(name = "ToUserName")
    private String ToUserName;
    @JSONField(name = "LocalID")
    private String LocalID;
    @JSONField(name = "Content")
    private String Content = "";
    @JSONField(name = "ClientMsgId")
    private String ClientMsgId;
    @JSONField(name = "MediaId")
    private String MediaId;

    public static Msg newTextMsg(WeChatContext context, String to, String content) {
        String clientMsgId = WeChatUtil.generateClientMsgId();
        Msg msg = new Msg();
        msg.setContent(content);
        msg.setFromUserName(context.getUser().getUserName());
        msg.setToUserName(to);
        msg.setLocalID(clientMsgId);
        msg.setClientMsgId(clientMsgId);
        msg.setType(WeChatConstants.MessageType.TEXT.getMsgType());
        return msg;
    }

    public static Msg newImageMsg(WeChatContext context, String to, String mediaId) {
        String clientMsgId = WeChatUtil.generateClientMsgId();
        Msg msg = new Msg();
        msg.setMediaId(mediaId);
        msg.setFromUserName(context.getUser().getUserName());
        msg.setToUserName(to);
        msg.setLocalID(clientMsgId);
        msg.setClientMsgId(clientMsgId);
        msg.setType(WeChatConstants.MessageType.IMAGE.getMsgType());
        return msg;
    }

    public static Msg newFileMsg(WeChatContext context, String to, String mediaId) {
        String clientMsgId = WeChatUtil.generateClientMsgId();
        Msg msg = new Msg();
        msg.setMediaId(mediaId);
        msg.setFromUserName(context.getUser().getUserName());
        msg.setToUserName(to);
        msg.setLocalID(clientMsgId);
        msg.setClientMsgId(clientMsgId);
        msg.setType(WeChatConstants.MessageType.FILE.getMsgType());
        return msg;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getLocalID() {
        return LocalID;
    }

    public void setLocalID(String localID) {
        LocalID = localID;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getClientMsgId() {
        return ClientMsgId;
    }

    public void setClientMsgId(String clientMsgId) {
        ClientMsgId = clientMsgId;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
