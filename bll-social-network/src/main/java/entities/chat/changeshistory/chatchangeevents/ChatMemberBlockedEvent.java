package entities.chat.changeshistory.chatchangeevents;

import entities.chat.changeshistory.ChatChangeEvent;
import entities.chat.changeshistory.ChatChangeEventType;

public class ChatMemberBlockedEvent extends ChatChangeEvent {
    private int idChat;
    private int idUser;

    public ChatMemberBlockedEvent(int idChat, int idUser) {
        super(0, ChatChangeEventType.CHAT_MEMBER_BLOCKED);
        this.idChat = idChat;
        this.idUser = idUser;
    }
}
