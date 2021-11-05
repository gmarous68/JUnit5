package craighawkins.section5;

/* test suites: @IncludeTags, @ExcludeTags
 * you can use these tags to include/exclude certain tests */

import org.junit.runner.RunWith; //@RunWith
import org.junit.platform.runner.JUnitPlatform; //JunitPlatform.class
/* @IncludeEngines, @SelectPackages, @IncludeTags, @ExcludeTags */
import org.junit.platform.suite.api.*;

@RunWith(JUnitPlatform.class) //use JUnitPlatform
@IncludeEngines("junit-jupiter") //use the jUnit Jupiter test engine
@SelectPackages({"craighawkins.fruit1_test_suites", "craighawkins.fruit2_test_suites"})
/* use brackets and comma separation if specifying more than one */
@IncludeTags({"red_colored_fruit", "yellow_colored_fruit"}) //must be at least one of
@ExcludeTags({"citrus_fruit", "non_tree_fruit"}) //must be none of
public class TestRunner4 {
}

//apple(), banana(), cherry() are the tests that get executed.
//reason: these are the tests that satisfy the following two requirements:
//1) are either a yellow_colored_fruit or a red_colored_fruit
//2) are not a citrus_fruit and are also not a non_tree_fruit
