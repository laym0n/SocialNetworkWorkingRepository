package DAServices;

import entities.chat.Chat;
import entities.user.User;

import java.util.List;

public interface SignInDAService {
    void createUser(User user);

    String getUserPasswordByUserName(String userName);

    List<Chat> findChatsForUserByUserName(String userName);
}
