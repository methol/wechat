package me.nielcho.wechat.domain;

import me.nielcho.wechat.constants.WeChatConstants;
import me.nielcho.wechat.context.WeChatContext;
import me.nielcho.wechat.predicate.ContactPredicate;
import me.nielcho.wechat.response.GetContactResponse;
import me.nielcho.wechat.response.Member;
import me.nielcho.wechat.response.ModContact;
import me.nielcho.wechat.util.WeChatUtil;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.util.StringUtils;

import java.beans.Transient;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ContactInfo {
    private String username;
    private String aid;
    private String nickname;
    private String remarkName;
    private String chatroomId;
    private String icon;
    private String pyInitial;
    private String remarkPyInitial;
    private List<ContactInfo> members;

    @Transient
    public boolean isGroup() {
        return ContactPredicate.isGroupContact(username);
    }

    private static void processEmptySkey(String skey, ContactInfo contactInfo) {
        String icon = contactInfo.getIcon();
        Map<String, String> queryString = WeChatUtil.getQueryString(icon);
        if (queryString.get("skey") == null) {
            contactInfo.setIcon(icon.replace("skey=", "skey=" + skey + "&"));
        }
    }

    private static void processGroup(ContactInfo contactInfo, List<Member> members) {
        if (CollectionUtils.isEmpty(members)) return;
        boolean isGroup = ContactPredicate.isGroupContact(contactInfo.getUsername());
        if (isGroup) {
            if (StringUtils.isEmpty(contactInfo.getNickname())) {
                contactInfo.setNickname(members.stream().map(Member::getNickName).collect(Collectors.joining("、")));
            }
        }
    }

    public static ContactInfo fromGetContactResponse(WeChatContext context, GetContactResponse getContactResponse) {
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setUsername(getContactResponse.getUserName());
        contactInfo.setNickname(getContactResponse.getNickName());
        contactInfo.setRemarkName(getContactResponse.getRemarkName());
        contactInfo.setChatroomId(getContactResponse.getEncryChatRoomId());
        contactInfo.setIcon(getContactResponse.getHeadImgUrl());
        contactInfo.setPyInitial(getContactResponse.getPYInitial());
        contactInfo.setRemarkPyInitial(getContactResponse.getRemarkPYInitial());
        if (CollectionUtils.isNotEmpty(getContactResponse.getMemberList())) {
            List<ContactInfo> members = getContactResponse.getMemberList().stream().map(member -> fromMemberResponse(context, getContactResponse, member)).collect(Collectors.toList());
            contactInfo.setMembers(members);
        }
        processEmptySkey(context.getSkey(), contactInfo);


        processGroup(contactInfo, getContactResponse.getMemberList());
        return contactInfo;
    }

    public static ContactInfo fromModContact(WeChatContext context, ModContact modContact) {
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setUsername(modContact.getUserName());
        contactInfo.setNickname(modContact.getNickName());
        contactInfo.setRemarkName(modContact.getRemarkName());
        contactInfo.setIcon(modContact.getHeadImgUrl());
        processEmptySkey(context.getSkey(), contactInfo);
        processGroup(contactInfo, modContact.getMemberList());
        return contactInfo;
    }

    private static ContactInfo fromMemberResponse(WeChatContext context, GetContactResponse getContactResponse, Member member) {
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setUsername(member.getUserName());
        contactInfo.setNickname(member.getNickName());
        contactInfo.setPyInitial(member.getPYInitial());
        contactInfo.setRemarkPyInitial(member.getRemarkPYInitial());
        contactInfo.setChatroomId(getContactResponse.getEncryChatRoomId());
        String encryChatRoomId = getContactResponse.getEncryChatRoomId();
        Map<String, Object> params = new HashMap<>();
        params.put("seq", 0);
        params.put("username", member.getUserName());
        params.put("skey", context.getSkey());
        params.put("chatroomid", encryChatRoomId);
        String icon = WeChatUtil.format(WeChatConstants.WX_GET_ICON, params);
        contactInfo.setIcon(icon);
        processGroup(contactInfo, getContactResponse.getMemberList());
        return contactInfo;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (!(object instanceof ContactInfo)) return false;
        ContactInfo another = (ContactInfo) object;
        return Objects.equals(this.getUsername(), another.getUsername())
                && Objects.equals(this.getNickname(), another.getNickname())
                && Objects.equals(this.getRemarkName(), another.getRemarkName())
                && Objects.equals(this.getAid(), another.getAid());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRemarkName() {
        return remarkName;
    }

    public void setRemarkName(String remarkName) {
        this.remarkName = remarkName;
    }

    public String getChatroomId() {
        return chatroomId;
    }

    public void setChatroomId(String chatroomId) {
        this.chatroomId = chatroomId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPyInitial() {
        return pyInitial;
    }

    public void setPyInitial(String pyInitial) {
        this.pyInitial = pyInitial;
    }

    public String getRemarkPyInitial() {
        return remarkPyInitial;
    }

    public void setRemarkPyInitial(String remarkPyInitial) {
        this.remarkPyInitial = remarkPyInitial;
    }

    public List<ContactInfo> getMembers() {
        return members;
    }

    public void setMembers(List<ContactInfo> members) {
        this.members = members;
    }
}
