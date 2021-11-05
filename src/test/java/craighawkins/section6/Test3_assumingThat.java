/* assumptions: assumingThat() */
package craighawkins.section6;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assumptions.*; //assumingThat()
import static org.junit.jupiter.api.Assertions.*; //assertEquals()

public class Test3_assumingThat {

	@Test
	public void test1() {
		assumingThat(true, () -> {}); //only run the lambda if the first parameter is true
	}
	
	@Test
	public void test2() {
		String string = "a";
		assumingThat(string.length() == 1, 
				() -> {
				System.out.println("apple");
				assertEquals(2, 2);
				}); //lambda runs because first argument is true
	}
	
	@Test
	public void test3() {
		assumingThat(false, 
				() -> {
				System.out.println("banana");
				assertEquals(2, 3);
				}); //statements in the lambda never run because first argument is false
		System.out.println("cherry");
	}	
}