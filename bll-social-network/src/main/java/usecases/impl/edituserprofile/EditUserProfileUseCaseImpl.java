package usecases.impl.edituserprofile;

import DAServices.EditUserProfileDAService;
import dto.requests.UpdateUserProfileRequest;
import usecases.EditUserProfileUseCase;

public class EditUserProfileUseCaseImpl implements EditUserProfileUseCase {
    private EditUserProfileDAService daService;

    @Override
    public void updateUserProfile(UpdateUserProfileRequest request) {
        daService.updateUserProfile(request.getUserProfile());
    }
}
