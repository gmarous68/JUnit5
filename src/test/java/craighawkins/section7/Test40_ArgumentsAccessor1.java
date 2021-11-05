/* parameterized tests: ArgumentsAccessor, @CsvSource 
 * allows for a variable amount of arguments.  not using an
 * assert in this example... showing you the var-args concept. */
package craighawkins.section7;

import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.aggregator.ArgumentsAccessor; //ArgumentsAccesor
import org.junit.jupiter.params.provider.*; //@CsvSource 

public class Test40_ArgumentsAccessor1 {

	@ParameterizedTest
	@CsvSource({"1, 4",
				"1, 2, 3, 4",
				"1, 2, 3, 4, 5"})
	public void myTest(ArgumentsAccessor arguments) {
		int argsLength = arguments.size(); //lets you know how many args passed in 
		int sum = 0;
		for (int i = 0; i < argsLength; i++) {
			sum += arguments.getInteger(i);
		}
		System.out.println(sum);	
	}
}