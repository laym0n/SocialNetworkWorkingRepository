package entities.chat.messages;

import entities.Ban;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Message {
    protected int chatId;
    protected int orderIdOfChangeEvent;
    protected OffsetDateTime createdAt;
    protected MessageType messageType;
    protected Optional<Ban> ban;
    protected boolean isBlocked;
}