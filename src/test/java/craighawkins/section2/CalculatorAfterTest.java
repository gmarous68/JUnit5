package craighawkins.section2;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertEquals()

class CalculatorAfterTest {
    @Test
    public void testSquareIt() {
        int actual = CalculatorAfter.squareIt(3);
        int expected = 9;
        assertEquals(expected, actual);
    }
}