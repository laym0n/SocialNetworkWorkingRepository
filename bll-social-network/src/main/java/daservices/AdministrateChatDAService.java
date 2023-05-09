package daservices;

import entities.administrateentities.Ban;
import entities.chat.changeshistory.chatchangeevents.ChatMemberBlockedEvent;
import entities.chat.changeshistory.chatchangeevents.ChatMemberChangedInfoEvent;
import entities.chat.changeshistory.chatchangeevents.ChatMessageBlockedEvent;
import entities.chat.chatimpl.groupchat.ChatMemberRole;

import java.util.Map;

public interface AdministrateChatDAService {
    void blockMessageAndSaveEvent(Ban messageBan, int idChat, int orderIdMessage, ChatMessageBlockedEvent event);

    void blockChatMemberAndSaveEvent(Ban chatMemberBan, int idChat, int idUser, ChatMemberBlockedEvent event);

    void updateRolesForChatMemberAndSaveEvent(int idChatMemberForChangeRoles, int chatId, Map<Integer, ChatMemberRole> newRoles, ChatMemberChangedInfoEvent event);

    Map<Integer, ChatMemberRole> findRolesOfChatMember(int idUserSenderRequest, int chatId);
}
