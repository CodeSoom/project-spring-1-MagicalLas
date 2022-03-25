package atmosphere.adapter;

import atmosphere.domain.A;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AA extends A {
    public String method() {
        return "AA METHOD!";
    }
}
