package usecases.chatsusecases.impl.managedialogschats;

import daservices.ManageDialogsChatsDAService;
import dto.requests.CreateDialogChatRequest;
import entities.chat.changeshistory.chatchangeevents.ChatCreatedEvent;
import entities.chat.chatimpl.dialog.DialogChat;
import usecases.chatsusecases.ManageDialogsChatsUseCase;

import java.security.InvalidParameterException;

public class ManageDialogsChatsUseCaseImpl implements ManageDialogsChatsUseCase {
    private ManageDialogsChatsDAService daService;

    @Override
    public DialogChat createDialogChat(CreateDialogChatRequest request) {
        boolean isUsersInBlackListEachOthers = daService.checkIfUsersInBlackListsEachOther(
                request.getIdUserToDialog(),
                request.getIdUserSenderRequest()
        );
        if (isUsersInBlackListEachOthers) {
            throw new InvalidParameterException("Users in black list each other");
        }
        ChatCreatedEvent event = new ChatCreatedEvent();
        DialogChat newChat = daService.saveDialogChatWithMessageAndSaveEvent(
                request.getMessageDTO().getMessage(),
                request.getIdUserToDialog(),
                request.getIdUserSenderRequest(),
                event
        );
        return newChat;
    }
}
