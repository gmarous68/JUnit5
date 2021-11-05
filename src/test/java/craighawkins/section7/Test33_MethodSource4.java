/* @MethodSource: multiple parameters example.
 * In this example, we want to make sure no fruit is out of stock. */
package craighawkins.section7;

import java.util.stream.Stream; //Stream
import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource; //@MethodSource()
import org.junit.jupiter.params.provider.Arguments; //Arguments
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test33_MethodSource4 {
	
	@ParameterizedTest
	@MethodSource("fruitInventory")
	void myTest(String fruit, int quantity) {
		assertTrue(fruit.length() > 0);
		assertTrue(quantity > 0);
	}
	 
	private static Stream<Arguments> fruitInventory() { //factory method
		//syntax for multiple parameters
		return Stream.of(
			Arguments.of("apple", 10),
			Arguments.of("banana", 5),
			Arguments.of("cherry", 20)
		);
	}
}