package entities.chat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private int id;
    private int userId;
    private int orderId;
    private String text;
    private List<byte[]> images;
    private OffsetDateTime createdAt;
    private OffsetDateTime lastEditTime;

}
