package daservices;

import entities.chat.chatimpl.groupchat.GroupChat;

public interface ReadChatDAService {
    GroupChat loadChatWithAllMessages(int idChat);
}
