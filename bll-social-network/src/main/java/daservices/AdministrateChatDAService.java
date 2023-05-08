package daservices;

import entities.administrateentities.Ban;
import entities.chat.changeshistory.chatchangeevents.ChatMemberBlockedEvent;
import entities.chat.changeshistory.chatchangeevents.ChatMessageBlockedEvent;

public interface AdministrateChatDAService {
    void blockMessageAndSaveEvent(Ban messageBan, int idChat, int orderIdMessage, ChatMessageBlockedEvent event);

    void blockChatMemberAndSaveEvent(Ban chatMemberBan, int idChat, int idUser, ChatMemberBlockedEvent event);
}
