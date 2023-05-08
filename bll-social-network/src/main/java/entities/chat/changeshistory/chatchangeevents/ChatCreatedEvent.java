package entities.chat.changeshistory.chatchangeevents;

import entities.chat.changeshistory.ChatChangeEvent;
import entities.chat.changeshistory.ChatChangeEventType;

public class ChatCreatedEvent extends ChatChangeEvent {
    private int idUserCreator;

    public ChatCreatedEvent(int idUserCreator) {
        super(0, ChatChangeEventType.CHAT_CREATED);
        this.idUserCreator = idUserCreator;
    }
}
