package me.nielcho.wechat.response;

public class MessageResponse {
    private String MsgId;
    private String FromUserName;
    private String ToUserName;
    private int MsgType;
    private String Content;
    //private long Status;
    //private int ImgStatus;
    private long CreateTime;
    //private int VoiceLength;
    //private int PlayLength;
    private String FileName;
    private String FileSize;
    private String MediaId;
    private String Url;
    private int AppMsgType;
    private int StatusNotifyCode;
    //private String StatusNotifyUserName;
    private String RecommendInfo;
    //private int ForwardFlag;
    //private int HasProductId;
    //private String Ticket;
    //private int ImgHeight;
    //private int ImgWidth;
    private int SubMsgType;
    //private String NewMsgId;
    //private String OriContent;
    //private AppInfo AppInfo;


    public String getMsgId() {
        return MsgId;
    }

    public void setMsgId(String msgId) {
        MsgId = msgId;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public int getMsgType() {
        return MsgType;
    }

    public void setMsgType(int msgType) {
        MsgType = msgType;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getFileSize() {
        return FileSize;
    }

    public void setFileSize(String fileSize) {
        FileSize = fileSize;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public int getAppMsgType() {
        return AppMsgType;
    }

    public void setAppMsgType(int appMsgType) {
        AppMsgType = appMsgType;
    }

    public int getStatusNotifyCode() {
        return StatusNotifyCode;
    }

    public void setStatusNotifyCode(int statusNotifyCode) {
        StatusNotifyCode = statusNotifyCode;
    }

    public String getRecommendInfo() {
        return RecommendInfo;
    }

    public void setRecommendInfo(String recommendInfo) {
        RecommendInfo = recommendInfo;
    }

    public int getSubMsgType() {
        return SubMsgType;
    }

    public void setSubMsgType(int subMsgType) {
        SubMsgType = subMsgType;
    }
}
