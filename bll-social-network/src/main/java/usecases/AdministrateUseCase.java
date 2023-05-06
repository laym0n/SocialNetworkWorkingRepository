package usecases;

import dto.requests.BanUserRequest;
import dto.requests.UnbanUserRequest;

public interface AdministrateUseCase {
    void banUser(BanUserRequest request);

    void unbanUser(UnbanUserRequest request);

    void deletePost(BanUserRequest request);

    void deleteComment(UnbanUserRequest request);
}
