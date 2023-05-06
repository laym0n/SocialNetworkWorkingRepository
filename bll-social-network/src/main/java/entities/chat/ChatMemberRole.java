package entities.chat;

import lombok.Getter;

@Getter
public enum ChatMemberRole {
    SIMPLE_MEMBER(0),
    CHAT_ADMIN(0),
    CREATOR(0);
    int idGroup;

    ChatMemberRole(int idGroup) {
        this.idGroup = idGroup;
    }
}
