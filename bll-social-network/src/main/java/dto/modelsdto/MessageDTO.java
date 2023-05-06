package dto.modelsdto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class MessageDTO {
    private int id;
    private int userId;
    private String text;
    private byte[][] images;
    private LocalDateTime createdAt;
    private LocalDateTime lastEditTime;
}
