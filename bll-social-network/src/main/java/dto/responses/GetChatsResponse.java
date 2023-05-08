package dto.responses;

import entities.chat.chatimpl.groupchat.GroupChat;
import lombok.Data;

import java.util.List;

@Data
public class GetChatsResponse {
    public GetChatsResponse(List<GroupChat> groupChatForUser) {
    }
}
