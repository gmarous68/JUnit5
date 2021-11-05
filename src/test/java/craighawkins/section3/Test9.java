package craighawkins.section3;

import org.junit.jupiter.api.*; //@BeforeEach, @AfterEach, @RepeatedTest, etc.
import org.junit.jupiter.api.TestMethodOrder; //@TestMethodOrder
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation; //OrderAnnotation.class
import org.junit.jupiter.api.Order; //@Order

@TestMethodOrder(OrderAnnotation.class)
public class Test9 {

    @BeforeEach
    public void apple() {
        System.out.println("apple");
    }

    @AfterEach
    public void banana() {
        System.out.println("banana");
    }

    @RepeatedTest(3)
    @Order(2)
    public void cherry() {
        System.out.println("cherry");
    }

    @Test
    @Order(1)
    public void donut() {
        System.out.println("donut");
    }
}