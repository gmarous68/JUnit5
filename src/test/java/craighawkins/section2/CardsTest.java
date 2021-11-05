package craighawkins.section2;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertTrue(), assertFalse()

public class CardsTest {

    @Test
    public void testIsSuit() {
        Cards cards = new Cards();
        assertTrue(cards.isSuit("diamonds"));
        assertFalse(cards.isSuit("baseball"));
    }
}