package lesson_12;

public class Overflow {
    public static void main(String[] args) {

        // -128...127
        byte byteVar = 127;
        System.out.println("byteVar " + byteVar);
        // При добавлении к максимальному числу диапазона 1 - мы получаем минимальное число диапазона
        byteVar++;
        System.out.println("byteVar+1 " + byteVar);
        // При вычитании 1 из минимального числа - получим максимальное число в диапазоне
        byteVar--;
        System.out.println("byteVar-- " + byteVar);

        short shortVar = 32767;
        System.out.println("shortVar " + shortVar);
        shortVar += 5;
        System.out.println("shortVar+=5 " + shortVar);


    }
}
