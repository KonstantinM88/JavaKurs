package homework_17;

/*
Task 1
Написать метод, принимающий на вход строку. Метод должен вывести на экран число, соответсвующее количеству символов в строке.

Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
 */


public class Task01 {


        // Метод для вывода количества символов в строке
        public static void printStringLength(String str) {
            // Выводим длину строки
            System.out.println(str.length());
        }

        public static void main(String[] args) {
            // Пример строки
            String str = "hello";

            // Вызов метода для вывода длины строки
            printStringLength(str);  // Вывод: 5
        }


}
