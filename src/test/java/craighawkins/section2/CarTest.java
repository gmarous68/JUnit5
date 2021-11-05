package craighawkins.section2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void testGetSerialNumber() {
        Car car = new Car();
        assertNull(car.getSerialNumber());
    }

    @Test
    public void testSetSerialNumber() {
        Car car = new Car();
        car.setSerialNumber(123);
        assertNotNull(car.getSerialNumber());
    }
}