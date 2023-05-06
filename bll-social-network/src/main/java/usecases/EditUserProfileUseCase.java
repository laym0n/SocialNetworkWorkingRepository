package usecases;

import dto.requests.UpdateUserProfileRequest;

public interface EditUserProfileUseCase {
    void updateUserProfile(UpdateUserProfileRequest request);
}
