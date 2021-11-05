package craighawkins.section2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test; //@Test

public class CircleTest {

    @Test
    public void testRadius() {
        Circle cir = new Circle(5);
        Assertions.assertEquals(5, cir.getRadius());
    }

    @Test
    public void testGetDiameter() {
        Circle cir = new Circle(5);
        Assertions.assertEquals(10, cir.getDiameter());
    }

    @Test
    public void testGetCircumference() {
        Circle cir = new Circle(5);
        double expected = 2 * 3.14 * cir.getRadius();
        Assertions.assertEquals(expected, cir.getCircumference());
    }

    @Test
    public void testGetArea() {
        Circle cir = new Circle(5);
        double expected = 3.14 * cir.getRadius() * cir.getRadius();
        Assertions.assertEquals(expected, cir.getArea());
    }
}