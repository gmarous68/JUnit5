package craighawkins.fruit2_test_suites;
import org.junit.jupiter.api.*; //@Tag, @Test
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

@Tag("orange_colored_fruit")
@Tag("citrus_fruit")
public class TangerineTest {
	@Test
	public void tangerine() {
		assertTrue(true);
		System.out.println("tangerine");
	}	
}