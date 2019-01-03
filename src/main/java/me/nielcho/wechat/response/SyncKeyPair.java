package me.nielcho.wechat.response;

import com.alibaba.fastjson.annotation.JSONField;

public class SyncKeyPair {
    @JSONField(name = "Key")
    private int Key;
    @JSONField(name = "Val")
    private int Val;

    public int getKey() {
        return Key;
    }

    public void setKey(int key) {
        Key = key;
    }

    public int getVal() {
        return Val;
    }

    public void setVal(int val) {
        Val = val;
    }
}
