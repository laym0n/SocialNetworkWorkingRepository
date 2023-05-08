package entities.chat.changeshistory.chatchangeevents;

import entities.chat.changeshistory.ChatChangeEvent;
import entities.chat.changeshistory.ChatChangeEventType;

public class ChatMessageEditedEvent extends ChatChangeEvent {
    private int orderIdMessage;

    public ChatMessageEditedEvent(int orderIdMessage) {
        super(0, ChatChangeEventType.MESSAGE_EDITED);
        this.orderIdMessage = orderIdMessage;
    }
}
