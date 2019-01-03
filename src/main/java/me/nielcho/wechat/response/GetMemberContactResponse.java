package me.nielcho.wechat.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;
import java.util.Objects;

public class GetMemberContactResponse extends BaseWxResponse {
    @JSONField(name = "MemberList")
    private List<GetContactResponse> MemberList;
    @JSONField(name = "MemberCount")
    private int MemberCount;
    @JSONField(name = "Seq")
    private long seq;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetMemberContactResponse)) return false;
        GetMemberContactResponse that = (GetMemberContactResponse) o;
        return getMemberCount() == that.getMemberCount() &&
                getSeq() == that.getSeq() &&
                Objects.equals(getMemberList(), that.getMemberList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMemberList(), getMemberCount(), getSeq());
    }

    public List<GetContactResponse> getMemberList() {
        return MemberList;
    }

    public void setMemberList(List<GetContactResponse> memberList) {
        MemberList = memberList;
    }

    public int getMemberCount() {
        return MemberCount;
    }

    public void setMemberCount(int memberCount) {
        MemberCount = memberCount;
    }

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }
}
