package usecases.usersusecases.impl.signin;

import daservices.SignInDAService;
import dto.requests.SignInRequest;
import dto.requests.SignUpRequest;
import dto.responses.GetChatsResponse;
import dto.responses.SignInResponse;
import entities.chat.chatimpl.groupchat.GroupChat;
import usecases.usersusecases.SignInUseCase;

import java.util.List;

public class SignInUseCaseImpl implements SignInUseCase {
    private SignInDAService signInDAService;

    @Override
    public SignInResponse signIn(SignInRequest signInRequest) {
        String password = signInDAService.getUserPasswordByUserName(signInRequest.getUserName());
        if (!password.equals(signInRequest.getPassword())) {
            return new SignInResponse(false);
        }
        List<GroupChat> groupChatForUser = signInDAService
                .findChatsForUserByUserName(signInRequest.getUserName());
        GetChatsResponse chatsResponse = new GetChatsResponse(groupChatForUser);
        return new SignInResponse(true, chatsResponse);
    }

    @Override
    public void signUp(SignUpRequest signUpRequest) {
        signInDAService.createUser(signUpRequest.getUser());
    }
}
