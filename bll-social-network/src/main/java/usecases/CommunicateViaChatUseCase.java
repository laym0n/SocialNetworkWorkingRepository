package usecases;

import dto.modelsdto.MessageDTO;
import dto.requests.DeleteMessageRequest;

public interface CommunicateViaChatUseCase {
    void sendMessage(MessageDTO messageDTO);

    void deleteMessage(DeleteMessageRequest deleteMessageRequest);

    void editMessage(MessageDTO messageDTO);
}
