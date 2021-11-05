/* assertThrows() */
//in this example, stack.pop() throws an empty stack exception
//assertThrows() was looking for that to happen, so the test passes
package craighawkins.section6;

import java.util.*; //Stack
import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertThrows()

public class Test8 {
	
	@Test
	public void myTest() throws InterruptedException {
		Stack<Integer> stack = new Stack<>();
		assertThrows(EmptyStackException.class, ()-> {stack.pop();});	
	}
}