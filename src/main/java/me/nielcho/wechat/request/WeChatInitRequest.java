package me.nielcho.wechat.request;

import com.alibaba.fastjson.annotation.JSONField;

public class WeChatInitRequest {
    @JSONField(name = "BaseRequest")
    private BaseRequest BaseRequest;

    public me.nielcho.wechat.request.BaseRequest getBaseRequest() {
        return BaseRequest;
    }

    public void setBaseRequest(me.nielcho.wechat.request.BaseRequest baseRequest) {
        BaseRequest = baseRequest;
    }
}
