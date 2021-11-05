/* conditional test execution: @EnabledOnOs() 
 * others: @EnabledOnJre, @EnabledIfSystemProperty, ... */
package craighawkins.section8;

import org.junit.jupiter.api.Test; //@Test
import org.junit.jupiter.api.condition.*; //@EnabledOnOs
/* OS.AIX, OS.LINUX, OS.MAC, OS.OTHER, OS.MAC, OS.SOLARIS, OS.WINDOWS */
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test1 {
	
	@Test
	@EnabledOnOs({OS.WINDOWS}) //will run since running windows
	public void apple() {
		assertTrue(true);
		System.out.println("apple");
	}	
	
	@Test
	@EnabledOnOs({OS.SOLARIS}) //will not run since not running solaris
	public void banana() {
		assertTrue(true);
		System.out.println("banana");
	}	
}