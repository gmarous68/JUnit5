package craighawkins.section2;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //fail()

public class Test5 {

    @Test
    public void myTest() {
        fail("I produce a red bar no matter what.");
    }
}