package craighawkins.section3;

import org.junit.jupiter.api.*; //@BeforeAll, @AfterAll, @Test

public class Test7 {

    @BeforeAll
    public static void first() {
        System.out.println("I run first.");
    }

    @AfterAll
    public static void last() {
        System.out.println("I run last.");
    }

    @Test
    public void test1() {
        System.out.println("Inside test1.");
    }

    @Test
    public void test2() {
        System.out.println("Inside test2.");
    }
}