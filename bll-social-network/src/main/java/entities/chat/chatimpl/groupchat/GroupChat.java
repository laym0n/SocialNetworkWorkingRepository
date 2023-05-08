package entities.chat.chatimpl.groupchat;

import entities.chat.GroupChatMember;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupChat {
    private GroupChatInfo groupChatInfo;
    private Map<Integer, GroupChatMember> members = new HashMap<>();

    public GroupChat(GroupChatInfo groupChatInfo) {
        this.groupChatInfo = groupChatInfo;
    }
}
