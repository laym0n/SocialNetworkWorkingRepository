package entities.chat.changeshistory.chatchangeevents;

import entities.chat.changeshistory.ChatChangeEvent;
import entities.chat.changeshistory.ChatChangeEventType;

public class ChatNewMessageSentEvent extends ChatChangeEvent {

    public ChatNewMessageSentEvent() {
        super(0, ChatChangeEventType.NEW_MESSAGE_WAS_SENT);
    }
}
