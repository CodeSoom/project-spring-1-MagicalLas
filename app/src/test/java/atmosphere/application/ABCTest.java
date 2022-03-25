package atmosphere.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
class ABCTest {
    @Autowired
    private ABC service;
    @Test
    void say() {
        assert service.say().equals("AA METHOD!");
    }
}
