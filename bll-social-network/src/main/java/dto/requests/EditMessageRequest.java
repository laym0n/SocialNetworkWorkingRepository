package dto.requests;

import dto.modelsdto.messages.MessageDTO;
import lombok.Data;

@Data
public class EditMessageRequest {
    private int userId;
    private MessageDTO messageDTO;
    private int idChat;
}
