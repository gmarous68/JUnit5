package craighawkins.section3;

import org.junit.jupiter.api.*; //@BeforeAll, @AfterEach, @Disabled, @Test

public class Test8 {

    @BeforeAll
    public static void apple() {
        System.out.println("apple");
    }

    @AfterEach
    public void banana() {
        System.out.println("banana");
    }

    @Disabled
    @Test
    public void cherry() {
        System.out.println("cherry");
    }

    @Test
    public void donut() {
        System.out.println("donut");
    }
}