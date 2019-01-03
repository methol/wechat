package me.nielcho.wechat.response;

import java.util.List;


public class ModContact {
    String UserName;

    //    int ContactType;
    List<Member> MemberList;
    String HeadImgUrl;
    int Sex;
    //    int MemberCount;
//    long AttrStatus;
//    int Statues;
    String City;
    String NickName;
    //    String Province;
//    int SnsFlag;
//    String Alias;
//    String KeyWord;
//    String ChatRoomOwner;
//    int HideInputBarFlag;
    String Signature;
    String RemarkName;
//    int HeadImgUpdateFlag;
//    int VerifyFlag;
    // 目前猜测来看, 1是保存的联系人, 2是未保存的群聊, 3是保存的群聊
//    int ContactFlag;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public List<Member> getMemberList() {
        return MemberList;
    }

    public void setMemberList(List<Member> memberList) {
        MemberList = memberList;
    }

    public String getHeadImgUrl() {
        return HeadImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        HeadImgUrl = headImgUrl;
    }

    public int getSex() {
        return Sex;
    }

    public void setSex(int sex) {
        Sex = sex;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }

    public String getRemarkName() {
        return RemarkName;
    }

    public void setRemarkName(String remarkName) {
        RemarkName = remarkName;
    }
}
