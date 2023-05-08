package entities.chat;

import entities.user.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupChatMember extends UserChatMember {
    private GroupChatMemberInfo info;
}
