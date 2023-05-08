package dto.modelsdto.messages;

import entities.chat.messages.Message;
import entities.chat.messages.MessageType;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public abstract class MessageDTO {
    protected int chatId;
    protected int orderIdOfChangeEvent;
    protected OffsetDateTime createdAt;
    protected String messageType;

    public abstract Message getMessage();
}
