package craighawkins.fruit2_test_suites;
import org.junit.jupiter.api.*; //@Tag, @Test
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

//note: the tag annotations can be placed on an entire class,
//a specific test method, or both

@Tag("red_colored_fruit") //the tag can be on an entire class
public class StrawberryTest {
	@Tag("non_tree_fruit") //the tag can be on a specific test
	@Test
	public void strawberry() {
		assertTrue(true);
		System.out.println("strawberry");
	}	
}