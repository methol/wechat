package me.nielcho.wechat.request;

import java.util.List;

public class StatReportRequest {
    private BaseRequest BaseRequest;
    private Integer Count = 1;
    private List<Info> List;

    public me.nielcho.wechat.request.BaseRequest getBaseRequest() {
        return BaseRequest;
    }

    public void setBaseRequest(me.nielcho.wechat.request.BaseRequest baseRequest) {
        BaseRequest = baseRequest;
    }

    public Integer getCount() {
        return Count;
    }

    public void setCount(Integer count) {
        Count = count;
    }

    public java.util.List<Info> getList() {
        return List;
    }

    public void setList(java.util.List<Info> list) {
        List = list;
    }

    public static class Info {
        private Integer Type = 1;
        private String Text;

        public Integer getType() {
            return Type;
        }

        public void setType(Integer type) {
            Type = type;
        }

        public String getText() {
            return Text;
        }

        public void setText(String text) {
            Text = text;
        }
    }
}
