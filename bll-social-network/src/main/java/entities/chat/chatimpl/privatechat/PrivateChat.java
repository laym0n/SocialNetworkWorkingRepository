package entities.chat.chatimpl.privatechat;

import entities.chat.Chat;
import entities.chat.ChatMember;
import entities.user.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrivateChat extends Chat {
    private ChatMember ownerChat;
    private PrivateChatInfo info;
}
