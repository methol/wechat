package me.nielcho.wechat.response;

import java.util.Objects;

public class InitResponse extends BaseWxResponse {
    
//    int Count;
    private String ChatSet;
//    int ClickReportInterval;
//    int ClientVersion;
//    List<GetContactResponse> ContactList;
//    int GrayScale;
//    int InviteStartCount;
//    int MPSubscribeMsgCount;
//    String SKey;
    private SyncKey SyncKey;
//    Long SystemTime;
    private UserResponse User;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InitResponse)) return false;
        InitResponse that = (InitResponse) o;
        return Objects.equals(getChatSet(), that.getChatSet()) &&
                Objects.equals(getSyncKey(), that.getSyncKey()) &&
                Objects.equals(getUser(), that.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChatSet(), getSyncKey(), getUser());
    }

    public String getChatSet() {
        return ChatSet;
    }

    public void setChatSet(String chatSet) {
        ChatSet = chatSet;
    }

    public me.nielcho.wechat.response.SyncKey getSyncKey() {
        return SyncKey;
    }

    public void setSyncKey(me.nielcho.wechat.response.SyncKey syncKey) {
        SyncKey = syncKey;
    }

    public UserResponse getUser() {
        return User;
    }

    public void setUser(UserResponse user) {
        User = user;
    }
}
