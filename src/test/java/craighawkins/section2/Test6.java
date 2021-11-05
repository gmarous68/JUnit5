package craighawkins.section2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Test6 {

    @Test
    public void test1() {
        System.out.println("inside test1");
    }

    @Disabled
    @Test
    public void test2() {
        System.out.println("inside test2");
    }
}