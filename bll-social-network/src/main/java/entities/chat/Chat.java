package entities.chat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chat {
    private int id;
    private String chatTitle;
    private Map<Integer, ChatMember> members = new HashMap<>();
    private List<Message> messages = new ArrayList<>();

    public Chat(String chatTitle) {
        this.chatTitle = chatTitle;
    }
}
