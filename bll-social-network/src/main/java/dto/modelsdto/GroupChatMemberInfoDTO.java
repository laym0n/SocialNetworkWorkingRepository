package dto.modelsdto;

import entities.chat.chatmemberinfo.GroupUserChatMemberInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupChatMemberInfoDTO {
    private List<String> newRolesForChatMember;

    public GroupUserChatMemberInfo getGroupChatMemberInfo() {
        return null;
    }
}
