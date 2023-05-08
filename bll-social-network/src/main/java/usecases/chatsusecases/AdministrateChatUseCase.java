package usecases.chatsusecases;

import dto.requests.BlockMessageRequest;
import dto.requests.KickOutChatMemberRequest;

public interface AdministrateChatUseCase {
    void deleteMessage(BlockMessageRequest request);

    void kickOutChatMember(KickOutChatMemberRequest request);
}
