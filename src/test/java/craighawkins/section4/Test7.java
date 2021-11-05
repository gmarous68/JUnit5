package craighawkins.section4;

import org.junit.jupiter.api.*; //@Test, @Nested
import static org.junit.jupiter.api.Assertions.*; //assertTrue(), assertFalse()

public class Test7 {

    @Nested
    @DisplayName("ice cream")
    class A {

        @Test
        public void apple() {
            assertTrue(true);
        }

        @Test
        public void banana() {
            assertTrue(true);
        }
    }

    @Nested
    class B {
        @Test
        public void cherry() {
            assertFalse(false);
        }
    }
}