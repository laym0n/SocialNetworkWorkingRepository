package dto.requests;

import lombok.Data;

@Data
public class DeletePrivateChatRequest {
    private int idUserSenderRequest;
    private int idPrivateChat;
}
