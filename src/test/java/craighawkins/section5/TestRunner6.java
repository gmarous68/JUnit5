package craighawkins.section5;

/* test suites: @UseTechnicalNames
/* this annotation overrides @SuiteDisplayName (some environments such as
 * Gradle want to use the qualified class names rather than the display
 * names) */

import craighawkins.fruit3_test_suites.*; //AppleTest, BananaTest
import craighawkins.fruit4_test_suites.*; //WatermelonTest
import org.junit.runner.RunWith; //@RunWith
import org.junit.platform.runner.JUnitPlatform; //JunitPlatform.class
/* @SelectClasses, @SuiteDisplayName, @IncludeEngines, @UseTechnicalNames */
import org.junit.platform.suite.api.*;

@RunWith(JUnitPlatform.class) //use JUnitPlatform
@IncludeEngines("junit-jupiter") //use JUnit Jupiter to run the test suites
@SelectClasses({AppleTest.class, CherryTest.class, WatermelonTest.class})
@SuiteDisplayName("My Fruit Test Suite")
@UseTechnicalNames
public class TestRunner6 {
}

//notice how the green bars say:
//package250_test_suites.MyTestRunner6
//package250_test_suites.AppleTest
//package260_test_suites.CherryTest
//package270_test_suites.WatermelonTest
//watermelon rather than "my watermelon test"