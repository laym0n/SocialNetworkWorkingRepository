package usecases.chatsusecases;

import dto.modelsdto.ChatDTO;
import dto.requests.chat.ReadAllChatRequest;

public interface ReadChatUseCase {
    ChatDTO readFullChat(ReadAllChatRequest request);
}
