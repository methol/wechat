package me.nielcho.wechat.response;

import java.util.List;

public class SyncResponse extends BaseWxResponse {

    //int continueFlag;
    //String SKey;

    private int ModContactCount;
    private List<ModContact> ModContactList;
    private int DelContactCount;
    private List<DelContact> DelContactList;
    //int ModChatRoomMemberCount;
    //List<JSONObject> ModChatRoomMemberList;
    private int AddMsgCount;
    private List<MessageResponse> AddMsgList;

    //Profile Profile;
    //SyncKey SyncCheckKey;
    private SyncKey SyncKey;

    public int getModContactCount() {
        return ModContactCount;
    }

    public void setModContactCount(int modContactCount) {
        ModContactCount = modContactCount;
    }

    public List<ModContact> getModContactList() {
        return ModContactList;
    }

    public void setModContactList(List<ModContact> modContactList) {
        ModContactList = modContactList;
    }

    public int getDelContactCount() {
        return DelContactCount;
    }

    public void setDelContactCount(int delContactCount) {
        DelContactCount = delContactCount;
    }

    public List<DelContact> getDelContactList() {
        return DelContactList;
    }

    public void setDelContactList(List<DelContact> delContactList) {
        DelContactList = delContactList;
    }

    public int getAddMsgCount() {
        return AddMsgCount;
    }

    public void setAddMsgCount(int addMsgCount) {
        AddMsgCount = addMsgCount;
    }

    public List<MessageResponse> getAddMsgList() {
        return AddMsgList;
    }

    public void setAddMsgList(List<MessageResponse> addMsgList) {
        AddMsgList = addMsgList;
    }

    public me.nielcho.wechat.response.SyncKey getSyncKey() {
        return SyncKey;
    }

    public void setSyncKey(me.nielcho.wechat.response.SyncKey syncKey) {
        SyncKey = syncKey;
    }
}
