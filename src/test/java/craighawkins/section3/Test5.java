package craighawkins.section3;

import org.junit.jupiter.api.*; //@BeforeEach, @AfterEach, @Test

public class Test5 {

    @BeforeEach
    public void a() {
        System.out.println("a");
    }

    @AfterEach
    public void b() {
        System.out.println("b");
    }

    @Test
    public void test1() {
        System.out.println("test 1");
    }

    @Test
    public void test2() {
        System.out.println("test 2");
    }
}
