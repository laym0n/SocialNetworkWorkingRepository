package dto.responses;

import entities.chat.Chat;
import lombok.Data;

import java.util.List;

@Data
public class GetChatsResponse {
    public GetChatsResponse(List<Chat> chatForUser) {
    }
}
