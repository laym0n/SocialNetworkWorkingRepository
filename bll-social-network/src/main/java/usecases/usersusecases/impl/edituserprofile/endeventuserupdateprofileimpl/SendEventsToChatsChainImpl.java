package usecases.usersusecases.impl.edituserprofile.endeventuserupdateprofileimpl;

import dto.requests.UpdateUserProfileRequest;

import java.util.Optional;

public class SendEventsToChatsChainImpl implements SendEventsUserUpdateProfile {
    private SendEventsUserUpdateProfile currentHandler;
    private Optional<SendEventsUserUpdateProfile> nextHandler;

    @Override
    public void sendEventUserUpdateProfile(UpdateUserProfileRequest request) {
        currentHandler.sendEventUserUpdateProfile(request);
        if (nextHandler.isPresent()) {
            nextHandler.get().sendEventUserUpdateProfile(request);
        }
    }
}
