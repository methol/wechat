package me.nielcho.wechat.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Objects;

public class UploadMediaResponse extends BaseWxResponse {

    @JSONField(name = "MediaId")
    private String MediaId;
    @JSONField(name = "StartPos")
    private int StartPos;
    @JSONField(name = "CDNThumbImgHeight")
    private int CDNThumbImgHeight;
    @JSONField(name = "CDNThumbImgWidth")
    private int CDNThumbImgWidth;

    @Override
    public String toString() {
        return "UploadMediaResponse{" +
                "MediaId='" + MediaId + '\'' +
                ", StartPos=" + StartPos +
                ", CDNThumbImgHeight=" + CDNThumbImgHeight +
                ", CDNThumbImgWidth=" + CDNThumbImgWidth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UploadMediaResponse)) return false;
        UploadMediaResponse that = (UploadMediaResponse) o;
        return getStartPos() == that.getStartPos() &&
                getCDNThumbImgHeight() == that.getCDNThumbImgHeight() &&
                getCDNThumbImgWidth() == that.getCDNThumbImgWidth() &&
                Objects.equals(getMediaId(), that.getMediaId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMediaId(), getStartPos(), getCDNThumbImgHeight(), getCDNThumbImgWidth());
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public int getStartPos() {
        return StartPos;
    }

    public void setStartPos(int startPos) {
        StartPos = startPos;
    }

    public int getCDNThumbImgHeight() {
        return CDNThumbImgHeight;
    }

    public void setCDNThumbImgHeight(int CDNThumbImgHeight) {
        this.CDNThumbImgHeight = CDNThumbImgHeight;
    }

    public int getCDNThumbImgWidth() {
        return CDNThumbImgWidth;
    }

    public void setCDNThumbImgWidth(int CDNThumbImgWidth) {
        this.CDNThumbImgWidth = CDNThumbImgWidth;
    }
}
