package dto.requests;

import lombok.Data;

@Data
public class EditChatRequest {
    private String newTitle;
    private int idMemberRequestOwner;
}
