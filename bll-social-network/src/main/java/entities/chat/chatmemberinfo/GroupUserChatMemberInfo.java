package entities.chat.chatmemberinfo;

import entities.chat.chatimpl.groupchat.ChatMemberRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupUserChatMemberInfo extends UserChatMemberInfo {
    private String chatMemberName;
    private Map<Integer, ChatMemberRole> roles;
}
