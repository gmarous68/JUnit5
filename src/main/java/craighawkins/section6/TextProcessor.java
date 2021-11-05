package craighawkins.section6;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner; 

public class TextProcessor {
	
	public static void capitalize(String inPath, String outPath) throws Exception {
		
		Scanner scanner = new Scanner(new File(inPath));
		FileWriter writer = new FileWriter(outPath);
		
		while (scanner.hasNextLine()) {
			String string = scanner.nextLine();
			string = string.toUpperCase() + System.lineSeparator();
			writer.write(string);
		}
		scanner.close();
		writer.close();
	}
}









/*
example input/output:

hello there
apple banana
cherry

HELLO THERE
APPLE BANANA
CHERRY

*/















