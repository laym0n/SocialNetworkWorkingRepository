package usecases.chatsusecases.communicateviachat;

import daservices.CommunicateViaChatDAService;
import dto.requests.DeleteMessageRequest;
import dto.requests.EditMessageRequest;
import dto.requests.SendMessageRequest;
import entities.chat.messages.Message;
import entities.chat.messages.MessageType;
import entities.chat.messages.SimpleMessage;
import entities.chat.changeshistory.chatchangeevents.ChatMessageDeletedEvent;
import entities.chat.changeshistory.chatchangeevents.ChatMessageEditedEvent;
import entities.chat.changeshistory.chatchangeevents.ChatNewMessageSentEvent;
import lombok.AllArgsConstructor;
import usecases.chatsusecases.CommunicateViaGroupChatUseCase;

import java.security.InvalidParameterException;

@AllArgsConstructor
public class CommunicateViaGroupGroupChatUseCaseImpl implements CommunicateViaGroupChatUseCase {
    private CommunicateViaChatDAService daService;

    @Override
    public void sendMessage(SendMessageRequest request) {
        ChatNewMessageSentEvent event = new ChatNewMessageSentEvent();
        daService.addEventToChatChangeHistory(event, request.getChatId());
        Message newSimpleMessage = request.getMessageDTO().getMessage();
        newSimpleMessage.setOrderIdOfChangeEvent(event.getOrderId());
        daService
                .addMessageToChat(
                        newSimpleMessage,
                        request.getChatId()
                );
    }

    @Override
    public void deleteMessage(DeleteMessageRequest request) {
        checkIfUserIsOwnerOfMessage(request.getIdChat(), request.getOrderIdMessage(), request.getIdUserOwnerRequest());
        ChatMessageDeletedEvent event = new ChatMessageDeletedEvent(
                request.getOrderIdMessage()
        );
        daService.deleteMessageByIdAndAddEventToChangeHistory(
                request.getOrderIdMessage(),
                request.getIdChat(),
                event
        );

    }

    @Override
    public void editMessage(EditMessageRequest request) {
        checkIfUserIsOwnerOfMessage(request.getIdChat(), request.getMessageDTO().getOrderIdOfChangeEvent(),
                request.getUserId());
        ChatMessageEditedEvent event = new ChatMessageEditedEvent(
                request.getMessageDTO().getOrderIdOfChangeEvent()
        );
        daService.updateMessageInChatAndAddEventToChangeHistory(
                request.getMessageDTO().getMessage(),
                event
        );
    }

    private void checkIfUserIsOwnerOfMessage(int idChat, int orderIdMessage, int userId) {
        int idOwner = daService.userIdWithMessage(idChat, orderIdMessage);
        if (idOwner != userId) {
            throw new InvalidParameterException("User with id " + userId + " is not owner of message with id"
                    + orderIdMessage + " in chat " + idChat);
        }
    }
}