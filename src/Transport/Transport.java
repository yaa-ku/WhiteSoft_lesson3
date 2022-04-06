package Transport;

class Transport {
    private boolean isRideable;
    private String color;
    final private String brand;
    final private String model;
    private int number_of_wheels;
    private Wheel wheel;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public int getNumber_of_wheels() {
        return number_of_wheels;
    }

    public void setNumber_of_wheels(int number_of_wheels) {
        this.number_of_wheels = number_of_wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRideable() {
        return isRideable;
    }

    public void setRideable(boolean rideable) {
        isRideable = rideable;
    }

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
