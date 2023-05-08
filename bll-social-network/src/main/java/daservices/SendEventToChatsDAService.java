package daservices;

import entities.chat.changeshistory.chatchangeevents.ChatMemberChangedInfoEvent;

public interface SendEventToChatsDAService {
    void addEventToAllChatsWithUserByUserId(ChatMemberChangedInfoEvent event, int idUser);
}
