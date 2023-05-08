package entities.chat.changeshistory.chatchangeevents;

import entities.chat.changeshistory.ChatChangeEvent;
import entities.chat.changeshistory.ChatChangeEventType;

public class NewChatMemberAddedEvent extends ChatChangeEvent {
    private int idNewChatMember;

    public NewChatMemberAddedEvent(int idNewChatMember) {
        super(0, ChatChangeEventType.NEW_CHAT_MEMBER_ADDED);
        this.idNewChatMember = idNewChatMember;
    }
}
