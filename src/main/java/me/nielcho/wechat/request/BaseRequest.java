package me.nielcho.wechat.request;

import com.alibaba.fastjson.annotation.JSONField;

public class BaseRequest {
    @JSONField(name = "Uin")
    private Long Uin;
    @JSONField(name = "Sid")
    private String Sid;
    @JSONField(name = "Skey")
    private String Skey;
    @JSONField(name = "DeviceID")
    private String DeviceID;

    public Long getUin() {
        return Uin;
    }

    public void setUin(Long uin) {
        Uin = uin;
    }

    public String getSid() {
        return Sid;
    }

    public void setSid(String sid) {
        Sid = sid;
    }

    public String getSkey() {
        return Skey;
    }

    public void setSkey(String skey) {
        Skey = skey;
    }

    public String getDeviceID() {
        return DeviceID;
    }

    public void setDeviceID(String deviceID) {
        DeviceID = deviceID;
    }
}
