package craighawkins.section2;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertEquals()

public class Test9 {

    @Test
    public void myTest() {
        String[] actual = "ab cd ef".split(" "); //what your code produces
        String[] expected = {"ab", "cd", "ef"}; //what you think it should be

        assertArrayEquals(expected, actual);
    }
}