package entities.chat.changeshistory;

import entities.administrateentities.Ban;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class ChatChangeEvent {
    protected int orderId;
    protected ChatChangeEventType eventType;
}
