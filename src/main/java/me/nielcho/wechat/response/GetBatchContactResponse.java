package me.nielcho.wechat.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;
import java.util.Objects;


public class GetBatchContactResponse extends BaseWxResponse {
    @JSONField(name = "ContactList")
    private List<GetContactResponse> ContactList;
    @JSONField(name = "Count")
    private int Count;

    public List<GetContactResponse> getContactList() {
        return ContactList;
    }

    public void setContactList(List<GetContactResponse> contactList) {
        ContactList = contactList;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetBatchContactResponse)) return false;
        GetBatchContactResponse that = (GetBatchContactResponse) o;
        return getCount() == that.getCount() &&
                Objects.equals(getContactList(), that.getContactList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContactList(), getCount());
    }

    @Override
    public String toString() {
        return "GetBatchContactResponse{" +
                "ContactList=" + ContactList +
                ", Count=" + Count +
                '}';
    }
}
