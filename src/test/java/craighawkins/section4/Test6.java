package craighawkins.section4;

import org.junit.jupiter.api.*; //@Test, @DisplayName
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

@DisplayName("my number tests")
public class Test6 {

    @DisplayName("now testing a number for evenness...")
    @Test
    public void test1() {
        int number = 4;
        assertTrue(number % 2 == 0);
    }

    @DisplayName("now testing a number for oddness...")
    @Test
    public void test2() {
        int number = 3;
        assertTrue(number % 2 == 1);
    }
}