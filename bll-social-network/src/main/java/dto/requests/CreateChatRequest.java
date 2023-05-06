package dto.requests;

import lombok.Data;

import java.util.List;

@Data
public class CreateChatRequest {
    private String chatTitle;
    private int idCUserCreator;
    private List<Integer> idsUsersForAddToChat;
}
