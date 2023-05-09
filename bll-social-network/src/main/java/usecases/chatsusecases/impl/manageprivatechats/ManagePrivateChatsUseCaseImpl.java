package usecases.chatsusecases.impl.manageprivatechats;

import daservices.ManagePrivateChatsDAService;
import dto.requests.CreatePrivateChatRequest;
import dto.requests.DeletePrivateChatRequest;
import dto.requests.EditPrivateChatRequest;
import entities.chat.changeshistory.chatchangeevents.ChatCreatedEvent;
import entities.chat.changeshistory.chatchangeevents.ChatDeletedEvent;
import entities.chat.changeshistory.chatchangeevents.ChatInfoChangedEvent;
import entities.chat.chatimpl.privatechat.PrivateChat;
import entities.chat.chatimpl.privatechat.PrivateChatInfo;
import usecases.chatsusecases.ManagePrivateChatsUseCase;

public class ManagePrivateChatsUseCaseImpl implements ManagePrivateChatsUseCase {
    private ManagePrivateChatsDAService daService;

    @Override
    public PrivateChat createPrivateChat(CreatePrivateChatRequest request) {
        ChatCreatedEvent event = new ChatCreatedEvent();
        PrivateChat privateChat = daService.createPrivateChatForUserAndSaveEvent(
                request.getIdUserSenderRequest(),
                request.getPrivateChatInfoDTO().getPrivateChatInfo(),
                event
        );
        return privateChat;
    }

    @Override
    public void deletePrivateChat(DeletePrivateChatRequest request) {
        ChatDeletedEvent event = new ChatDeletedEvent();
        daService.deletePrivateChatOfUserAndSaveEvent(
                request.getIdPrivateChat(),
                request.getIdUserSenderRequest(),
                event
        );
    }

    @Override
    public PrivateChatInfo editPrivateChat(EditPrivateChatRequest request) {
        ChatInfoChangedEvent event = new ChatInfoChangedEvent();
        PrivateChatInfo newInfo = daService.updatePrivatChatInfoOfUserAndSaveEvent(
                request.getIdUserSender(),
                request.getChatId(),
                request.getNewInfo().getPrivateChatInfo(),
                event
        );
        return newInfo;
    }
}
