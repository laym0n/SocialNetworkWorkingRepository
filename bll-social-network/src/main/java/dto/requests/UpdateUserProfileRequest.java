package dto.requests;

import entities.user.UserInfo;
import entities.user.UserProfile;

import java.time.OffsetDateTime;

public class UpdateUserProfileRequest {
    private int idUser;
    private OffsetDateTime newBirthday;
    private String newFirstName;
    private String newSecondName;
    private byte[] newAvatar;

    public UserProfile getUserProfile() {
        return new UserProfile(
                new UserInfo(idUser, newFirstName, newSecondName, newAvatar),
                newBirthday,
                null
        );
    }
}
