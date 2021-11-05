/* parameterized tests: @ValueSource */
/* bytes, chars, classes, doubles, floats, ints, longs, shorts, strings */
package craighawkins.section7;

import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.provider.*; //@ValueSource
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test1_ValueSource {

	@ParameterizedTest
	@ValueSource(strings = {"a","b","c"})
	public void test1(String element) {
		assertTrue(element.length() == 1);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3})
	public void test2(int element) {
		assertTrue(element < 10);
	}
}