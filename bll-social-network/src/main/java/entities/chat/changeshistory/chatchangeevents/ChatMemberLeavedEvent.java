package entities.chat.changeshistory.chatchangeevents;

import entities.chat.changeshistory.ChatChangeEvent;
import entities.chat.changeshistory.ChatChangeEventType;

public class ChatMemberLeavedEvent extends ChatChangeEvent {
    private int idChatMember;

    public ChatMemberLeavedEvent(int idChatMember) {
        super(0, ChatChangeEventType.CHAT_MEMBER_LEAVED);
        this.idChatMember = idChatMember;
    }
}
