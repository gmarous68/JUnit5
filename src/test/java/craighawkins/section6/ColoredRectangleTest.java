package craighawkins.section6;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertTimeout()

import java.time.Duration;

public class ColoredRectangleTest {

    ColoredRectangle rectangle = new ColoredRectangle(1000, 2000);

    @Test
    public void myTest() {
        assertTimeout(Duration.ofMillis(200),
                () -> { rectangle.dim(0.1F); });
    }
}