package entities.chat.chatimpl.groupchat;

import entities.chat.Chat;
import entities.chat.chatmemberinfo.GroupChatMember;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupChat extends Chat {
    private GroupChatInfo groupChatInfo;
    private List<GroupChatMember> members = new ArrayList<>();
}
