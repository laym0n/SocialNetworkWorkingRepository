package dto.requests;

import dto.modelsdto.messages.BanDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KickOutChatMemberRequest {
    private int idOwnerRequest;
    private int idUser;
    private int idChat;
    private BanDTO banDTO;
}
