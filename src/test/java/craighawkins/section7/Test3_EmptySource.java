/* parameterized tests: @EmptySource */
/* bytes, chars, classes, doubles, floats, ints, longs, shorts, strings */
//@EmptySource: inserts the empty string as the first element to be tested
package craighawkins.section7;

import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.provider.*; //@EmptySource, @ValueSource
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test3_EmptySource {

	@ParameterizedTest
	@EmptySource //inserts the empty string as the first test argument
	@ValueSource(strings = {"a","b","c"})
	public void test1(String element) {
		assertTrue(element.isEmpty() || element.length() == 1);
	}
}