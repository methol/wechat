package me.nielcho.wechat.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class SyncKey {
    @JSONField(name = "Count")
    private int Count;
    @JSONField(name = "List")
    private List<SyncKeyPair> List;

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public java.util.List<SyncKeyPair> getList() {
        return List;
    }

    public void setList(java.util.List<SyncKeyPair> list) {
        List = list;
    }
}
