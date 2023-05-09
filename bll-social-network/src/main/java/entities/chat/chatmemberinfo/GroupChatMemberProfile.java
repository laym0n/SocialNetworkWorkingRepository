package entities.chat.chatmemberinfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupChatMemberProfile extends UserChatMemberInfo {
    private String chatMemberName;
}
