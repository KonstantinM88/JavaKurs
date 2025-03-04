package lesson_16;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        /*
        while (условие) {
            // Тело цикла
            // Код который будет повторяться
            }
          - условие - выражение которое возвращает true или false
          - Блок кода внутри {} (тело цикла) выполяеться пока условие истино

          Предикат условие вычисляеться перед каждой итерацией цикла

         */

        // Вывести на экран числа от 1 до 5 включительно

        int number = 1; // Иннициализация переменной счётчика цикла

        while (number <= 5) {
            System.out.print(number + ", ");
            number++; // number = number +1
        }
        System.out.println("Цикл закончен");

        // Бесконечный цикл
        //    while (true) {
        //        System.out.printf("Hello!");
        //    }
        int number1 = 100; // Иннициализация переменной счётчика цикла

        while (number1 >= 90) {
            System.out.print(number1 + ", ");
            //    System.out.print(number1-- + ", "); второй вариант
            //   System.out.println(number1-- + number1 + ", number2 " + number1);
            number1--; // number = number -1
        }
        System.out.println("Цикл закончен");
        /*
        // Найти сумму чисел от 1 до 100
        1. Перебрать числа от 1 до 100
        2. Каждое число добавить в какую-то аккумуляцию (накапливающую сумму чисел) переменную
        3. После вывести значение переменной-акку
         */
        // Используя for (вне урока)
        int sum = 0;

        // Перебираем числа от 1 до 100
        for (int i = 1; i <= 100; i++) {
            sum += i;  // Добавляем текущее число i в переменную sum
        }

        // Выводим результат
        System.out.println("Сумма чисел от 1 до 100: " + sum);
        System.out.println("Цикл закончен");
// Вариант на уроке
        int i = 1;
        int sum1 = 0;

        while (i <= 100) {
            sum1 += i++;
            //i++;

        }
        System.out.println("Сумма чисел(1) от 1 до 100: " + sum1);

        /*
        Запустить перебор чисел от 1 до 21
        Прроверить каждое (текущее в цикле) число на чётность
            Если чётное - распечатать
            Иначе - никаких действий не требуется.
        Взять следующее число из списка (новая интерация цикла)
         */

        i = 1;

        while (i <= 21) {
            //Проверяем число на чётность
            if (i % 2 == 0) { // число чётное
                System.out.print(i + ", ");
            }
            i++;

        }
        System.out.println("");
        //----------------------------------------
        System.out.println("\n===========================");

        String str = "Hello";

        //Распечатать каждый символ этой строки в отдельной строчке
        /*
        1.Нужно перебрать все индексы символов в этой строке.
        2.Минимальный индекс 0, максимальный индекс len -1;
        3.Взять символ по текущему индексу. Вывести на консоль
        4.Повторит со следующим индексом
         */
        // Индекс, с которого начинаем перебор (начинаем с 0)
        int i1 = 0;

        // Перебираем все индексы строки от 0 до text.length() - 1
        while (i1 < str.length()) {
            // Берем символ по текущему индексу и выводим его
            System.out.println(str.charAt(i1));

            // Переходим к следующему индексу
            i1++;
        }
        System.out.println("\n===================");
        String str1 = "Учись студент";
        i = 0;
        //    while (i <= str1.length() - 1) {
        while (i < str1.length() - 1) {
            char ch = str1.charAt(i);
            System.out.println(ch);
            i++;
        }
        System.out.println("\n========== opt2 =============");

        i = 0;
        while (i < str1.length()) {
            System.out.println(str1.charAt(i++));
        }

        System.out.println("\n========== **** =============");

        // Пользователь должен ввести число больше 0.
        // Пока он не введет положительное число

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите положительное число: ");
        int input1 = scanner.nextInt();
        scanner.nextLine();

        while (input1 <= 0) {
            System.out.println("Введите положительное число1: ");
            int input = scanner.nextInt();
            scanner.nextLine();

        }
        System.out.println("Спасибо Вы ввели: " + input1);

        // DRY - принцип - не повторяй себя

        // цикл с пост условием
        //Цикл do-while - всегда выполняеться тело цикла хотябы 1 раз, независимо
        //от условия оно истинно или ложно

        /*
        do {
        //Тело цикла

         */
        int num1 = -1;
        do {
            System.out.println("Введите положительное число(2): ");
            num1 = scanner.nextInt();
            if (num1 <= 0) {
                System.out.println("Повторите попытку!");
            }
        } while (num1 <= 0);


        System.out.println("Спасибо Вы ввели: " + num1);
        }





    }

