package entities.chat;

import entities.chat.chatimpl.groupchat.ChatMemberRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupChatMemberInfo {
    private Map<Integer, ChatMemberRole> roles;
}
