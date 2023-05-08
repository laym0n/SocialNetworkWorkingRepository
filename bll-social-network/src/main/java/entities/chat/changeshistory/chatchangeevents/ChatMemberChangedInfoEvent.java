package entities.chat.changeshistory.chatchangeevents;

import entities.chat.changeshistory.ChatChangeEvent;
import entities.chat.changeshistory.ChatChangeEventType;
import lombok.Data;

@Data
public class ChatMemberChangedInfoEvent extends ChatChangeEvent {
    private int idChatMember;

    public ChatMemberChangedInfoEvent(int idChatMember) {
        super(0, ChatChangeEventType.CHAT_MEMBER_CHANGED_INFO);
        this.idChatMember = idChatMember;
    }
}
