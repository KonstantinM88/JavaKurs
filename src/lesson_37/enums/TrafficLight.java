package lesson_37.enums;

public class TrafficLight {

    private String serialNumber;
    private String location;

    private String light;

    public TrafficLight(String serialNumber, String location, String light) {
        this.serialNumber = serialNumber;
        this.location = location;
        this.light = light;
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "serialNumber='" + serialNumber + '\'' +
                ", location='" + location + '\'' +
                ", light='" + light + '\'' +
                '}';
    }
}
