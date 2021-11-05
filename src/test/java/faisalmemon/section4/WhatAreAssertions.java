package faisalmemon.section4;

import org.junit.jupiter.api.Test;

class WhatAreAssertions {

    @Test
    public void assertAlternative(){
        JavaOperations javaOperations = new JavaOperations();
        if (javaOperations.add(4,4) == 8)
            System.out.println("Test passed");
        else
            System.out.println("Test failed");
    }
}