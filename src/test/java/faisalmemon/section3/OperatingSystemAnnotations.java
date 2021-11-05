package faisalmemon.section3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

class OperatingSystemAnnotations {

    @Test
    @EnabledOnOs(OS.MAC)
    @DisabledOnOs(OS.WINDOWS)
    public void printHello(){
        System.out.println("Hello");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    @DisabledOnOs(OS.MAC)
    public void printHelloPython(){
        System.out.println("Hello Python");
    }
}