package craighawkins.section2;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertEquals()

public class CalculatorBeforeTest {

    @Test
    public void testSquareIt() {
        int expected = 25;
        int actual = CalculatorBefore.squareIt(5);
        assertEquals(expected, actual);
    }
}
