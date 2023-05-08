package dto.requests;

import dto.modelsdto.PrivateChatInfoDTO;
import lombok.Data;

@Data
public class EditPrivateChatRequest {
    private int idUserSender;
    private int chatId;
    private PrivateChatInfoDTO newInfo;
}
