/* CsvFileSource() allows you to read-in and use a CSV file directly.
 * numLinesToSkip allows you to skip the header line (if one exists). */
package craighawkins.section7;

import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.provider.*; //@CsvSource
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test21_CsvFileSource2 {
	
	//note: data2.csv consists of this:
	//"player", "position", "points"
	//"Joe", "goalie", 0
	//"Susan", "forward", 10
	
	@ParameterizedTest
    @CsvFileSource(resources = "data2.csv", numLinesToSkip=1) //skipping the title line
    public void myTest(String a, String b, int c) {
		assertTrue(a != null);
		assertTrue(b != null);
        assertTrue(c >= 0);
    }
}