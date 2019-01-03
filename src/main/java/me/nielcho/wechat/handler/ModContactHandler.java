package me.nielcho.wechat.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.nielcho.wechat.context.WeChatContext;
import me.nielcho.wechat.domain.ContactInfo;
import me.nielcho.wechat.repository.ContactRepository;
import me.nielcho.wechat.response.ModContact;

import java.util.function.BiConsumer;

@Component
public class ModContactHandler implements BiConsumer<WeChatContext, ModContact> {

    private static final Logger log = LoggerFactory.getLogger(ModContactHandler.class);


    @Autowired
    private ContactRepository contactRepository;

    @Override
    public void accept(WeChatContext context, ModContact modContact) {
        ContactInfo current = ContactInfo.fromModContact(context, modContact);
        String username = current.getUsername();
        ContactInfo previous = contactRepository.getContact(context.getUin(), username);
        log.info("[x] |{}| 收到联系人变更信息:{} -> {}", context.getUin(), previous, current);
    }

}
