package usecases.chatsusecases.impl.communicateviachat.decorators;

import daservices.CheckingAccessRightsByRolesDAService;
import dto.requests.ClearMessageHistoryRequest;
import dto.requests.DeleteMessageRequest;
import dto.requests.EditMessageRequest;
import dto.requests.SendMessageRequest;
import dto.requests.chat.*;
import entities.chat.chatimpl.groupchat.ChatMemberRole;
import entities.user.UserRole;
import lombok.AllArgsConstructor;
import usecases.chatsusecases.CommunicateViaGroupChatUseCase;
import usecases.chatsusecases.ManageGroupChatsUseCase;

import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;

@AllArgsConstructor
public class CheckingAccessRightsByRolesImpl implements CommunicateViaGroupChatUseCase {
    private CheckingAccessRightsByRolesDAService daService;
    private CommunicateViaGroupChatUseCase communicateViaGroupChatUseCase;

    private void checkIfFirstUserBiggerThanSecond(int idFirst, int idSecond, int idChat) {
        int resultOfCompare = checkIfFirstUserRolesBiggerThanSecond(idFirst, idSecond);
        if (resultOfCompare == 0) {
            resultOfCompare = checkIfFirstChatMemberRolesBiggerThanSecond(idFirst, idSecond, idChat);
        }
        if (resultOfCompare != 1) {
            throw new RejectedExecutionException("No rights for this operation");
        }
    }

    private int checkIfFirstUserRolesBiggerThanSecond(int idFirst, int idSecond) {
        Map<Integer, UserRole> firstRoles = daService.findUserRoles(idFirst);
        Map<Integer, UserRole> secondRoles = daService.findUserRoles(idSecond);
        int maxFirstPower = firstRoles.values().stream().max(Comparator.comparingInt(UserRole::getPower)).get().getPower();
        int maxSecondPower = secondRoles.values().stream().max(Comparator.comparingInt(UserRole::getPower)).get().getPower();
        return Integer.compare(maxFirstPower, maxSecondPower);
    }

    private int checkIfFirstChatMemberRolesBiggerThanSecond(int idFirst, int idSecond, int idChat) {
        Map<Integer, ChatMemberRole> firstRoles = daService.findChatMemberRoles(idChat, idFirst);
        Map<Integer, ChatMemberRole> secondRoles = daService.findChatMemberRoles(idChat, idSecond);
        int maxFirstPower = firstRoles.values().stream().max(Comparator.comparingInt(ChatMemberRole::getPower)).get().getPower();
        int maxSecondPower = secondRoles.values().stream().max(Comparator.comparingInt(ChatMemberRole::getPower)).get().getPower();
        return Integer.compare(maxFirstPower, maxSecondPower);
    }

    @Override
    public void sendMessage(SendMessageRequest request) {
        communicateViaGroupChatUseCase.sendMessage(request);
    }

    @Override
    public void deleteMessage(DeleteMessageRequest deleteMessageRequest) {

    }

    @Override
    public void editMessage(EditMessageRequest request) {
        communicateViaGroupChatUseCase.editMessage(request);
    }

    @Override
    public void clearMessageHistory(ClearMessageHistoryRequest request) {
        communicateViaGroupChatUseCase.clearMessageHistory(request);
    }
}
