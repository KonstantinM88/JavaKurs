package homework_15;

import java.util.Scanner;

/*
    Task 2
Напишите программу с использованием оператора switch:
Программа просит пользователя ввести число от 1 до 7.
Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".

 */
public class Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");

            default:
                System.out.println("Я таких чисел не знаю");


        }
    }
}
