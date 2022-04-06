package Transport;

public class Wheel {
    public String transport_type;
    public String season_type; //зимняя или летняя
    public String name;

    public Wheel(String transport_type, String season_type, String name) {
        this.transport_type = transport_type;
        this.season_type = season_type;
        this.name = name;
    }

    public Wheel() {
        this.transport_type = "undefined";
        this.season_type = "undefined";
        this.name = "undefined";
    }

    public String Spin(){
        return "i'm spinning";
    }
}
