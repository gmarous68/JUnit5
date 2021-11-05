/* parameterized tests: @CsvSource */
package craighawkins.section7;

import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.provider.*; //@CsvSource()
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test10_CsvSource1 {

	@ParameterizedTest
	@CsvSource({"1, 2", "4, 7", "9, 20"})
	public void test1(int first, int second) {
		assertTrue(first < second);
	}
}