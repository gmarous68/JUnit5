package craighawkins.section3;

import org.junit.jupiter.api.*; //@BeforeEach, @AfterEach, @Test
import static org.junit.jupiter.api.Assertions.*; //assertArrayEquals()

public class GamePlayerTest {
    GamePlayer gamePlayer;

    @BeforeEach
    public void init() {
        gamePlayer = new GamePlayer();
        gamePlayer.setCoordinates(100, 100);
    }

    @AfterEach
    public void clear() {
        gamePlayer = null;
    }

    @Test
    public void testMoveLeft() {
        gamePlayer.moveLeft();
        int[] computedResult = gamePlayer.getCoordinates();
        int[] expectedResult = {99, 100};
        assertArrayEquals(expectedResult, computedResult);
    }

    @Test
    public void testMoveRight() {
        gamePlayer.moveRight();
        int[] computedResult = gamePlayer.getCoordinates();
        int[] expectedResult = {101, 100};
        assertArrayEquals(expectedResult, computedResult);
    }

    @Test
    public void testMoveUp() {
        gamePlayer.moveUp();
        int[] computedResult = gamePlayer.getCoordinates();
        int[] expectedResult = {100, 99};
        assertArrayEquals(expectedResult, computedResult);
    }

    @Test
    public void testMoveDown() {
        gamePlayer.moveDown();
        int[] result = gamePlayer.getCoordinates();
        int[] expectedResult = {100, 101};
        assertArrayEquals(expectedResult, result);
    }
}