package dto.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignInResponse {
    private boolean isSignInSuccessful;
    private GetChatsResponse chats = null;

    public SignInResponse(boolean isSignInSuccessful) {
        this.isSignInSuccessful = isSignInSuccessful;
    }
}
