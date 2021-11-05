/* assertTimeout() */
/* if anonymous function  finishes with 2 seconds: green bar */
package craighawkins.section6;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertTimeout()
import java.time.Duration; //Duration.ofSeconds()

public class Test4 {

	@Test
	public void myTest() {
		assertTimeout(Duration.ofSeconds(2),
				     () -> {
				    	 for (int i = 0; i < 5; i++)
				    		 System.out.println("apple");
				     });
	}
}