package craighawkins.section3;

import java.util.*; //ArrayList, Scanner
import java.net.URL; //URL
import java.io.*; //File
import org.junit.jupiter.api.*; //@BeforeAll, @AfterAll, @Test
import static org.junit.jupiter.api.Assertions.*; //assertEquals

public class DataTest {

    static ArrayList<Integer> numbersList;
    static URL path;
    static File file;
    static Scanner scanner;

    @BeforeAll //read the text file into the array list
    public static void init() throws FileNotFoundException {
        numbersList = new ArrayList<Integer>();
        file = new File("C:\\JavaCode\\Junit5\\src\\main\\java\\craighawkins\\section3\\numbers.txt");
        scanner = new Scanner(file);
        while (scanner.hasNext()) {
            Integer i = Integer.parseInt(scanner.next());
            numbersList.add(i);
        }
    }

    @Test
    public void testFindLargest() {
        int computedValue = Data.findLargest(numbersList);
        int expectedValue = 40;
        assertEquals(expectedValue, computedValue);
    }

    @AfterAll
    public static void tearDown() {
        scanner.close();
    }
}