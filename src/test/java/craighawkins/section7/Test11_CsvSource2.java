/* parameterized tests: @CsvSource */
package craighawkins.section7;

import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.provider.*; //@CsvSource() 
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test11_CsvSource2 {

	@ParameterizedTest
	@CsvSource({"1, 2, 3", "4, 5, 6", "7, 8, 9"})
	public void test1(int first, int second, int third) {
		assertTrue(first < second);
		assertTrue(second < third);
	}
}