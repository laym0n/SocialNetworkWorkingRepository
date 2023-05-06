package entities.user;

import entities.newsfeed.NewsFeed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile {
    private UserInfo owner;
    private OffsetDateTime birthday;
    private NewsFeed profileNewsFeed;
}
