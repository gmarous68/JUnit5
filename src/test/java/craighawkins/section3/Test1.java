package craighawkins.section3;

import org.junit.jupiter.api.TestMethodOrder; //@TestMethodOrder
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation; //OrderAnnotation.class
import org.junit.jupiter.api.Order; //@Order
import org.junit.jupiter.api.Test; //@Test

@TestMethodOrder(OrderAnnotation.class)
public class Test1 {

    @Test
    @Order(1)
    public void apple() {
        System.out.println("apple");
    }

    @Test
    @Order(3)
    public void banana() {
        System.out.println("banana");
    }

    @Test
    @Order(2)
    public void cherry() {
        System.out.println("cherry");
    }
}