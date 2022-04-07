package Transport;

public class Engine {
    protected boolean isWorking;
    final protected String name;
    final protected String model;
    final protected String fuel_type;

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public Engine() {
        this.name = "undefined";
        this.isWorking = true;
        this.model = "undefined";
        this.fuel_type = "undefined";
    }

    public Engine(String name, String model, String fuel_type) {
        this.name = name;
        this.isWorking = true;
        this.model = model;
        this.fuel_type = fuel_type;
    }

    public String Work(){
        if (isWorking){
            return "i'm working!";
        }
        else {
            return "i'm not working! repair me!";
        }
    }

    public void Ruin(){
        isWorking = false;
    }

    public void Repair(){
        isWorking = true;
    }
}
