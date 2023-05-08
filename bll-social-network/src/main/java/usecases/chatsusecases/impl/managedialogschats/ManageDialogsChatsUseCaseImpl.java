package usecases.chatsusecases.impl.managedialogschats;

import daservices.ManageDialogsChatsDAService;
import dto.requests.CreateDialogChatRequest;
import entities.chat.chatimpl.dialog.DialogChat;
import usecases.chatsusecases.ManageDialogsChatsUseCase;

import java.security.InvalidParameterException;

public class ManageDialogsChatsUseCaseImpl implements ManageDialogsChatsUseCase {
    private ManageDialogsChatsDAService daService;

    @Override
    public DialogChat createDialogChat(CreateDialogChatRequest request) {
        boolean isUsersInBlackList = daService.checkIfUsersInBlackListsEachOther(
                request.getIdUserToDialog(),
                request.getIdUserSenderRequest()
        );
        if (isUsersInBlackList) {
            throw new InvalidParameterException("Users in black list each other");
        }
        DialogChat newChat = daService.saveDialogChatWithMessage(
                request.getMessageDTO().getMessage(),
                request.getIdUserToDialog(),
                request.getIdUserSenderRequest()
        );
        return newChat;
    }
}
