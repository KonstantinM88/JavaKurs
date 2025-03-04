package lesson_13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        //Строка подготавливает программу для чтения данных из стандарного потока ввода
        // от пользователя через клавиатуру

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввыедите Ваше имя: ");
        // Читает всю строу введеную пользователя и возвращает в виде Sting

        String name = scanner.nextLine();
        System.out.println("Привет, " + name);

        // Прочитать число
        System.out.println("Введите Ваш возраст: ");
        int age = scanner.nextInt(); // Считает одно число типа int
        // Всегда после вызова методов nextInt,nextDouble, next() и т.п.
        //Следует вызывать метод nextLine(), чтобы скушать остаток строки
        scanner.nextLine();
        System.out.println("Age: " + age);

        System.out.println("Введите город: ");
        String city = scanner.nextLine();
        System.out.println("City: " + city);

        // Todo Чтение токенами чисел

        //Разделитель - пробельный символ
        /*
        \s+ - пробельный символ
        - пробел (в любом количестве подряд)
        - знак табуляции (подряд)
        - перевод каретки

         */
        System.out.println("Введите число пи: ");
        double pi = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Pi: " + pi);

    }
}
