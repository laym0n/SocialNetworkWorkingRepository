package dto.requests;

import dto.modelsdto.messages.MessageDTO;
import lombok.Data;

@Data
public class SendMessageRequest {
    private MessageDTO messageDTO;
    private int chatId;
}
