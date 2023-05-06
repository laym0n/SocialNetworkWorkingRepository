package entities.chat;

import entities.user.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatMember {
    private UserInfo userInfo;
    private Map<Integer, ChatMemberRole> roles;
    private int lastOrderIdOfCheckedMessage;
}
