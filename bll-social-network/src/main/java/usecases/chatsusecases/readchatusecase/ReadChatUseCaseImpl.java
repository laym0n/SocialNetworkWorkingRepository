package usecases.chatsusecases.readchatusecase;

import daservices.ReadChatDAService;
import dto.modelsdto.ChatDTO;
import dto.requests.chat.ReadAllChatRequest;
import entities.chat.chatimpl.groupchat.GroupChat;
import usecases.chatsusecases.ReadChatUseCase;

public class ReadChatUseCaseImpl implements ReadChatUseCase {
    private ReadChatDAService daService;

    @Override
    public ChatDTO readFullChat(ReadAllChatRequest request) {
        GroupChat groupChat = daService.loadChatWithAllMessages(request.getIdChat());
        return new ChatDTO(groupChat);
    }
}
