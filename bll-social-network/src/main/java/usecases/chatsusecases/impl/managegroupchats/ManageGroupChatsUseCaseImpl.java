package usecases.chatsusecases.impl.managegroupchats;

import daservices.ManageChatsDAService;
import dto.requests.chat.*;
import entities.chat.changeshistory.chatchangeevents.*;
import entities.chat.chatimpl.groupchat.ChatMemberRole;
import entities.chat.chatimpl.groupchat.GroupChat;
import entities.chat.chatmemberinfo.GroupChatMember;
import lombok.AllArgsConstructor;
import usecases.chatsusecases.ManageGroupChatsUseCase;
import usecases.chatsusecases.impl.managegroupchats.strategies.CompareChatMembersByRolesStrategy;
import usecases.chatsusecases.impl.managegroupchats.strategies.ReplaceOwnerStrategy;

import java.security.InvalidParameterException;
import java.util.Map;

@AllArgsConstructor
public class ManageGroupChatsUseCaseImpl implements ManageGroupChatsUseCase {
    private ManageChatsDAService daService;
    private CompareChatMembersByRolesStrategy rolesComparator;
    private ReplaceOwnerStrategy replaceOwnerStrategy;

    @Override
    public void createChat(CreateGroupChatRequest request) {
        GroupChat newGroupChat = new GroupChat(request.getGroupChatInfoDTO().getChatInfo());
        ChatCreatedEvent event = new ChatCreatedEvent(request.getIdCUserCreator());
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
        GroupChatMember removedMember = daService.removeChatMemberFromChatAndAddEvent(request.getIdMemberOwnerRequest(), event);
        ChatMemberRole owner = ChatMemberRole.OWNER;
        if (removedMember.getInfo().getRoles().get(owner.getIdGroup()).equals(owner)) {
            replaceOwnerStrategy.replaceOwner(request.getIdChat());
//            Optional<Integer> idNewOwner = daService.makeAnyAdminOwner(request.getIdChat());
//            if (idNewOwner.isEmpty()) {
//                idNewOwner = daService.makeAnyMemberOwner(request.getIdChat());
//            }
//            if (idNewOwner.isEmpty()) {
//                daService.deleteChat(request.getIdChat());
//            } else {
//                ChatMemberChangedInfoEvent eventUpdateInfo = new ChatMemberChangedInfoEvent(idNewOwner.get());
//                daService.saveChatMemberChangedInfoEvent(eventUpdateInfo);
//            }
        }
    }

    @Override
    public void editChatMember(EditChatMemberRequest request) {
        Map<Integer, ChatMemberRole> rolesEditor = daService
                .findRolesForChatMember(request.getIdChat(), request.getIdMemberRequestOwner());
        Map<Integer, ChatMemberRole> rolesEditable = daService
                .findRolesForChatMember(request.getIdChat(), request.getIdChatMemberForEdit());
        int compareResult = rolesComparator.compare(rolesEditor, rolesEditable);
        if (compareResult != 1) {
            throw new InvalidParameterException("No right access for that operation");
        }
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
