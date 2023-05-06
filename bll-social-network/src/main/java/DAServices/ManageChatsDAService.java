package DAServices;

import entities.chat.Chat;
import entities.chat.ChatMemberRole;

import java.util.List;
import java.util.Map;

public interface ManageChatsDAService {
    void createChat(Chat newChat);

    void addCreatorToChatByUserId(int idCUserCreator);

    void addSimpleMembersByUserIds(List<Integer> idsUsersForAddToChat);

    void addSimpleMemberByUserId(int idNewMember);

    void removeChatMemberFromChat(int idMemberForDelete);

    void updateChatTitle(String newTitle);

    void updateRolesForChatMemberById(Map<Integer, ChatMemberRole> newChatMemberRoles);
}
