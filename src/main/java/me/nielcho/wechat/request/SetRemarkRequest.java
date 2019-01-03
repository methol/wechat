package me.nielcho.wechat.request;

import com.alibaba.fastjson.annotation.JSONField;

import me.nielcho.wechat.context.WeChatContext;

public class SetRemarkRequest {

    @JSONField(name = "BaseRequest")
    private BaseRequest BaseRequest;
    @JSONField(name = "UserName")
    private String UserName;
    @JSONField(name = "RemarkName")
    private String RemarkName;
    @JSONField(name = "CmdId")
    private int CmdId = 2;


    public static SetRemarkRequest newSetRemarkRequest(WeChatContext context, String to, String remarkName) {
        SetRemarkRequest request = new SetRemarkRequest();
        request.setBaseRequest(context.getBaseRequest());
        request.setUserName(to);
        request.setRemarkName(remarkName);
        return request;
    }

    public me.nielcho.wechat.request.BaseRequest getBaseRequest() {
        return BaseRequest;
    }

    public void setBaseRequest(me.nielcho.wechat.request.BaseRequest baseRequest) {
        BaseRequest = baseRequest;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getRemarkName() {
        return RemarkName;
    }

    public void setRemarkName(String remarkName) {
        RemarkName = remarkName;
    }

    public int getCmdId() {
        return CmdId;
    }

    public void setCmdId(int cmdId) {
        CmdId = cmdId;
    }
}
