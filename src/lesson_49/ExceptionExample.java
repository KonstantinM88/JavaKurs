package lesson_49;

import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionExample {

    public static void main(String[] args) {

        //Ошибки компиляции
 //     int a = "Java";

        // Ошибки Runtime (время выполнения)

        //Exception (исключение) - представляют собой событие, которые могут возникнуть во время программы
        // и нарушить ее нормальное выполнение

//        Обработка ошибок - предусмотеть возможность появления Exception (объекта определённого класса)
//        и описать какой-то код, который будет выполнен в этом случае


        int[] array = {1,23,4};
    //    array[10] = 100; // java.lang.ArrayIndexOutOfBoundsException

    //    int x = 10 / 0; // java.lang.ArithmeticException

        try {
            array[2] = 10;
            System.out.println("Try continue");
        //    array[10] = 100;
            System.out.println("Try continue #2");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayException: " + e.getMessage());
        } catch (Exception exception) {
            System.out.println("какая-то ошибка");
            exception.printStackTrace();
        } finally {
            System.out.println("Finally");
        }


//        } catch (ArrayIndexOutOfBoundsException exception) {
//            System.out.println("Что-то не так с индексом: " + exception.getMessage());
//
//        }

        System.out.println("продолжение работы программы");

        System.err.println("Печатаю в потоке ошибок");

        System.out.println("================\n");

        // Проверяемые (checked exception) и не проверяемые исключения

        // Проверяемые (checked exception) - это тип исключения, наличие которых вы обяязаны провериь и обработать.
        // Непроверяемые исключения - это исключения, возможглсть проверять которых я не обязан обрабатывать в коде



    }

    private static String getUrlString() {
        URL myUrl = null;

        // бросает проверяемое исключение

        try {
            myUrl = new URL("http://example.com");
        } catch (MalformedURLException e) {
            System.out.println("Неверный формат URL: " + e.getMessage());
            return "http://google.com";
        }
        return myUrl.toString();

    }

    // Ключевое слово throws используется в сигнатуре метода для указания, что метод может выбросить исключения
    private static String getUrlString2() {
        URL myUrl = null;
        try {
            myUrl = new URL("http://example.com");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return myUrl.toString();
    }
}
