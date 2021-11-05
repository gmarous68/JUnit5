/* assertThrows() */
//lhs argument: type of exception to be thrown
//rhs argument: the function that is supposed to throw an exception
//in this example, i.intValue() throws a null pointer exception
//assertThrows() was looking for that to happen, so the test passes
package craighawkins.section6;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertThrows()

public class Test6 {
	
	@Test
	public void myTest() {
		Integer i = null;
		assertThrows(NullPointerException.class, ()-> {i.intValue();});	
	}
}