package atmosphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "https://atmop.dev")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
