package craighawkins.section4;

import java.util.*;

public class StringUtilities {

    public static int vowelCount(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            String current = string.charAt(i) + "";
            if (current.matches("[aeiouAEIOU]")) count++;
        }
        return count;
    }

    public static boolean startsWithVowel(String string) {
        String firstCharacter = string.charAt(0) + "";
        return firstCharacter.matches("[aeiouAEIOU]");
    }

    public static boolean endsWithConsonant(String string) {
        String lastCharacter = string.charAt(string.length() - 1) + "";
        return lastCharacter.matches("[^aeiouAEIOU]");
    }
}