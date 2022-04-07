package Transport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WheelTest {

    @Test
    void testWheelSpin() {
        Wheel wheel = new Wheel();
        wheel.Spin();

        assertEquals("i'm spinning", wheel.Spin());
    }
}