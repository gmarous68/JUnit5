/* parameterized tests: @NullSource */
/* bytes, chars, classes, doubles, floats, ints, longs, shorts, strings */
//@NullSource: inserts null as the first element to be tested
package craighawkins.section7;

import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.provider.*; //@NullSource, @ValueSource
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test2_NullSource {

	@ParameterizedTest
	@NullSource
	@ValueSource(strings = {"a","b","c"})
	public void test1(String element) {
		assertTrue(element == null || element.length() == 1);
	}
}