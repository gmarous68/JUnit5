package craighawkins.section4;

import org.junit.jupiter.api.*; //@Test, @Nested, @DisplayName()
import static org.junit.jupiter.api.Assertions.*; //assertEquals()

@DisplayName("Math library test:")
public class Test8 {

    @Nested
    @DisplayName("Given input values 1 and 2:")
    class A {

        @Test
        @DisplayName("The max is 2.")
        public void testMax() {
            int actual = Math.max(1, 2);
            int expected = 2;
            assertEquals(expected, actual);
        }

        @Test
        @DisplayName("The min is 1.")
        public void testMin() {
            int actual = Math.min(1, 2);
            int expected = 1;
            assertEquals(expected, actual);
        }
    }
}