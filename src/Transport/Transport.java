package Transport;

class Transport {
    protected boolean isRideable;
    protected String color;
    final protected String brand;
    final protected String model;
    protected int number_of_wheels;
    protected Wheel wheel;

    public Transport(String brand, String model, String color,
                     int number_of_wheels, Wheel wheel) {
        this.isRideable = true;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.number_of_wheels = number_of_wheels;
        this.wheel = wheel;
    }

    public Transport() {
        this.isRideable = true;
        this.color = "undefined";
        this.brand = "undefined";
        this.model = "undefined";
        this.number_of_wheels = 0;
        this.wheel = new Wheel();
    }

    public String getInfo(){
        return "car info: brand - " + this.brand +
                ", model - "  + this.model +
                ", is okay? - " + this.isRideable +
                ", color - " + this.color +
                ", number of wheels - " + this.number_of_wheels;
    }

    public String Ride(){
        if (this.isRideable){
            return "what are you driving? but it's working";
        }
        else {
            return "you can't ride a broken... some transport stuff. repair it first!";
        }
    };

    public String Crash(){
        isRideable = false;
        return "oh no! your transport is broken! go and repair it";
    };

    public String Repair() {
        isRideable = true;
        return "your transport is repaired! good job c:";
    };
}
