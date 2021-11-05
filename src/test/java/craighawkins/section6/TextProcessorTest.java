package craighawkins.section6;

import org.junit.jupiter.api.Test; //@Test
import static org.junit.jupiter.api.Assertions.assertThrows; //assertThrows()
import java.io.*; //FileNotFoundException

public class TextProcessorTest {

    @Test
    public void myTest() throws Exception {
        String inPath = "C:\\JavaCode\\JUnit5\\src\\main\\java\\craighawkins\\section6\\infile.txt";
        String outPath = "C:\\JavaCode\\JUnit5\\src\\main\\java\\craighawkins\\section6\\outfile.txt";
        TextProcessor.capitalize(inPath, outPath);
        assertThrows(FileNotFoundException.class,
                ()-> {TextProcessor.capitalize(inPath, outPath);});
    }
}