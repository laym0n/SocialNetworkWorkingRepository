package dto.requests.chat;

import dto.modelsdto.GroupChatInfoDTO;
import lombok.Data;

@Data
public class CreateGroupChatRequest {
    private int idCUserCreator;
    private GroupChatInfoDTO groupChatInfoDTO;
    private String typeOfChat;
    private int[] simpleUsersIds;
}
