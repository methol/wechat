package me.nielcho.wechat.request;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

public class AddContactRequest {
    @JSONField(name = "BaseRequest")
    private BaseRequest BaseRequest;
    @JSONField(name = "Opcode")
    private int Opcode;
    @JSONField(name = "SceneList")
    private List<Integer> SceneList;
    @JSONField(name = "SceneListCount")
    private int SceneListCount;
    @JSONField(name = "VerifyContent")
    private String VerifyContent;
    @JSONField(name = "VerifyUserListSize")
    private int VerifyUserListSize;
    @JSONField(name = "VerifyUserList")
    private List<VerifyUserRequest> VerifyUserList;
    @JSONField(name = "skey")
    private String skey;

    public me.nielcho.wechat.request.BaseRequest getBaseRequest() {
        return BaseRequest;
    }

    public void setBaseRequest(me.nielcho.wechat.request.BaseRequest baseRequest) {
        BaseRequest = baseRequest;
    }

    public int getOpcode() {
        return Opcode;
    }

    public void setOpcode(int opcode) {
        Opcode = opcode;
    }

    public List<Integer> getSceneList() {
        return SceneList;
    }

    public void setSceneList(List<Integer> sceneList) {
        SceneList = sceneList;
    }

    public int getSceneListCount() {
        return SceneListCount;
    }

    public void setSceneListCount(int sceneListCount) {
        SceneListCount = sceneListCount;
    }

    public String getVerifyContent() {
        return VerifyContent;
    }

    public void setVerifyContent(String verifyContent) {
        VerifyContent = verifyContent;
    }

    public int getVerifyUserListSize() {
        return VerifyUserListSize;
    }

    public void setVerifyUserListSize(int verifyUserListSize) {
        VerifyUserListSize = verifyUserListSize;
    }

    public List<VerifyUserRequest> getVerifyUserList() {
        return VerifyUserList;
    }

    public void setVerifyUserList(List<VerifyUserRequest> verifyUserList) {
        VerifyUserList = verifyUserList;
    }

    public String getSkey() {
        return skey;
    }

    public void setSkey(String skey) {
        this.skey = skey;
    }
}
