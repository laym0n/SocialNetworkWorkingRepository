package entities.chat.changeshistory.chatchangeevents;

import entities.administrateentities.Ban;
import entities.chat.changeshistory.ChatChangeEvent;
import entities.chat.changeshistory.ChatChangeEventType;

import java.util.List;

public class ChatDeletedEvent extends ChatChangeEvent {
    public ChatDeletedEvent() {
        super(0, ChatChangeEventType.CHAT_DELETED);
    }
}
