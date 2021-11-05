package craighawkins.section3;

import org.junit.jupiter.api.*; //@RepeatedTest()
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class CoinTest {

    @RepeatedTest(10)
    public void testFlip() {
        int headsCount = 0;
        int	tailsCount = 0;
        for (int i = 0; i < 1000000; i++) { //a million coin flips
            String result = Coin.flip();
            if (result == "heads") headsCount++;
            else tailsCount++;
        }

        int difference = Math.abs(headsCount - tailsCount);
        assertTrue(difference < 10000); //should be within 1%
    }
}