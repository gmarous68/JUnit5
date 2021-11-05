package craighawkins.fruit1_test_suites;
import org.junit.jupiter.api.*; //@Tag, @Test
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

@Tag("purple_colored_fruit")
public class GrapeTest {
	@Test
	public void grape() {
		assertTrue(true);
		System.out.println("grape");
	}	
}