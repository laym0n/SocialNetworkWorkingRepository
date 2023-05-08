package usecases.newsfeedsusecases;

import dto.requests.AddPostRequest;
import dto.requests.DeletePostRequest;
import dto.requests.EditPostRequest;

public interface ManageNewsFeedPostsUseCase {
    void addNewPost(AddPostRequest request);

    void deletePost(DeletePostRequest request);

    void editPost(EditPostRequest request);
}
