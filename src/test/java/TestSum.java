import org.junit.jupiter.api.Test;
import org.maths.Maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSum {

    Maths m;

    @Test
    void testSum() {
        m = new Maths();
        m.a = 3;
        m.b = 4;
        int result = m.sum(m.a,  m.b);
        assertEquals(result, 7);
    }

}
