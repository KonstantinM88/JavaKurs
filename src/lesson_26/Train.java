package lesson_26;


// Train ia-a Bus - Не верно. Наследоваться не имею права
public class Train extends Vehicle {

    private int capacity;
    private  int countPassengers;

    private int countWagons;
    private final int wagonCapacity;

    public Train(String model, int year, int countWagons, int wagonCapacity) {
        super(model, year);
    //    this.capacity = capacity;
    //    this.countPassengers = countPassengers;
        this.countWagons = countWagons;
        this.wagonCapacity = wagonCapacity;
        // Определить вместимость - просчитать compacity
    }
    private void calculateCapacity() {
        this.capacity = countWagons * wagonCapacity;
    }
    public void setCountWagons (int countWagons) {
        this.countWagons = countWagons;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
    }
}
