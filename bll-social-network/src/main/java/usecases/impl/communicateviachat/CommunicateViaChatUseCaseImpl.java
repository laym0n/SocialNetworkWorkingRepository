package usecases.impl.communicateviachat;

import DAServices.CommunicateViaChatDAService;
import dto.modelsdto.MessageDTO;
import dto.requests.DeleteMessageRequest;
import usecases.CommunicateViaChatUseCase;

public class CommunicateViaChatUseCaseImpl implements CommunicateViaChatUseCase {
    private CommunicateViaChatDAService daService;

    @Override
    public void sendMessage(MessageDTO messageDTO) {

    }

    @Override
    public void deleteMessage(DeleteMessageRequest deleteMessageRequest) {

    }

    @Override
    public void editMessage(MessageDTO messageDTO) {
//        daService.updateMessage(messageDTO);
    }
}
