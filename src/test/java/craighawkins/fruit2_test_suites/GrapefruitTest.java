package craighawkins.fruit2_test_suites;
import org.junit.jupiter.api.*; //@Tag, @Test
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

@Tag("yellow_colored_fruit")
@Tag("citrus_fruit")
public class GrapefruitTest {
	@Test
	public void grapefruit() {
		assertTrue(true);
		System.out.println("grapefruit");
	}	
}