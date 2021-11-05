package craighawkins.section5;

/* test suites: @SelectClasses
 * tells jUnit specific classes to run.
 * the test classes can be from different packages */

import org.junit.runner.RunWith; //@RunWith
import org.junit.platform.runner.JUnitPlatform; //JunitPlatform.class
import org.junit.platform.suite.api.*; //@IncludeEngines, @SelectClasses

@RunWith(JUnitPlatform.class) //use JUnitPlatform
@IncludeEngines("junit-jupiter") //use JUnit Jupiter to run the test suites
@SelectClasses({craighawkins.veggie3_test_suites.BroccoliTest.class, craighawkins.veggie4_test_suites.SpinachTest.class})
public class TestRunner2 {
}

//broccoli() and spinach() run.
//reason: these are the test methods belonging to
//the test classes specified by @SelectClasses
