package usecases.chatsusecases.impl.managegroupchats;

import daservices.ManageChatsDAService;
import dto.requests.chat.*;
import entities.chat.changeshistory.chatchangeevents.*;
import entities.chat.chatimpl.groupchat.ChatMemberRole;
import entities.chat.chatimpl.groupchat.GroupChat;
import entities.chat.chatmemberinfo.GroupChatMember;
import lombok.AllArgsConstructor;
import usecases.chatsusecases.ManageGroupChatsUseCase;
import usecases.chatsusecases.impl.managegroupchats.strategies.CanEditChatMemberProfileStrategy;
import usecases.chatsusecases.impl.managegroupchats.strategies.CompareChatMembersByRolesStrategy;
import usecases.chatsusecases.impl.managegroupchats.strategies.ReplaceOwnerStrategy;

import java.util.Map;

@AllArgsConstructor
public class ManageGroupChatsUseCaseImpl implements ManageGroupChatsUseCase {
    private ManageChatsDAService daService;
    private ReplaceOwnerStrategy replaceOwnerStrategy;
    private CanEditChatMemberProfileStrategy canEditChatMemberProfileStrategy;

    @Override
    public void createChat(CreateGroupChatRequest request) {
        GroupChat newGroupChat = new GroupChat(request.getGroupChatInfoDTO().getChatInfo());
        ChatCreatedEvent event = new ChatCreatedEvent();
        daService.createChatWithCreatorAndSimpleMembersAndSaveEvent(
                newGroupChat,
                request.getIdCUserCreator(),
                request.getSimpleUsersIds(),
                event
        );
    }

    @Override
    public void addChatMember(AddChatMemberRequest request) {
        NewChatMemberAddedEvent event = new NewChatMemberAddedEvent(request.getIdNewMember());
        daService.addSimpleMemberByUserIdAndSaveEvent(request.getIdNewMember(), request.getIdChat(), event);
    }

    @Override
    public void leaveFromChat(LeaveFromChatRequest request) {
        ChatMemberLeavedEvent event = new ChatMemberLeavedEvent(request.getIdMemberOwnerRequest());
        Map<Integer, ChatMemberRole> rolesOfRemoved = daService.removeChatMemberFromChatAndAddEvent(request.getIdMemberOwnerRequest(), event);
        ChatMemberRole owner = ChatMemberRole.OWNER;
        if (rolesOfRemoved.get(owner.getIdGroup()).equals(owner)) {
            replaceOwnerStrategy.replaceOwner(request.getIdChat());
        }
    }

    @Override
    public void editChatMember(EditChatMemberProfileRequest request) {
        canEditChatMemberProfileStrategy.checkIfCanEdit(request);

        ChatMemberChangedInfoEvent event = new ChatMemberChangedInfoEvent(request.getIdChatMemberForEdit());
        daService.updateChatMemberInfoAndAddEvent(
                request.getGroupChatMemberInfoDTO().getGroupChatMemberInfo(),
                request.getIdChatMemberForEdit(),
                request.getIdChat(),
                event
        );
    }

    @Override
    public void editChatInfo(EditChatRequest request) {
        ChatInfoChangedEvent event = new ChatInfoChangedEvent();
        daService.updateGroupChatInfoAndSaveEvent(request.getNewGroupChatInfoDTO().getChatInfo(), request.getIdChat(), event);
    }
}
