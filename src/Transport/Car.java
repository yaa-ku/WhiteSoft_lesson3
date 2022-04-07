package Transport;

public class Car  extends Transport{
    private   Engine engine;
    final private String number;
    final private String VIN;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getNumber() {
        return number;
    }

    public String getVIN() {
        return VIN;
    }

    public Car(){
        super();
        this.setNumber_of_wheels(4);
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
                ", engine name - " + this.engine.name;
    }

    @Override
    public String Ride() {
        if (!this.isRideable()){
            return "you can't ride a broken car. repair it first!";
        }
        else if (!this.engine.isWorking) {
            return "you can't ride a car with a broken engine. repair it first!";
        }
        else {
            return "this " + this.getColor() + " car is riding!";
        }
    }

    @Override
    public String Crash() {
        this.setRideable(false);
        return "oh no! your car is broken! go and repair it";
    }

    public String RuinEngine(){
        this.engine.Ruin();
        return "engine is ruined! you can't drive your car anymore";
    }

    @Override
    public String Repair() {
        this.setRideable(true);
        return "car is repaired! good job c:";
    }

    public String RepairEngine() {
        this.engine.Repair();
        return "engine is repaired! you can drive your car!";
    }
}
