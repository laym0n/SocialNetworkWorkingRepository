package dto.requests;

import entities.user.User;
import entities.user.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpRequest {
    private String userName;
    private String password;
    private String firstName;
    private String secondName;

    public User getUser() {
        Map<Integer, UserRole> roles = new HashMap<>();
        roles.put(UserRole.SIMPLE_USER.getIdGroup(), UserRole.SIMPLE_USER);
        return new User(userName, password, roles);
    }
}
