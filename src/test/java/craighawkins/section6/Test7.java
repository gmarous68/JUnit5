/* assertThrows() */
//in this example, x = 1/0 throws an arithmetic exception
//assertThrows() was looking for that to happen, so the test passes
package craighawkins.section6;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertThrows()

public class Test7 {
	
	@Test
	public void myTest() {
		assertThrows(ArithmeticException.class, ()-> {double x = 1/0;});	
	}
}