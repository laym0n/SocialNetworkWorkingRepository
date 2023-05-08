package daservices;

import entities.chat.messages.Message;
import entities.chat.changeshistory.chatchangeevents.ChatMessageDeletedEvent;
import entities.chat.changeshistory.chatchangeevents.ChatMessageEditedEvent;
import entities.chat.changeshistory.chatchangeevents.ChatNewMessageSentEvent;

public interface CommunicateViaChatDAService {
    void addMessageToChat(Message simpleMessage, int chatId);

    void deleteMessageByIdAndAddEventToChangeHistory(int orderIdMessage, int idChat, ChatMessageDeletedEvent event);

    void updateMessageInChatAndAddEventToChangeHistory(Message simpleMessage, ChatMessageEditedEvent event);

    void addEventToChatChangeHistory(ChatNewMessageSentEvent event, int chatId);

    int userIdWithMessage(int idChat, int orderIdMessage);

    void addMessageToDeletedForChatMember(int idChatMember, int chatId, int orderIdMessage);
}
