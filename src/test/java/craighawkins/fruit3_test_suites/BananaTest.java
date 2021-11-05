package craighawkins.fruit3_test_suites;
import org.junit.jupiter.api.*; //@Tag, @Test
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

@Tag("yellow_colored_fruit")
public class BananaTest {
	@Test
	public void banana() {
		assertTrue(true);
		System.out.println("banana");
	}	
}