package atmosphere.adapter;


import atmosphere.domain.A;
import org.springframework.stereotype.Repository;

@Repository
public class AC extends A {
    public String method() {
        return "AC METHOD!";
    }
}
