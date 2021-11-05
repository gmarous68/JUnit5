package craighawkins.section3;

import org.junit.jupiter.api.*; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test2 {

    @Test
    public void myTest() {
        int[] numbers = {1, 2, 4, 10};
        for (int number : numbers) {
            assertTrue(number < 20);
        }
    }
}