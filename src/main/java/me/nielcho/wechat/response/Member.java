package me.nielcho.wechat.response;

public class Member {
    //    private long AttrStatus;
//    private String DisplayName;
//    private String KeyWord;
//    private int MemberStatus;
    private String NickName;
    private String PYInitial;
    //    private String PYQuanPin;
    private String RemarkPYInitial;
    //    private String RemarkPYQuanPin;
//    private int Uin;
    private String UserName;

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public String getPYInitial() {
        return PYInitial;
    }

    public void setPYInitial(String PYInitial) {
        this.PYInitial = PYInitial;
    }

    public String getRemarkPYInitial() {
        return RemarkPYInitial;
    }

    public void setRemarkPYInitial(String remarkPYInitial) {
        RemarkPYInitial = remarkPYInitial;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
