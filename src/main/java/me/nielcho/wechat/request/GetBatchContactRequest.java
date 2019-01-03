package me.nielcho.wechat.request;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class GetBatchContactRequest {
    @JSONField(name = "BaseRequest")
    private BaseRequest BaseRequest;
    @JSONField(name = "Count")
    private int Count;
    @JSONField(name = "List")
    private List<GetBatchUserName> List;

    public me.nielcho.wechat.request.BaseRequest getBaseRequest() {
        return BaseRequest;
    }

    public void setBaseRequest(me.nielcho.wechat.request.BaseRequest baseRequest) {
        BaseRequest = baseRequest;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public java.util.List<GetBatchUserName> getList() {
        return List;
    }

    public void setList(java.util.List<GetBatchUserName> list) {
        List = list;
    }
}
