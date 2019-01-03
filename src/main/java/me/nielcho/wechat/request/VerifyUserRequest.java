package me.nielcho.wechat.request;


import com.alibaba.fastjson.annotation.JSONField;

public class VerifyUserRequest {
    @JSONField(name = "Value")
    private String Value;
    @JSONField(name = "VerifyUserTicket")
    private String VerifyUserTicket = "";

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public String getVerifyUserTicket() {
        return VerifyUserTicket;
    }

    public void setVerifyUserTicket(String verifyUserTicket) {
        VerifyUserTicket = verifyUserTicket;
    }
}
