package entities.chat.chatmemberinfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupChatMember extends UserChatMemberInfo {
    private GroupUserChatMemberInfo info;
}
