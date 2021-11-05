package craighawkins.section4;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test1 {

    @Test
    public void myFirstTest() {
        assertTrue(1 == 2, "the expression is not true");
    }
}