/* assertTimeout() */
/* red bar. banana never reaches. */
package craighawkins.section6;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertTimeout()
import java.time.Duration; //Duration.ofSeconds()

public class Test3 {

	@Test
	public void myTest() {
		assertTimeout(Duration.ofSeconds(2),() -> {Thread.sleep(3000);});
		System.out.println("banana"); //not reached
	}
}