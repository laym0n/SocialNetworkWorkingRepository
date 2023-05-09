package entities.chat.changeshistory.chatchangeevents;

import entities.chat.changeshistory.ChatChangeEvent;
import entities.chat.changeshistory.ChatChangeEventType;

public class ChatCreatedEvent extends ChatChangeEvent {

    public ChatCreatedEvent() {
        super(0, ChatChangeEventType.CHAT_CREATED);
    }
}
