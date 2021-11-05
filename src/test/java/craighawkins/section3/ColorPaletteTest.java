package craighawkins.section3;

import org.junit.jupiter.api.*; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class ColorPaletteTest {

    @Test
    public void testHasColor() {
        ColorPalette colorPalette = new ColorPalette();
        String[] values = {"red", "green", "black"};

        for (String value : values) {
            assertTrue(colorPalette.hasColor(value));
        }
    }
}