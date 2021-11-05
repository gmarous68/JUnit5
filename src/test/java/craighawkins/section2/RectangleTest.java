package craighawkins.section2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {
    @Test
    public void testIsSquare() {
        Rectangle rec = new Rectangle(25, 25);
        Assertions.assertTrue(rec.isSquare());

        rec = new Rectangle(24,5);
        Assertions.assertFalse(rec.isSquare());
    }
}