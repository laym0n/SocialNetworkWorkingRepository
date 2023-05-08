package usecases.usersusecases.impl.edituserprofile.endeventuserupdateprofileimpl;

import daservices.SendEventToChatsDAService;
import dto.requests.UpdateUserProfileRequest;
import entities.chat.changeshistory.chatchangeevents.ChatMemberChangedInfoEvent;

import java.util.Optional;

public class SendEventsToChatsImpl implements SendEventsUserUpdateProfile {
    private SendEventToChatsDAService daService;
    private Optional<SendEventsUserUpdateProfile> nextHandler;

    @Override
    public void sendEventUserUpdateProfile(UpdateUserProfileRequest request) {
        ChatMemberChangedInfoEvent event = new ChatMemberChangedInfoEvent(request.getIdUser());
        daService.addEventToAllChatsWithUserByUserId(event, request.getIdUser());
        if (nextHandler.isPresent()) {
            nextHandler.get().sendEventUserUpdateProfile(request);
        }
    }
}
