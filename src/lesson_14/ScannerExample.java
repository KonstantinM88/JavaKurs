package lesson_14;

import java.util.Locale;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        String data = "3,14 42,7";
        Scanner sc = new Scanner(data);

      //  sc.useLocale(Locale.US);

        //Locale - используеться локаль Вашей системы для определения формата чисел
        //В том числе каким знаком отделяеться дробная часть числа

        //Locale.US - дробная часть отделяеться точкой
        //Locale.GERMANY - дробная часть отделяеться запятой

        System.out.println(sc.nextDouble());
        System.out.println(sc.nextDouble());
        System.out.println(Locale.getDefault());

        String text = "42,Java,3.14,Hello";
        Scanner scanner = new Scanner(text);
        scanner.useLocale(Locale.US); // Устанавливаем для сканера локаль
//          scanner.useDelimiter(",");
//          scanner.useDelimiter("[;|]"); // разделитель ; или |
        scanner.useDelimiter(",");

        System.out.println(scanner.nextInt());
        String java = scanner.next();
        System.out.println(java);
        System.out.println(scanner.nextDouble());
        System.out.println(scanner.next());


    }
}
