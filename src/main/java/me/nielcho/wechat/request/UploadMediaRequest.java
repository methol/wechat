package me.nielcho.wechat.request;

import com.alibaba.fastjson.annotation.JSONField;

public class UploadMediaRequest {
    @JSONField(name = "BaseRequest")
    private BaseRequest BaseRequest;
    @JSONField(name = "ClientMediaId")
    private long ClientMediaId;
    @JSONField(name = "TotalLen")
    private long TotalLen;
    @JSONField(name = "StartPos")
    private int StartPos;
    @JSONField(name = "DataLen")
    private long DataLen;
    @JSONField(name = "MediaType")
    private int MediaType;
    @JSONField(name = "UploadType")
    private int UploadType;
    @JSONField(name = "FileMd5")
    private String FileMd5;

    public me.nielcho.wechat.request.BaseRequest getBaseRequest() {
        return BaseRequest;
    }

    public void setBaseRequest(me.nielcho.wechat.request.BaseRequest baseRequest) {
        BaseRequest = baseRequest;
    }

    public long getClientMediaId() {
        return ClientMediaId;
    }

    public void setClientMediaId(long clientMediaId) {
        ClientMediaId = clientMediaId;
    }

    public long getTotalLen() {
        return TotalLen;
    }

    public void setTotalLen(long totalLen) {
        TotalLen = totalLen;
    }

    public int getStartPos() {
        return StartPos;
    }

    public void setStartPos(int startPos) {
        StartPos = startPos;
    }

    public long getDataLen() {
        return DataLen;
    }

    public void setDataLen(long dataLen) {
        DataLen = dataLen;
    }

    public int getMediaType() {
        return MediaType;
    }

    public void setMediaType(int mediaType) {
        MediaType = mediaType;
    }

    public int getUploadType() {
        return UploadType;
    }

    public void setUploadType(int uploadType) {
        UploadType = uploadType;
    }

    public String getFileMd5() {
        return FileMd5;
    }

    public void setFileMd5(String fileMd5) {
        FileMd5 = fileMd5;
    }
}
