package craighawkins.section4;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.*; //assertTrue(), assertEquals()

public class AlphabetTest {

    @Test
    public void testIsVowel() {
        Alphabet alphabet = new Alphabet();
        char myChar = 'a';
        assertTrue(alphabet.isVowel(myChar), "check your input!!!");
    }

    @Test
    public void testAsciiValue() {
        Alphabet alphabet = new Alphabet();
        char myChar = 'a';
        assertEquals(97, alphabet.asciiValue(myChar), "something's wrong!!!");
    }
}