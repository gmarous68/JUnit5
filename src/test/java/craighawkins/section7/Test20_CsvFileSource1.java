/* CsvFileSource() allows you to read-in and use a CSV file directly */
package craighawkins.section7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.*; //@ParameterizedTest
import org.junit.jupiter.params.provider.*; //@CsvFileSource

import java.io.File;

import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class Test20_CsvFileSource1 {
	//note: data.csv consists of this:
	//1, 2, 100
	//3, 4, 1000

	@ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    public void myTest(int a, int b, int c) {
        assertTrue(a + b < c);
    }
}