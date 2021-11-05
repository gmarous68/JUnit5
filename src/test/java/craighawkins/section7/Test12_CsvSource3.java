/* parameterized tests: @CsvSource */
package craighawkins.section7;

import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.provider.*; //@CsvSource() 
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test12_CsvSource3 {

	@ParameterizedTest
	@CsvSource({"0, ''", "3, abc", "5, apple"})
	public void test1(int expectedStringLength, String string) {
		assertTrue(expectedStringLength == string.length());
	}
}