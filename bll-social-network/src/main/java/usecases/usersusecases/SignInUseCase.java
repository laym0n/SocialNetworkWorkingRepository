package usecases.usersusecases;

import dto.requests.SignInRequest;
import dto.requests.SignUpRequest;
import dto.responses.SignInResponse;

public interface SignInUseCase {
    SignInResponse signIn(SignInRequest signInRequest);

    void signUp(SignUpRequest signUpRequest);
}
