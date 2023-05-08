package dto.requests.chat;

import dto.modelsdto.GroupChatMemberInfoDTO;
import lombok.Data;

import java.util.List;

@Data
public class EditChatMemberRequest {
    private int idMemberRequestOwner;
    private int idChatMemberForEdit;
    private int idChat;
    private GroupChatMemberInfoDTO groupChatMemberInfoDTO;
}
