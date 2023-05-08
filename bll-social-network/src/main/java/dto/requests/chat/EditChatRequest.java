package dto.requests.chat;

import dto.modelsdto.GroupChatInfoDTO;
import lombok.Data;

@Data
public class EditChatRequest {
    private int idMemberRequestOwner;
    private int idChat;
    private GroupChatInfoDTO newGroupChatInfoDTO;
}
