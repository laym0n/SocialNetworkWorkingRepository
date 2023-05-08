package usecases.chatsusecases;

import dto.requests.CreatePrivateChatRequest;
import dto.requests.DeletePrivateChatRequest;
import dto.requests.EditPrivateChatRequest;
import entities.chat.chatimpl.privatechat.PrivateChat;
import entities.chat.chatimpl.privatechat.PrivateChatInfo;

public interface ManagePrivateChatsUseCase {
    PrivateChat createPrivateChat(CreatePrivateChatRequest request);

    void deletePrivateChat(DeletePrivateChatRequest request);

    PrivateChatInfo editPrivateChat(EditPrivateChatRequest request);
}
