/* assumptions: assumeTrue() */
package craighawkins.section6;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assumptions.*; //assumeTrue()
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test1_assumeTrue {

	@Test
	public void test1() {
		Double a = 5.0;
		assumeTrue(a != null); //true
		assumeTrue(a > 1.0); //true
		assertTrue(Math.sqrt(a) < a); //this line runs
	}	
	
	@Test
	public void test2() {
		Double a = null;
		assumeTrue(a != null); //test is abandoned immediately (but does not throw fail)
		System.out.println("I never reach."); //never reaches
		assumeTrue(a >= 1.0); //never reaches
		assertTrue(Math.sqrt(a) < a); //never reaches
	}
}