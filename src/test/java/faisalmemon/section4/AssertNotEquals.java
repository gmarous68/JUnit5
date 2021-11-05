package faisalmemon.section4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssertNotEquals {

    @Test
    public void assertNotEqualsDemo(){
        JavaOperations javaOperations = new JavaOperations();
        Assertions.assertNotEquals(8, javaOperations.add(4,5));
        //Assertions.assertNotEquals(9, javaOperations.add(4,5), "Assertion add(4,5) failed");
    }
}