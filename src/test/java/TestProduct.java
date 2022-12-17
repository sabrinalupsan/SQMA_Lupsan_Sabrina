import org.junit.jupiter.api.Test;
import org.maths.Maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProduct {

    Maths m;

    @Test
    void testProduct() {
        m = new Maths();
        m.a = 3;
        m.b = 4;
        int result = m.product(m.a,  m.b);
        assertEquals(result, 12);
    }

}
