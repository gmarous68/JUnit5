/* assertTimeout() 
 * first argument: allowed time duration
 * second argument: anonymous function to run within allowed time duration */
/* if anonymous function finishes within 3 seconds: green bar */
package craighawkins.section6;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertTimeout()
import java.time.Duration; //Duration.ofSeconds()

public class Test1 {

	@Test
	public void myTest() {
		assertTimeout(Duration.ofSeconds(3),() -> {});
	}
}