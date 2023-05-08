package usecases.chatsusecases.administratechat;

import daservices.AdministrateChatDAService;
import dto.requests.BlockMessageRequest;
import dto.requests.KickOutChatMemberRequest;
import entities.Ban;
import entities.chat.changeshistory.chatchangeevents.ChatMemberBlockedEvent;
import entities.chat.changeshistory.chatchangeevents.ChatMessageBlockedEvent;
import usecases.chatsusecases.AdministrateChatUseCase;

public class AdministrateChatUseCaseImpl implements AdministrateChatUseCase {
    private AdministrateChatDAService daService;

    @Override
    public void deleteMessage(BlockMessageRequest request) {
        Ban messageBan = request.getBanDTO().getBan();
        ChatMessageBlockedEvent event = new ChatMessageBlockedEvent(request.getIdChat(), request.getOrderIdMessage());
        daService.blockMessageAndSaveEvent(messageBan, request.getIdChat(), request.getOrderIdMessage(), event);
    }

    @Override
    public void kickOutChatMember(KickOutChatMemberRequest request) {
        Ban chatMemberBan = request.getBanDTO().getBan();
        ChatMemberBlockedEvent event = new ChatMemberBlockedEvent(request.getIdChat(), request.getIdUser());
        daService.blockChatMemberAndSaveEvent(chatMemberBan, request.getIdChat(), request.getIdUser(), event);
    }
}
