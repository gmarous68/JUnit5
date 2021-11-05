/* parameterized tests: @EnumSource */
package craighawkins.section7;

import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.provider.*; //@EnumSource
import static org.junit.jupiter.api.Assertions.*; //assertNotNull()

public class Test4_EnumSource {

	public enum Color {RED, GREEN, BLACK}
	public enum Fruit {APPLE, BANANA, CHERRY}
	
	@ParameterizedTest
	@EnumSource(Color.class) //you pass in the enum type you want to test over
	public void test1(Color element) {
		assertNotNull(element);
	}
	
	@ParameterizedTest
	@EnumSource(Fruit.class)
	public void test2(Fruit element) {
		assertNotNull(element);
	}
}