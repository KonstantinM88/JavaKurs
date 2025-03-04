package lesson_26;

public class Vehicle {
    private String model;
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return model + ", year of manufacture : " + year;
    }
    public void start() {
        System.out.println(model + " Начинает движение");
    }
    public void stop() {
        System.out.println(model + " останавливается");
    }


    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
