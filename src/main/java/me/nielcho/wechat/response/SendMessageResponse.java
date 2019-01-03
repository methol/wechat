package me.nielcho.wechat.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Objects;

public class SendMessageResponse extends BaseWxResponse {
    @JSONField(name = "LocalID")
    private String LocalID;
    @JSONField(name = "MsgID")
    private String MsgID;
    private Long createTime;
    private String fileName;
    private String url;
    private Long fileSize;
    private int msgType;
    private int appMsgType;
    private int subMsgType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SendMessageResponse)) return false;
        SendMessageResponse that = (SendMessageResponse) o;
        return getMsgType() == that.getMsgType() &&
                getAppMsgType() == that.getAppMsgType() &&
                getSubMsgType() == that.getSubMsgType() &&
                Objects.equals(getLocalID(), that.getLocalID()) &&
                Objects.equals(getMsgID(), that.getMsgID()) &&
                Objects.equals(getCreateTime(), that.getCreateTime()) &&
                Objects.equals(getFileName(), that.getFileName()) &&
                Objects.equals(getUrl(), that.getUrl()) &&
                Objects.equals(getFileSize(), that.getFileSize());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLocalID(), getMsgID(), getCreateTime(), getFileName(), getUrl(), getFileSize(), getMsgType(), getAppMsgType(), getSubMsgType());
    }

    public String getLocalID() {
        return LocalID;
    }

    public void setLocalID(String localID) {
        LocalID = localID;
    }

    public String getMsgID() {
        return MsgID;
    }

    public void setMsgID(String msgID) {
        MsgID = msgID;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public int getAppMsgType() {
        return appMsgType;
    }

    public void setAppMsgType(int appMsgType) {
        this.appMsgType = appMsgType;
    }

    public int getSubMsgType() {
        return subMsgType;
    }

    public void setSubMsgType(int subMsgType) {
        this.subMsgType = subMsgType;
    }
}
