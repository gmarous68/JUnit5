package craighawkins.section3;

import org.junit.jupiter.api.TestMethodOrder; //@TestMethodOrder
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation; //OrderAnnotation.class
import org.junit.jupiter.api.*; //@BeforeEach, @AfterEach, @Test
import org.junit.jupiter.api.Order; //@Order()

@TestMethodOrder(OrderAnnotation.class)
public class Test6 {
    @BeforeEach
    public void a() {
        System.out.println("a");
    }

    @AfterEach
    public void b() {
        System.out.println("b");
    }

    @Test
    @Order(2)
    public void test1() {
        System.out.println("test 1");
    }

    @Test
    @Order(1)
    public void test2() {
        System.out.println("test 2");
    }
}