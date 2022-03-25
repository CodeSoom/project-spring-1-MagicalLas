package atmosphere.application;

import atmosphere.domain.A;
import org.springframework.stereotype.Service;

@Service
public class ABC {
    public final A a;

    public ABC(A aa) {
        a = aa;
    }

    public String say() {
        return a.method();
    }
}
