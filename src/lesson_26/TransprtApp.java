package lesson_26;

public class TransprtApp {

    public static void main(String[] args) {

        Bus bus = new Bus("Bus-X1", 2020, 10);

        String str = bus.toString();
        System.out.println(str);

        bus.start();
        bus.stop();

        System.out.println("bus.getModel(): " + bus.getModel());

        System.out.println("compacity: " + bus.getCopacity());

        System.out.println("\n================");

        Train train = new Train("Skoda", 2022, 7, 25);

        System.out.println(train.toString());
        train.start();
        train.stop();

        System.out.println("capacity: " * train.getCapacity());
        train.setCountWagons(10);
        System.out.println("capacity: ");
    }
}
