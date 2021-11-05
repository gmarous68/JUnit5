package craighawkins.section2;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertNull(),assertNotNull()

public class Test4 {

    @Test
    public void myTest() {

        String s = null;
        assertNull(s);

        String t = "hello";
        assertNotNull(t);
    }
}