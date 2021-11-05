/* parameterized tests: ArgumentsAccessor, @CsvSource 
 * allows for a variable amount of arguments. */
package craighawkins.section7;

import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.aggregator.ArgumentsAccessor; //ArgumentsAccesor
import org.junit.jupiter.params.provider.*; //@CsvSource 
import static org.junit.jupiter.api.Assertions.*; //assertEquals()

public class Test41_ArgumentsAccessor2 {

	@ParameterizedTest
	@CsvSource({"A, 3, 4, 5",
				"B, 5, 12, 13",
				"C, 7, 24, 25"})
	public void myTest(ArgumentsAccessor arguments) {
		String triangleName = arguments.getString(0); 
		int sideA = arguments.getInteger(1);
		int sideB = arguments.getInteger(2);
		int sideC = arguments.getInteger(3);
		assertEquals(sideA*sideA + sideB*sideB, sideC*sideC);
	}
}