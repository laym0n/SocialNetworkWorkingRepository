package usecases.chatsusecases;

import dto.requests.*;

public interface CommunicateViaGroupChatUseCase {
    void sendMessage(SendMessageRequest request);

    void deleteMessage(DeleteMessageRequest deleteMessageRequest);

    void editMessage(EditMessageRequest request);

    void clearMessageHistory(ClearMessageHistoryRequest request);

    void deleteMessageOnlyForUser(DeleteMessageOnlyForUserRequest request);
}
