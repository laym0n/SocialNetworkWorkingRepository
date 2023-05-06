package usecases;

import dto.requests.AddPostToUserProfileRequest;
import dto.requests.DeletePostFromUserProfileRequest;
import dto.requests.EditPostInUserProfileRequest;

public interface ManageNewsFeedUseCase {
    void addPost(AddPostToUserProfileRequest request);

    void deletePost(DeletePostFromUserProfileRequest request);

    void editPost(EditPostInUserProfileRequest request);
}
