/* @MethodSource: strings example */
package craighawkins.section7;

import java.util.stream.Stream; //Stream
import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource; //@MethodSource()
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test32_MethodSource3 {
	
	@ParameterizedTest
	@MethodSource("fruitMethod")
	void myTest(String string) {
		assertTrue(string.length() > 0);
	}
	
	static Stream<String> fruitMethod() { //factory method
		//the stream data type can be String, etc.
		return Stream.of("apple", "banana", "cherry");
	}
}