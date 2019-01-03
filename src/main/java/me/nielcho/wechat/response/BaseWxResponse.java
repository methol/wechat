package me.nielcho.wechat.response;

import com.alibaba.fastjson.annotation.JSONField;

public class BaseWxResponse {
    @JSONField(name = "BaseResponse")
    private BaseResponse BaseResponse;

    public static boolean isSuccess(BaseWxResponse baseWxResponse) {
        return baseWxResponse != null && baseWxResponse.isSuccess();
    }

    private boolean isSuccess() {
        return BaseResponse != null && BaseResponse.getRet() == 0;
    }

    public me.nielcho.wechat.response.BaseResponse getBaseResponse() {
        return BaseResponse;
    }

    public void setBaseResponse(me.nielcho.wechat.response.BaseResponse baseResponse) {
        BaseResponse = baseResponse;
    }
}
