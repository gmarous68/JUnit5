package craighawkins.section2;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertEquals()

public class Test1 {

    @Test
    public void test1() {
        assertEquals(2, 2);
    }

    @Test
    public void test2() {
        int actual = Math.min(2, 3); //what your code actually produces
        int expected = 2; //what you think the value should be
        assertEquals(expected, actual);
    }
}