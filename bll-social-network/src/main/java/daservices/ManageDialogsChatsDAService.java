package daservices;

import entities.chat.chatimpl.dialog.DialogChat;
import entities.chat.messages.Message;

public interface ManageDialogsChatsDAService {
    boolean checkIfUsersInBlackListsEachOther(int idUserToDialog, int idUserSenderRequest);

    DialogChat saveDialogChatWithMessage(Message message, int idFirstUser, int idSecondUser);
}
