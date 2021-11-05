package craighawkins.section4;

import java.util.*;

public class Alphabet {

    Set<Character> vowels = new HashSet<Character>();

    public Alphabet() {
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
    }

    public boolean isVowel(char vowel) {
        return vowels.contains(vowel);
    }

    //returns the character's corresponding ASCII integer value
    public int asciiValue(char ch) {
        return (int)ch;
    }
}