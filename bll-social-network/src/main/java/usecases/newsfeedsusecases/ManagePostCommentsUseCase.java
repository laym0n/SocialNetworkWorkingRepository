package usecases.newsfeedsusecases;

import dto.requests.AddNewCommentRequest;
import dto.requests.DeleteCommentRequest;
import dto.requests.EditCommentRequest;

public interface ManagePostCommentsUseCase {
    void addNewComment(AddNewCommentRequest request);

    void deleteComment(DeleteCommentRequest request);

    void editComment(EditCommentRequest request);
}
