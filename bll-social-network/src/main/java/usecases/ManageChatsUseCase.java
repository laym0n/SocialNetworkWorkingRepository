package usecases;

import dto.requests.*;

public interface ManageChatsUseCase {
    void createChat(CreateChatRequest request);

    void addChatMember(AddChatMemberRequest request);

    void deleteChatMember(DeleteChatMemberRequest request);

    void editChatMember(EditChatMemberRequest request);

    void editChat(EditChatRequest request);
}
