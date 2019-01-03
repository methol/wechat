package me.nielcho.wechat.request;

import com.alibaba.fastjson.annotation.JSONField;

public class SendMediaRequest {
    @JSONField(name = "BaseRequest")
    private BaseRequest BaseRequest;
    @JSONField(name = "Msg")
    private Msg Msg;
    @JSONField(name = "Scene")
    private Integer Scene;

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

    public Integer getScene() {
        return Scene;
    }

    public void setScene(Integer scene) {
        Scene = scene;
    }
}
