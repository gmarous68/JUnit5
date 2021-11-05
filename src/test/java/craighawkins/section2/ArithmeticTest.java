package craighawkins.section2;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertEquals()

public class ArithmeticTest {

    @Test
    public void testAdd() {
        Arithmetic arithmetic = new Arithmetic();
        int actual = arithmetic.add(3, 2);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        Arithmetic arithmetic = new Arithmetic();
        int actual = arithmetic.subtract(3, 2);
        int expected = 1;
        assertEquals(expected, actual);
    }
}
