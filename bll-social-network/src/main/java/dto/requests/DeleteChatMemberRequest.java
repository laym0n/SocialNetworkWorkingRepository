package dto.requests;

import lombok.Data;

@Data
public class DeleteChatMemberRequest {
    private int idMemberForDelete;
    private int idMemberOwnerRequest;
}
