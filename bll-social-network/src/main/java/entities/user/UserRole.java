package entities.user;

import lombok.Getter;

@Getter
public enum UserRole {
    SIMPLE_USER(0),
    ADMIN(0);
    int idGroup;

    UserRole(int idGroup) {
        this.idGroup = idGroup;
    }
}
