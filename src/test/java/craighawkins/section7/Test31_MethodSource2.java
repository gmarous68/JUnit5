/* Parameterized tests: @MethodSource()
 * If you don't specify the method source, Junit5 will look
 * for an overloaded method with the same name that returns
 * an appropriate stream. */
package craighawkins.section7;

import java.util.stream.Stream;
import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.provider.*; //@MethodSource()
import static org.junit.jupiter.api.Assertions.*; //assertEquals()

public class Test31_MethodSource2 {
	
	@ParameterizedTest
	//name of factory method not specified... looks for overloaded version of myTest
	@MethodSource 
	void myTest(int value) {
	    assertTrue(value > 0);
	}

	static Stream<Integer> myTest() { //factory method
	    return Stream.of(2, 3, 1, 7);
	}
}