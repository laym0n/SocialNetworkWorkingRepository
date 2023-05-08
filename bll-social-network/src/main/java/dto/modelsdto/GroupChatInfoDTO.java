package dto.modelsdto;

import entities.chat.chatimpl.groupchat.GroupChatInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupChatInfoDTO {
    private String chatTitle;
    private byte[] avatar;

    public GroupChatInfo getChatInfo() {
        return new GroupChatInfo(chatTitle, avatar);
    }
}
