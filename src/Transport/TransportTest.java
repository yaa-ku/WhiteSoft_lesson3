package Transport;

import static org.junit.jupiter.api.Assertions.*;

class TransportTest {

    @org.junit.jupiter.api.Test
    void testTransportGetInfoMethodDefaultTransport() {
        Transport transport = new Transport();
        transport.getInfo();

        assertEquals("car info: brand - undefined, model - undefined, " +
                "is okay? - true, color - undefined, number of wheels - 0", transport.getInfo());
    }

    @org.junit.jupiter.api.Test
    void testTransportGetInfoMethod() {
        Transport transport = new Transport("brand", "model", "color", 10, new Wheel());
        transport.getInfo();

        assertEquals("car info: brand - brand, model - model, " +
                "is okay? - true, color - color, number of wheels - 10", transport.getInfo());
    }

    @org.junit.jupiter.api.Test
    void testTransportRideMethodCarIsOk() {
        Transport transport = new Transport();
        transport.Ride();

        assertEquals("what are you driving? but it's working", transport.Ride());
    }

    @org.junit.jupiter.api.Test
    void testTransportRideMethodCarIsCrashed() {
        Transport transport = new Transport();
        transport.setRideable(false);
        transport.Ride();

        assertEquals("you can't ride a broken... some transport stuff. repair it first!", transport.Ride());
    }

    @org.junit.jupiter.api.Test
    void testTransportCrashMethod() {
        Transport transport = new Transport();
        transport.Crash();

        assertFalse(transport.isRideable());
        assertEquals("oh no! your transport is broken! go and repair it",transport.Crash());
    }

    @org.junit.jupiter.api.Test
    void testTransportRepairMethod() {
        Transport transport = new Transport();
        transport.setRideable(false);
        transport.Repair();

        assertTrue(transport.isRideable());
        assertEquals("your transport is repaired! good job c:",transport.Repair());
    }
}