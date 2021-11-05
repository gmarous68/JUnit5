package craighawkins.section5;

/* test suites: @SelectPackages
 * @SelectPackages() tells JUnit to run the test classes
 * specified in the argument list
 *
 * note: make sure all of the classes you want to test either:
 * 1) begin with the word Test
 * or:
 * 2) end with the word Test or Tests
 * (this naming requirement it is a limitation of JUnit)*/

import org.junit.runner.RunWith; //@RunWith
import org.junit.platform.runner.JUnitPlatform; //JunitPlatform.class
import org.junit.platform.suite.api.*; //@IncludeEngines, @SelectPackages

@RunWith(JUnitPlatform.class) //use JUnitPlatform
@IncludeEngines("junit-jupiter") //use JUnit Jupiter to run the test suites
@SelectPackages({"craighawkins.veggie1_test_suites", "craighawkins.veggie2_test_suites"}) //run all these
public class TestRunner1 {
}