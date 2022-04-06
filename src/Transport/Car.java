package Transport;

public class Car  extends Transport{
    protected  Engine engine;
    protected String number;
    protected String VIN;

    public Car(){
        super();
        this.number_of_wheels = 4;
        this.engine = new Engine();
        this.VIN = "undefined";
        this.number = "undefined";
    }

    public Car(String brand, String model, String color, Wheel wheel,
               Engine engine, String number, String VIN) {
        super(brand, model, color, 4, wheel);
        this.engine = engine;
        this.number = number;
        this.VIN = VIN;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+", number - " + this.number +
                ", VIN - " + this.VIN +
                ", engine name - " + this.engine;
    }

    @Override
    public String Ride() {
        if (!this.isRideable){
            return "you can't ride a broken car. repair it first!";
        }
        else if (!this.engine.isWorking) {
            return "you can't ride a car with a broken engine. repair it first!";
        }
        else {
            return "this " + this.color + " car is riding!";
        }
    }

    @Override
    public String Crash() {
        isRideable = false;
        return "oh no! your car is broken! go and repair it";
    }

    @Override
    public String Repair() {
        isRideable = true;
        this.engine.isWorking = true;
        return "car is repaired! good job c:";
    }
}
