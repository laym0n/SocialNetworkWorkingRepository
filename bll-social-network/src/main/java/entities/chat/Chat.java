package entities.chat;

import entities.administrateentities.Ban;
import entities.chat.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chat {
    protected int id;
    protected List<Message> messages = new ArrayList<>();
    protected List<Ban> bans = new ArrayList<>();
    protected boolean isBlocked;
}
