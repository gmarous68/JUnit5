/* assertTimeout() */
/* if anonymous function finishes within 2000 milliseconds: green bar */
package craighawkins.section6;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertTimeout()
import java.time.Duration; //Duration.ofMillis()

public class Test2 {

	@Test
	public void myTest() {
		assertTimeout(Duration.ofMillis(2000),() -> {});
	}
}