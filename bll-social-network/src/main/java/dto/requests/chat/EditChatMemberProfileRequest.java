package dto.requests.chat;

import dto.modelsdto.GroupChatMemberInfoDTO;
import lombok.Data;

@Data
public class EditChatMemberProfileRequest {
    private int idMemberRequestOwner;
    private int idChatMemberForEdit;
    private int idChat;
    private GroupChatMemberInfoDTO groupChatMemberInfoDTO;
}
