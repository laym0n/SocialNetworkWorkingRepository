package entities.chat;

import lombok.Data;

@Data
public class ChatMember {
    private int lastOrderIdOfCheckedEvent;
    private int lastOrderIdOfCheckedMessage;
}
