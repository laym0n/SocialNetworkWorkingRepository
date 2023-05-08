package usecases.chatsusecases.impl.manageprivatechats;

import daservices.ManagePrivateChatsDAService;
import dto.requests.CreatePrivateChatRequest;
import dto.requests.DeletePrivateChatRequest;
import dto.requests.EditPrivateChatRequest;
import entities.chat.chatimpl.privatechat.PrivateChat;
import entities.chat.chatimpl.privatechat.PrivateChatInfo;
import usecases.chatsusecases.ManagePrivateChatsUseCase;

public class ManagePrivateChatsUseCaseImpl implements ManagePrivateChatsUseCase {
    private ManagePrivateChatsDAService daService;

    @Override
    public PrivateChat createPrivateChat(CreatePrivateChatRequest request) {
        PrivateChat privateChat = daService.createPrivateChatForUser(
                request.getIdUserSenderRequest(),
                request.getPrivateChatInfoDTO().getPrivateChatInfo()
        );
        return privateChat;
    }

    @Override
    public void deletePrivateChat(DeletePrivateChatRequest request) {
        daService.deletePrivateChatWithUser(request.getIdPrivateChat(), request.getIdUserSenderRequest());
    }

    @Override
    public PrivateChatInfo editPrivateChat(EditPrivateChatRequest request) {
        PrivateChatInfo newInfo = daService.updatePrivatChatInfo(
                request.getIdUserSender(),
                request.getChatId(),
                request.getNewInfo().getPrivateChatInfo()
        );
        return newInfo;
    }
}
