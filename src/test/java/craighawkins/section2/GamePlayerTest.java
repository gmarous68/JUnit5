package craighawkins.section2;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertArrayEquals()

public class GamePlayerTest {

    @Test
    public void testMoveRight() {
        GamePlayer gamePlayer = new GamePlayer(); //coordinates start at {0, 0}
        gamePlayer.moveRight();

        int[] actual = gamePlayer.getCoordinates();
        int[] expected = {1, 0};

        assertArrayEquals(expected, actual);
    }
}