package craighawkins.fruit3_test_suites;
import org.junit.jupiter.api.*; //@Tag, @Test
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

@Tag("red_colored_fruit")
public class AppleTest {
	@Test
	public void apple() {
		assertTrue(true);
		System.out.println("apple");
	}	
}