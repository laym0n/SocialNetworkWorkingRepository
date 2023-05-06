package dto.requests;

import lombok.Data;

import java.util.List;

@Data
public class EditChatMemberRequest {
    private List<String> newRolesForChatMember;
    private int idMemberRequestOwner;
}
