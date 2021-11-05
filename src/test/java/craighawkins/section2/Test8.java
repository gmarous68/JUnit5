package craighawkins.section2;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertArrayEquals()

public class Test8 {

    @Test
    public void myTest() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        assertArrayEquals(array1, array2);
    }
}
