/* Parameterized tests: ArgumentsAccessor, @CsvSource
 * You can create objects, etc. */
/* ArgumentsAccessor has many different getters:
getBoolean, getByte, getCharacter, getDouble, getFloat, 
getInteger, getLong, getShort, getString */	
package craighawkins.section7;

import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.aggregator.ArgumentsAccessor; //ArgumentsAccesor
import org.junit.jupiter.params.provider.*; //@CsvSource 
import static org.junit.jupiter.api.Assertions.*; //assertEquals()

public class Test43_ArgumentsAccessor4 {

	@ParameterizedTest
	//name, major, has scholarship, gpa
	@CsvSource({"Tom, chemistry, false, 2.5",
				"Mary, physics, true, 3.5",
				"Susan, biology, false, 4.0"})
	public void myTest(ArgumentsAccessor args) {
		Student student = new Student();
		student.name = args.getString(0);
		student.major = args.getString(1);
		student.hasScholarship = args.getBoolean(2);
		student.GPA = args.getDouble(3);
		
		if (student.hasScholarship == true) {
			//a student on scholarship should 
			//have a GPA of 3.0 or higher
			assertTrue(student.GPA >= 3.0);
		}
	}
}