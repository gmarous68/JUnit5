package craighawkins.section2;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //fail()

public class GamePlayer2Test {

    @Test
    public void testMoveLeft() {
        GamePlayer2 gamePlayer = new GamePlayer2();
        gamePlayer.moveLeft();

        if (gamePlayer.getCoordinates()[0] < 0) {
            fail("player should not be allowed to move off screen");
        }

        gamePlayer.displayCoordinates();
    }
}