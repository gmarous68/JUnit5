/* assumptions: assumeFalse() */
package craighawkins.section6;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assumptions.*; //assumeFalse()
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test2_assumeFalse {

	@Test
	public void test1() {
		int i = 2;
		assumeFalse(i == 0 || i == 1); //correct assumption: i is neither 0 nor 1
		assertTrue(i*i > i); //allowed to run because assumption above was correct
	}	
	
	@Test
	public void test2() {
		int i = 0;
		assumeFalse(i == 0 || i == 1); //incorrect assumption
		System.out.println("hello"); //never runs: assumption short-circuited the method
		assertTrue(i*i > i); //never runs
	}
}