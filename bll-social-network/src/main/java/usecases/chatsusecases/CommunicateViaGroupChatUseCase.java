package usecases.chatsusecases;

import dto.requests.DeleteMessageRequest;
import dto.requests.EditMessageRequest;
import dto.requests.SendMessageRequest;

public interface CommunicateViaGroupChatUseCase {
    void sendMessage(SendMessageRequest request);

    void deleteMessage(DeleteMessageRequest deleteMessageRequest);

    void editMessage(EditMessageRequest request);
}
