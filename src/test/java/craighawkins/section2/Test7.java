package craighawkins.section2;

import org.junit.jupiter.api.*; //@Test, @Disabled
import static org.junit.jupiter.api.Assertions.*; //fail()

//you can disable an entire class. none of the methods will run.

@Disabled
public class Test7 {

    @Test
    public void test1() {
        fail("test 1 red bar"); //won't run
    }

    @Test
    public void test2() {
        fail("test 2 red bar"); //won't run
    }
}