package me.nielcho.wechat.response;

import java.util.List;

public class MPSubscribeMessageResponse {
    private int MPArticleCount;
    private List<MPArticleResponse> MPArticleList;
    private String NickName;
    private Long Time;
    private String UserName;

    public int getMPArticleCount() {
        return MPArticleCount;
    }

    public void setMPArticleCount(int MPArticleCount) {
        this.MPArticleCount = MPArticleCount;
    }

    public List<MPArticleResponse> getMPArticleList() {
        return MPArticleList;
    }

    public void setMPArticleList(List<MPArticleResponse> MPArticleList) {
        this.MPArticleList = MPArticleList;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public Long getTime() {
        return Time;
    }

    public void setTime(Long time) {
        Time = time;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
