package craighawkins.section4;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertNotEquals()
import org.junit.jupiter.api.DisplayName; //@DisplayName()
import org.junit.jupiter.api.Nested; //@Nested

public class StringUtilitiesTest {

    @Nested
    @DisplayName("Testing vowel methods:")
    class A {
        @Test
        @DisplayName("given 'apple' as the input, vowelCount should return 2")
        public void testVowelCount() {
            assertEquals(2, StringUtilities.vowelCount("apple"));
        }

        @Test
        @DisplayName("given 'orbit' as the input, startsWithVowel should return true")
        public void testStartsWithVowel() {
            assertTrue(StringUtilities.startsWithVowel("orbit"));
        }
    }

    @Nested
    @DisplayName("Testing consonant methods:")
    class B {
        @Test
        @DisplayName("given 'dark' as the input, endsWithConsonant should return true")
        public void testEndsWithConsonant() {
            assertTrue(StringUtilities.endsWithConsonant("dark"));
        }
    }
}