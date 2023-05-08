package entities.chat;

import entities.user.UserInfo;
import lombok.Data;

@Data
public class UserChatMember extends ChatMember {
    private UserInfo userInfo;
}
