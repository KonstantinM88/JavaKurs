package lesson_22;

public class Less22Main {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        System.out.println("В NUBERS: " );
        // [1, 3, 66, 5, 4]
        // add(100)

        MagicArray magic = new MagicArray();
        System.out.println(magic.toString());



        magic.add(5);
        magic.add(20);
        magic.add(0);
        magic.add(100);
        magic.add(6,7,8);
      //  magic.add(10, 20, 30, 40);

        String arrayToString = magic.toString();
        System.out.println("arrayToString: " + arrayToString);

        System.out.println("В массиве сейчас элементов: " + magic.size());


        magic.test();

        System.out.println("\n===================");
        int value = magic.get(0);
        System.out.println("magic.get(0):" + value);

        System.out.println("magicget(15): " + magic.get(15));
        System.out.println("magicget(-1): " + magic.get(-1));
        System.out.println("magicget(30): " + magic.get(30));


    }
} // Конец
