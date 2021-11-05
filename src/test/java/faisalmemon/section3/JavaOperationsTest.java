package faisalmemon.section3;

import org.junit.jupiter.api.*;

class JavaOperationsTest {
    JavaOperations javaOp = new JavaOperations();

    @BeforeAll
    public static void init() {
        System.out.println("Before all..");
    }

    @AfterAll
    public static void cleanUp() {
        System.out.println("Cleanup in process..");
    }

    @AfterEach
    void close() {
        System.out.println("After each..");
    }

    @Test
    @DisplayName("First test..")
    void addTest() {
        int expected = 9;
        int actual = javaOp.add(4, 5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Second test..")
    void multiplyTest() {
        int expected = 20;
        int actual = javaOp.multiply(4, 5);
        Assertions.assertEquals(expected, actual);
    }
}