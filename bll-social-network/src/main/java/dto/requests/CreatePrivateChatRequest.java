package dto.requests;

import dto.modelsdto.PrivateChatInfoDTO;
import lombok.Data;

@Data
public class CreatePrivateChatRequest {
    private int idUserSenderRequest;
    private PrivateChatInfoDTO privateChatInfoDTO;
}
