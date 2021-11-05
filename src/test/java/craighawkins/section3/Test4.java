package craighawkins.section3;

import org.junit.jupiter.api.TestMethodOrder; //@TestMethodOrder()
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation; //OrderAnnotation.class
import org.junit.jupiter.api.*; //@Order, @Test, @RepeatedTest()

@TestMethodOrder(OrderAnnotation.class)
public class Test4 {

    @RepeatedTest(4) //run this test four times
    @Order(2) //run this test second
    public void apple() {
        System.out.println("apple");
    }

    @Test //run this test once
    @Order(1) //run this test first
    public void banana() {
        System.out.println("banana");
    }
}