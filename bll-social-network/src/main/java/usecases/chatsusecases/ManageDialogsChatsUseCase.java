package usecases.chatsusecases;

import dto.requests.CreateDialogChatRequest;
import entities.chat.chatimpl.dialog.DialogChat;

public interface ManageDialogsChatsUseCase {
    DialogChat createDialogChat(CreateDialogChatRequest request);
}
