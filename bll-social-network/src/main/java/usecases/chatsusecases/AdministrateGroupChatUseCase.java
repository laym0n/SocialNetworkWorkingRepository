package usecases.chatsusecases;

import dto.requests.BlockMessageRequest;
import dto.requests.KickOutChatMemberRequest;

public interface AdministrateGroupChatUseCase {
    void deleteMessage(BlockMessageRequest request);

    void kickOutChatMember(KickOutChatMemberRequest request);
}
