package craighawkins.section6;

import java.io.File; //File
import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assumptions.*; //assumingThat()
import static org.junit.jupiter.api.Assertions.*; //assertTrue()

public class TextAnalyzerTest {

    @Test
    public void test1() {
        String path = "C:\\JavaCode\\JUnit5\\src\\main\\java\\craighawkins\\section6\\infile.txt";
        File file = new File(path);
        assumingThat(file.exists(), () -> {assertTrue(TextAnalyzer.countVowels(path) >= 0);});
    }
}

/* contents of infile.txt:
hello there
apple banana
cherry
*/