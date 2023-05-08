package entities.chat.chatmemberinfo;

import entities.user.UserInfo;
import lombok.Data;

@Data
public class UserChatMemberInfo extends ChatMemberInfo {
    private UserInfo userInfo;
}
