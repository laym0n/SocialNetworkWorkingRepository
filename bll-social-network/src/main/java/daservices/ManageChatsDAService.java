package daservices;

import entities.chat.chatmemberinfo.GroupChatMember;
import entities.chat.chatmemberinfo.GroupUserChatMemberInfo;
import entities.chat.chatimpl.groupchat.*;
import entities.chat.changeshistory.chatchangeevents.*;

import java.util.Map;
import java.util.Optional;

public interface ManageChatsDAService {
    void createChatWithCreatorAndSimpleMembersAndSaveEvent(
            GroupChat newGroupChat,
            int idCUserCreator,
            int[] idsUsersForAddToChat,
            ChatCreatedEvent event
    );


    void addSimpleMemberByUserIdAndSaveEvent(int idNewMember, int idChat, NewChatMemberAddedEvent event);

    GroupChatMember removeChatMemberFromChatAndAddEvent(int idMemberForDelete, ChatMemberLeavedEvent event);

    void updateChatMemberInfoAndAddEvent(GroupUserChatMemberInfo newChatMemberRoles, int idChatMemberForEdit, int idChat, ChatMemberChangedInfoEvent event);

    void updateGroupChatInfoAndSaveEvent(GroupChatInfo chatInfo, int idChat, ChatInfoChangedEvent event);

    Map<Integer, ChatMemberRole> findRolesForChatMember(int idChat, int idMemberRequestOwner);

    Optional<Integer> makeAnyAdminOwner(int idChat);

    Optional<Integer> makeAnyMemberOwner(int idChat);

    void deleteChat(int idChat);

    void saveChatMemberChangedInfoEvent(ChatMemberChangedInfoEvent eventUpdateInfo);
}
