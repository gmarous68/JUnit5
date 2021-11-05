package craighawkins.section4;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertTrue(), assertEquals()

public class Test2 {

    @Test
    public void test1() {
        assertTrue(1 == 2);
    }

    @Test
    public void test2() {
        assertTrue(2 == 3, "the expression is not true");
    }

    @Test
    public void test3() {
        assertEquals(3, 4, "the values are not equal");
    }
}