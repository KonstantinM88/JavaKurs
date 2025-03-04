package lesson_12;

public class MathOperatiots {


    public static void main(String[] args) {

        int var1 = 20;
        int var2 = 7;

        int result;

        // Сложение
        result = 15 + 6;
        System.out.println("result: " + result);

        // Сначала происходит вычисление результата справа от знака присвоения
        // 2. Результат вычисления присваиваем в переменную слева от знака равно

        result = var1 + var2;
        System.out.println("var1 + var2 = " + result);

        // Вычитание
        result = var1 - var2;
        System.out.println("var1 - var2 = " + result);

        // Умножение знак операции *
        result = var1 * var2;
        System.out.println("var1 * var2 = " + result);

        // Целочисленное деление / (между двумя числами)
        // 20 / 7 -> 2 целые и 6 в остатке (2.85)
        result = var1 / var2; // результат без остатка
        System.out.println("var1 / var2 = " + result);

        // Взятие остатка от деления %
        result = var1 % var2;
        System.out.println("var1 % var2 = " + result);

        System.out.println("5 / 10 = " + (5 / 10));
        System.out.println("5 % 10 = " + (5 % 10));

        System.out.println("==================\n");

        double doubleVar = 20.0; //Все числа, записанные в код с точкой воспринимаються компилятором
        // как число в формате double
        double doubleVar2 = 7.0d; // Явно видно что записанно в формате double

        // Знак
        double doubleRes = doubleVar / doubleVar2;
        System.out.println("doubleRes = " + doubleRes);
    }
}
