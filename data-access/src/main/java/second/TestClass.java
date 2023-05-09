package second;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class TestClass {
    public int testNum = 23423;

    @Autowired
    public TestClass() {
    }
}
