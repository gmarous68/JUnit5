package craighawkins.section2;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertTrue(), assertFalse()

public class Test3 {

    @Test
    public void myFirstTest() {
        assertTrue(2 == 2);
    }

    @Test
    public void mySecondTest() {
        assertFalse(2 == 3);
    }
}
