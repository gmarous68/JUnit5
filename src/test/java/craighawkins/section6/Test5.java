/* assertTimeout() */
/* red bar. all 5 apples print, banana never reaches. */
package craighawkins.section6;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertTimeout()
import java.time.Duration; //Duration.ofSeconds()

public class Test5 {

	@Test
	public void myTest() {
		assertTimeout(Duration.ofMillis(2000),
				() -> {
					for (int i = 0; i < 5; i++) {
						System.out.println("apple");
						Thread.sleep(900);
					}
				});
		System.out.println("banana"); //never reaches
	}
}