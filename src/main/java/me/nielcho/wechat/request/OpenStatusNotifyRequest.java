package me.nielcho.wechat.request;


import com.alibaba.fastjson.annotation.JSONField;

public class OpenStatusNotifyRequest {
    @JSONField(name = "BaseRequest")
    private BaseRequest BaseRequest;
    @JSONField(name = "Code")
    private int Code;
    @JSONField(name = "FromUserName")
    private String FromUserName;
    @JSONField(name = "ToUserName")
    private String ToUserName;
    @JSONField(name = "ClientMsgId")
    private long ClientMsgId;

    public me.nielcho.wechat.request.BaseRequest getBaseRequest() {
        return BaseRequest;
    }

    public void setBaseRequest(me.nielcho.wechat.request.BaseRequest baseRequest) {
        BaseRequest = baseRequest;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
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

    public long getClientMsgId() {
        return ClientMsgId;
    }

    public void setClientMsgId(long clientMsgId) {
        ClientMsgId = clientMsgId;
    }
}
