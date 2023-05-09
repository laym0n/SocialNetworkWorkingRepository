package usecases.chatsusecases;

import dto.requests.BlockMessageRequest;
import dto.requests.ChangeChatMemberRolesRequest;
import dto.requests.KickOutChatMemberRequest;

public interface AdministrateGroupChatUseCase {
    void changeChatMemberRolesForMember(ChangeChatMemberRolesRequest request);

    void deleteMessage(BlockMessageRequest request);

    void kickOutChatMember(KickOutChatMemberRequest request);
}
