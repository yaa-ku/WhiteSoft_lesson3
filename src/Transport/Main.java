package Transport;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        Wheel wheel = new Wheel();
        Engine engine = new Engine("some name", "some model", "disel");
        Car car = new Car("Toyota", "Corolla", "yellow", wheel, engine, "123fgh", "134242r5");
        System.out.println(car.getInfo());
        System.out.println(car.Ride());
        System.out.println(car.Crash());
        System.out.println(car.Ride());
        System.out.println(car.Repair());
        System.out.println(car.Ride());
        engine.Ruin();
        System.out.println(car.Ride());
        System.out.println(car.Repair());
        System.out.println(car.Ride());
    }
}
