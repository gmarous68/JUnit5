package craighawkins.section4;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertEquals()

public class Test3 {

    @Test
    public void myTest() {
        int a = 1;
        int b = 2;
        assertEquals(a, b, a + " does not equal " + b);
    }
}