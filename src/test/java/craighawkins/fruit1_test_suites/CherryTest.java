package craighawkins.fruit1_test_suites;
import org.junit.jupiter.api.*; //@Tag, @Test
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

@Tag("red_colored_fruit")
public class CherryTest {
	@Test
	@Tag("tree_fruit")
	public void cherry() {
		assertTrue(true);
		System.out.println("cherry");
	}	
}