package craighawkins.section5;

/* test suites: @SelectClasses with import statement
 * tells jUnit specific classes to run.
 * using import statements can make the naming inside of
 * @SelectClasses cleaner */

import org.junit.runner.RunWith; //@RunWith
import craighawkins.veggie4_test_suites.*; //SpinachTest
import craighawkins.veggie3_test_suites.*; //BroccoliTest
import org.junit.platform.runner.JUnitPlatform; //JunitPlatform.class
import org.junit.platform.suite.api.*; //@IncludeEngines, @SelectClasses

@RunWith(JUnitPlatform.class) //use JUnitPlatform
@IncludeEngines("junit-jupiter") //use JUnit Jupiter to run the test suites
@SelectClasses({BroccoliTest.class, SpinachTest.class})
public class TestRunner3 {
}

//broccoli() and spinach() run.
//reason: these are the test methods belonging to
//the test classes specified by @SelectClasses
//we imported package255_test_suites, so we didn't need to
//qualify the package name for SpinachTest