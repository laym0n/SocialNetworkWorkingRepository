package dto.requests;

import lombok.Data;

@Data
public class AddChatMemberRequest {
    private int idNewMember;
    private int idUserInviter;
}
