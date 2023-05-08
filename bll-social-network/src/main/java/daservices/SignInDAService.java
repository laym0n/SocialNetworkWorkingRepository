package daservices;

import entities.chat.chatimpl.groupchat.GroupChat;
import entities.user.User;

import java.util.List;

public interface SignInDAService {
    void createUser(User user);

    String getUserPasswordByUserName(String userName);

    List<GroupChat> findChatsForUserByUserName(String userName);
}
