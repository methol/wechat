package me.nielcho.wechat.request;


import com.alibaba.fastjson.annotation.JSONField;

public class SendTextRequest {
    @JSONField(name = "BaseRequest")
    private BaseRequest BaseRequest;
    @JSONField(name = "Msg")
    private Msg Msg;

    public me.nielcho.wechat.request.BaseRequest getBaseRequest() {
        return BaseRequest;
    }

    public void setBaseRequest(me.nielcho.wechat.request.BaseRequest baseRequest) {
        BaseRequest = baseRequest;
    }

    public me.nielcho.wechat.request.Msg getMsg() {
        return Msg;
    }

    public void setMsg(me.nielcho.wechat.request.Msg msg) {
        Msg = msg;
    }
}
