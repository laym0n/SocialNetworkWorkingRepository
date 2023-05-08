package entities.chat.changeshistory.chatchangeevents;

import entities.chat.changeshistory.ChatChangeEvent;
import entities.chat.changeshistory.ChatChangeEventType;
import lombok.Data;

@Data
public class ChatMessageDeletedEvent extends ChatChangeEvent {
    private int orderIdMessage;

    public ChatMessageDeletedEvent(int orderIdMessage) {
        super(0, ChatChangeEventType.MESSAGE_DELETED);
        this.orderIdMessage = orderIdMessage;
    }
}
