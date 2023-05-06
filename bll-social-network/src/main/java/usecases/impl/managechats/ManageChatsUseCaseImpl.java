package usecases.impl.managechats;

import DAServices.ManageChatsDAService;
import dto.requests.*;
import entities.chat.Chat;
import entities.chat.ChatMemberRole;
import usecases.ManageChatsUseCase;

import java.util.HashMap;
import java.util.Map;

public class ManageChatsUseCaseImpl implements ManageChatsUseCase {
    private ManageChatsDAService daService;

    @Override
    public void createChat(CreateChatRequest request) {
        Chat newChat = new Chat(request.getChatTitle());
        daService.createChat(newChat);
        daService.addCreatorToChatByUserId(request.getIdCUserCreator());
        daService.addSimpleMembersByUserIds(request.getIdsUsersForAddToChat());
    }

    @Override
    public void addChatMember(AddChatMemberRequest request) {
        daService.addSimpleMemberByUserId(request.getIdNewMember());
    }

    @Override
    public void deleteChatMember(DeleteChatMemberRequest request) {
        daService.removeChatMemberFromChat(request.getIdMemberForDelete());
    }

    @Override
    public void editChatMember(EditChatMemberRequest request) {
        Map<Integer, ChatMemberRole> newChatMemberRoles = new HashMap<>();
        for (String newStringRole : request.getNewRolesForChatMember()) {
            ChatMemberRole newRole = ChatMemberRole.valueOf(newStringRole);
            newChatMemberRoles.put(newRole.getIdGroup(), newRole);
        }
        daService.updateRolesForChatMemberById(newChatMemberRoles);
    }

    @Override
    public void editChat(EditChatRequest request) {
        daService.updateChatTitle(request.getNewTitle());
    }
}
