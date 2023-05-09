package entities.user;

import entities.administrateentities.Ban;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String userName;
    private String password;
    private Map<Integer, UserRole> roles;
    private List<Ban> bans = new ArrayList<>();
    protected boolean isBlocked;

    public User(String userName, String password, Map<Integer, UserRole> roles) {
        this.userName = userName;
        this.password = password;
        this.roles = roles;
    }
}
