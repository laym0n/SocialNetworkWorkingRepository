package usecases.usersusecases.impl.edituserprofile;

import daservices.EditUserProfileDAService;
import dto.requests.UpdateUserProfileRequest;
import lombok.AllArgsConstructor;
import usecases.usersusecases.EditUserProfileUseCase;
import usecases.usersusecases.impl.edituserprofile.endeventuserupdateprofileimpl.SendEventsUserUpdateProfile;

@AllArgsConstructor
public class EditUserProfileUseCaseImpl implements EditUserProfileUseCase {
    private EditUserProfileDAService daService;
    private SendEventsUserUpdateProfile sendEventsUpdateProfileStrategy;

    @Override
    public void updateUserProfile(UpdateUserProfileRequest request) {
        daService.updateUserProfile(request.getUserProfile());
        sendEventsUpdateProfileStrategy.sendEventUserUpdateProfile(request);
    }
}
