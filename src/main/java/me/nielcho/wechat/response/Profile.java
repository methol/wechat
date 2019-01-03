package me.nielcho.wechat.response;

public class Profile {
    private Buff UserName;
    private String HeadImgUrl;
    private int Sex;
    private int PersonalCard;
    private Buff NickName;
    private Buff BindEmail;
    private int BitFlag;
    private String alias;
    private String Signature;
    private Long BindUin;
    private int HeadImgUpdatedFlag;
    private Buff BindMobile;

    public Buff getUserName() {
        return UserName;
    }

    public void setUserName(Buff userName) {
        UserName = userName;
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

    public int getPersonalCard() {
        return PersonalCard;
    }

    public void setPersonalCard(int personalCard) {
        PersonalCard = personalCard;
    }

    public Buff getNickName() {
        return NickName;
    }

    public void setNickName(Buff nickName) {
        NickName = nickName;
    }

    public Buff getBindEmail() {
        return BindEmail;
    }

    public void setBindEmail(Buff bindEmail) {
        BindEmail = bindEmail;
    }

    public int getBitFlag() {
        return BitFlag;
    }

    public void setBitFlag(int bitFlag) {
        BitFlag = bitFlag;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }

    public Long getBindUin() {
        return BindUin;
    }

    public void setBindUin(Long bindUin) {
        BindUin = bindUin;
    }

    public int getHeadImgUpdatedFlag() {
        return HeadImgUpdatedFlag;
    }

    public void setHeadImgUpdatedFlag(int headImgUpdatedFlag) {
        HeadImgUpdatedFlag = headImgUpdatedFlag;
    }

    public Buff getBindMobile() {
        return BindMobile;
    }

    public void setBindMobile(Buff bindMobile) {
        BindMobile = bindMobile;
    }
}
