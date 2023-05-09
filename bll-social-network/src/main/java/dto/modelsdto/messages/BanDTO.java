package dto.modelsdto.messages;

import entities.administrateentities.Ban;
import lombok.Data;

@Data
public class BanDTO {
    private int id;
    private int idBlocker;
    private String description;

    public Ban getBan() {
//        return new Ban(id, idBlocker, description);
        return null;
    }
}
