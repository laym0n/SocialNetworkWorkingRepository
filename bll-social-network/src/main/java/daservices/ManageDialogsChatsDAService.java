package daservices;

import entities.chat.changeshistory.chatchangeevents.ChatCreatedEvent;
import entities.chat.chatimpl.dialog.DialogChat;
import entities.chat.messages.Message;

public interface ManageDialogsChatsDAService {
    boolean checkIfUsersInBlackListsEachOther(int idUserToDialog, int idUserSenderRequest);

    DialogChat saveDialogChatWithMessageAndSaveEvent(Message message, int idFirstUser, int idSecondUser, ChatCreatedEvent event);
}
