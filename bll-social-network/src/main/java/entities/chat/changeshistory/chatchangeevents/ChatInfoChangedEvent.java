package entities.chat.changeshistory.chatchangeevents;

import entities.chat.changeshistory.ChatChangeEvent;
import entities.chat.changeshistory.ChatChangeEventType;

public class ChatInfoChangedEvent extends ChatChangeEvent {

    public ChatInfoChangedEvent() {
        super(0, ChatChangeEventType.CHAT_INFO_CHANGED);
    }
}
