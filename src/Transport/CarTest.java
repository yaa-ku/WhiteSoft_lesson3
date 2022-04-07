package Transport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testGetCarInfoDefault() {
        Car car = new Car();
        car.getInfo();

        assertEquals("car info: brand - undefined, model - undefined, " +
                "is okay? - true, color - undefined, number of wheels - 4" +
                ", number - undefined, VIN - undefined" +
                ", engine name - undefined", car.getInfo());
    }

    @Test
    void testGetCarInfo() {
        Car car = new Car("brand", "model", "color", new Wheel(), new Engine(), "number", "VIN");
        car.getInfo();

        assertEquals("car info: brand - brand, model - model, " +
                "is okay? - true, color - color, number of wheels - 4" +
                ", number - number, VIN - VIN" +
                ", engine name - undefined", car.getInfo());
    }

    @Test
    void testCarRideMethodCarIsOk() {
        Car car = new Car();
        car.Ride();

        assertEquals("this " + car.getColor() + " car is riding!", car.Ride());
    }

    @Test
    void testCarRideMethodEngineIsBroken() {
        Engine engine = new Engine();
        engine.setWorking(false);

        Car car = new Car();
        car.setEngine(engine);
        car.Ride();

        assertEquals("you can't ride a car with a broken engine. repair it first!", car.Ride());
    }

    @Test
    void testCarRideMethodCarIsBroken() {
        Car car = new Car();
        car.setRideable(false);
        car.Ride();

        assertEquals("you can't ride a broken car. repair it first!", car.Ride());
    }

    @Test
    void testCarRideMethodEngineIsBrokenAndCarIsBroken() {
        Engine engine = new Engine();
        engine.setWorking(false);

        Car car = new Car();
        car.setEngine(engine);
        car.setRideable(false);
        car.Ride();

        assertEquals("you can't ride a broken car. repair it first!", car.Ride());
    }

    @Test
    void testCarCrashMethod() {
        Car car = new Car();
        car.Crash();

        assertFalse(car.isRideable());
        assertEquals("oh no! your car is broken! go and repair it",car.Crash());
    }

    @Test
    void testCarRepairMethod() {
        Car car = new Car();
        car.setRideable(false);
        car.Repair();

        assertTrue(car.isRideable());
        assertEquals("car is repaired! good job c:", car.Repair());
    }
}