package lesson_17;

import lesson_11.Hello;

public class MethodsExample {

    public static void main(String[] args) {
        sayHello();
        char ch = 'A';

        printDecimalCodeChar(ch);

        int[] array = {1, 45, 76, 54, 900, 435, 9, 0};
        printArray(array);

        array[3] = 1001;
        array[0] = -100_000;
        printArray(array);

        String[] strings = {"Hello", "Java", "Test", "World"};
        printArray(strings);

        testParametrOrder(1, "Hello");
        testParametrOrder("Java" , 200);


    } // Method area (место написания метода)

    /*
    Перегрузка методов

    В пределах одного класса может быть два и более методов с одинаковым именем
    но разным набором параметров (тип и порядок параметров имеет значение)


     */

    public static void testParametrOrder(int x, String str) {
        System.out.println("INT + STRING: " + x + " | " + str);
    }

    public static void testParametrOrder(String string, int y) {
        System.out.println("Другое поведение: " + string + " | " + y);
    }

    // Метод выводящий красиво все элементы массива СТРОК
    public static void printArray(String[] strings) {
        System.out.println("[");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + (i == strings.length - 1 ? "]\n" : ", "));
        }
    }



//Метод выводящий все элементы в массива целых чисел
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) { // перебираю индекс массива
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));

        }
    }

    public static void printDecimalCodeChar(char ch1) {
        //char ch1 = ch (из аргумента вызова) - условно выполняется строка при вызове метода (перед началом работы метода)
        System.out.println((int) ch1);
    }

    public static void sayHello() {
        //Тело метода
        System.out.println("Hello World!");
    }
} // End class
