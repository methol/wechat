package me.nielcho.wechat.request;

import com.alibaba.fastjson.annotation.JSONField;

import me.nielcho.wechat.response.SyncKey;

public class WeChatSyncRequest {
    @JSONField(name = "BaseRequest")
    private BaseRequest baseRequest;
    @JSONField(name = "SyncKey")
    private SyncKey syncKey;
    @JSONField(name = "rr")
    private long rr;

    public BaseRequest getBaseRequest() {
        return baseRequest;
    }

    public void setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
    }

    public SyncKey getSyncKey() {
        return syncKey;
    }

    public void setSyncKey(SyncKey syncKey) {
        this.syncKey = syncKey;
    }

    public long getRr() {
        return rr;
    }

    public void setRr(long rr) {
        this.rr = rr;
    }
}
