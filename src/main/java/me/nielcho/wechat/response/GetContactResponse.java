package me.nielcho.wechat.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class GetContactResponse {

    //    @JSONField(name = "Alias")
//    private String Alias;
//    @JSONField(name = "AppAccountFlag")
//    private int AppAccountFlag;
//    @JSONField(name = "AttrStatus")
//    private long AttrStatus;
//    @JSONField(name = "ChatRoomId")
//    private int ChatRoomId;
    @JSONField(name = "City")
    private String City;
    //    @JSONField(name = "ContactFlag")
//    private int ContactFlag;
//    @JSONField(name = "DisplayName")
//    private String DisplayName;
    @JSONField(name = "EncryChatRoomId")
    private String EncryChatRoomId;
    @JSONField(name = "HeadImgUrl")
    private String HeadImgUrl;
    //    @JSONField(name = "HideInputBarFlag")
//    private int HideInputBarFlag;
//    @JSONField(name = "IsOwner")
//    private int IsOwner;
//    @JSONField(name = "KeyWord")
//    private String KeyWord;
    @JSONField(name = "MemberCount")
    private int MemberCount;
    @JSONField(name = "MemberList")
    private List<Member> MemberList;
    @JSONField(name = "NickName")
    private String NickName;
    //    @JSONField(name = "OwnerUin")
//    private int OwnerUin;
    @JSONField(name = "PYInitial")
    private String PYInitial;
    //    @JSONField(name = "PYQuanPin")
//    private String PYQuanPin;
//    @JSONField(name = "Province")
//    private String Province;
    @JSONField(name = "RemarkName")
    private String RemarkName;
    @JSONField(name = "RemarkPYInitial")
    private String RemarkPYInitial;
    //    @JSONField(name = "RemarkPYQuanPin")
//    private String RemarkPYQuanPin;
    @JSONField(name = "Sex")
    private int Sex;
    @JSONField(name = "Signature")
    private String Signature;
    //    @JSONField(name = "SnsFlag")
//    private int SnsFlag;
//    @JSONField(name = "StarFriend")
//    private int StarFriend;
//    @JSONField(name = "Statues")
//    private int Statues;
//    @JSONField(name = "Uin")
//    private int Uin;
//    @JSONField(name = "UniFriend")
//    private int UniFriend;
    @JSONField(name = "UserName")
    private String UserName;
    @JSONField(name = "VerifyFlag")
    private int VerifyFlag;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getEncryChatRoomId() {
        return EncryChatRoomId;
    }

    public void setEncryChatRoomId(String encryChatRoomId) {
        EncryChatRoomId = encryChatRoomId;
    }

    public String getHeadImgUrl() {
        return HeadImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        HeadImgUrl = headImgUrl;
    }

    public int getMemberCount() {
        return MemberCount;
    }

    public void setMemberCount(int memberCount) {
        MemberCount = memberCount;
    }

    public List<Member> getMemberList() {
        return MemberList;
    }

    public void setMemberList(List<Member> memberList) {
        MemberList = memberList;
    }

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

    public String getRemarkName() {
        return RemarkName;
    }

    public void setRemarkName(String remarkName) {
        RemarkName = remarkName;
    }

    public String getRemarkPYInitial() {
        return RemarkPYInitial;
    }

    public void setRemarkPYInitial(String remarkPYInitial) {
        RemarkPYInitial = remarkPYInitial;
    }

    public int getSex() {
        return Sex;
    }

    public void setSex(int sex) {
        Sex = sex;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getVerifyFlag() {
        return VerifyFlag;
    }

    public void setVerifyFlag(int verifyFlag) {
        VerifyFlag = verifyFlag;
    }
}
