package me.nielcho.wechat.request;

import com.alibaba.fastjson.annotation.JSONField;

public class GetBatchUserName {
    @JSONField(name = "UserName")
    private String UserName;
    @JSONField(name = "EncryChatRoomId")
    private String EncryChatRoomId;


    public static GetBatchUserName fromUserName(String userName) {
        GetBatchUserName getBatchUserName = new GetBatchUserName();
        getBatchUserName.setUserName(userName);
        getBatchUserName.setEncryChatRoomId("");
        return getBatchUserName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEncryChatRoomId() {
        return EncryChatRoomId;
    }

    public void setEncryChatRoomId(String encryChatRoomId) {
        EncryChatRoomId = encryChatRoomId;
    }
}
