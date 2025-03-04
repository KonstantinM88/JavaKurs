package lesson_12;

public class PrintFormat {
    public static void main(String[] args) {

        double result = 20.0 / 7;
        int age = 25;
        String name = "Alice";

        System.out.println("Name: " + name + ", Age: " + age + ",score: " + result);
        // "Шаблон {varName} строки"

        // printf() - форматированы вывод
        System.out.printf("Name: %s, Age: %d, score: %f\n ", name, 18, result);
        System.out.println("Привет я карвет");


        /*
        Место куда я хочу вставить значение переменной всегда  помечаю значком %
        После % я должен указать тип данных
        %d - целое число (digit)
        %f - число с плавающей точкой (float)
        %f3 - колличество цифр после точки
        %s - текст (string - строка)
        \n - работает в любой строке, добавляет перевод каретки на новую строку
        %n - символ новой строки (работает только в printf)

        //sout - println
        //souf - printf
         */

    }
}
