package craighawkins.section6;

import java.io.File;
import java.util.Scanner; 

public class TextAnalyzer {
	
	public static int countVowels(String inPath) throws Exception {
		String vowelsRegex = "[aeiou]";
		int vowelCount = 0;

		Scanner scanner = new Scanner(new File(inPath));

		while (scanner.hasNextLine()) {
			String string = scanner.nextLine();
			string = string.toLowerCase();
			for (int i = 0; i < string.length(); i++) {
				String curr = Character.toString(string.charAt(i));
				if (curr.matches(vowelsRegex))
					vowelCount++;
			}
		}
		scanner.close();
		return vowelCount;
	}
}