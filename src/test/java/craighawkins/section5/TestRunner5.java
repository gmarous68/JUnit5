package craighawkins.section5;

/* test suites: @SuiteDisplayName()
/* this annotation allows you to customize the display
 * of the output. */

import craighawkins.fruit3_test_suites.*; //AppleTest, BananaTest
import craighawkins.fruit4_test_suites.*; //WatermelonTest
import org.junit.runner.RunWith; //@RunWith
import org.junit.platform.runner.JUnitPlatform; //JunitPlatform.class
/* @SelectClasses, @SuiteDisplayName, @IncludeEngines */
import org.junit.platform.suite.api.*;

@RunWith(JUnitPlatform.class) //use JUnitPlatform
@IncludeEngines("junit-jupiter") //use JUnit Jupiter to run the test suites
@SelectClasses({AppleTest.class, CherryTest.class, WatermelonTest.class})
@SuiteDisplayName("My Fruit Test Suite")
public class TestRunner5 {
}

//notice how the green bar says:
//My Fruit Test Suite