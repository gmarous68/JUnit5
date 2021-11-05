/* @MethodSource: integers example */
package craighawkins.section7;

import java.util.stream.Stream; //Stream
import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource; //@MethodSource()
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test30_MethodSource1 {
	
	@ParameterizedTest
	//looks for factory method named "myNumbersMethod"
	@MethodSource("myNumbersMethod") 
	void myTest(Integer value) {
		assertTrue(value > 0);
	}
	
	static Stream<Integer> myNumbersMethod() { //factory method
		return Stream.of(2, 3, 1, 7);
	}
}