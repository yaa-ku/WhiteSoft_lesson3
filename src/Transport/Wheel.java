package Transport;

public class Wheel {
    private String transport_type;
    private String season_type; //зимняя или летняя
    private String name;

    public String getTransport_type() {
        return transport_type;
    }

    public void setTransport_type(String transport_type) {
        this.transport_type = transport_type;
    }

    public String getSeason_type() {
        return season_type;
    }

    public void setSeason_type(String season_type) {
        this.season_type = season_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
