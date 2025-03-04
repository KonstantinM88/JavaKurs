package homework_12;

public class Task01 {
    public static void main(String[] args) {

        // Объявление 4 переменных типа int со значениями 0, 1, 2, 3
        int num1 = 0;
        int num2 = 1;
        int num3 = 2;
        int num4 = 3;

        // Объявление переменной для суммы этих чисел
        int sum = num1 + num2 + num3 + num4;

        // Объявление переменной для среднего арифметического (деление на 4)
        int average = sum / 4;

        // Вывод среднего арифметического
        System.out.println("Среднее арифметическое: " + average);

        // Вычисление остатка от деления
        int remainder = sum % 4;

        // Вывод остатка
        System.out.println("Остаток от деления: " + remainder);


    }
}
/*
-------------Ответ----------
Среднее арифметическое: 1
Остаток от деления: 2
 */