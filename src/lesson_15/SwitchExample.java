package lesson_15;

import java.util.Random;
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        /*
        Switch - используеться когда нужно выполнить разные действия в зависимости от значения одной переменной или выражения
        Это альтернатива множественным оператор if-else if, когда проверяется равенство одной переменной с разными значениями

        Особенно хорош когда мы выбираем из известного или конечного количества вариантов
         */

        int x = 5;

        if (x == 5) {
            System.out.println("if: x равен 5");
        } else if (x == 7) {
            System.out.println("if-else: x равен 7");
        } else {
            System.out.println("else: что-то другое");
        }

        /*
        switch (выражение) {
        case значение 1:
            // Блок кода для значения 1
            case значение 3:
            // Блок кода для значения 2
            // .....
            default:
                // Блок кода по умолчанию (если не одно значение не совпало)
                }
         */
        System.out.println("\n========================");
        switch (x) {
            case 5:
                System.out.println("switch: x = 5");
                break;
            case 7:
                System.out.println("switch: x = 7");
                break;
            case 11:
                System.out.println("switch: x = 11");
                break;
            default:
                System.out.println("switch: что-то другое");

        }
        System.out.println("Строка за приделами switch");

        // Просим пользователя ввести число от 1 до 4. В зависимости от числа выдать сообщение

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 4: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println("Вы ввели 1");
                break;
            case 2:
                System.out.println("Вы ввели 2");
                break;
            case 3:
                System.out.println("Вы ввели 3");
                break;
            case 4: // if (x == 3 || x == 4)
                System.out.println("Вы ввели 4");
                break;
            default:
                System.out.println("Я таких чисел не знаю");

        }

        // Java 14 ot higher
        /*
        switch (input) {
            case 1 -> System.out.println("Opt2: Вы ввели число 1");
            case 2 -> System.out.println("Opt2: Вы ввели число 2");
            case 3, 4 -> System.out.println("Opt2: Вы ввели число 3 или 4");
            default -> System.out.println("Opt2: Я таких числел не знаю");

        }
        String result = switch (input) {
            case 1 -> "Opt3: Вы ввели 1";
            case 2 -> "Opt3: Вы ввели 2";
            case 3, 4 -> "Opt3: Вы ввели 3 oder 4";
            default -> System.out.println("Opt2: Я таких числел не знаю");



        }

*/

        /*
       У ребёнка есть карманные деньги, родители дают на карманные при условии оценок
       5 - 20
       4 - 10
       3 - 8
       2 - 0
       1 - Все деньги забирают

         */
        System.out.println("\n===================");
        Random random = new Random();
        int money = 100;
        int note = random.nextInt(5) + 1; // Генерация случайного числа от 1 до 5
        switch (note) {
            case 5:
                money += 20; // money = money +20
                break;
            case 4:
                money += 10;
            case 2:
                money -=20;
                break;
            case 1:
                money = 0;


            }
        System.out.println("Ребенок получил оценку:" + note);




        System.out.println("У ребенка сейчас денег: " + money);

        // Восстанавливаю значение
        /*
        money = switch (note) {
            case 5 -> money +20;
            case 4 -> money +10;
            case 2 -> money -20;
            case 1 -> 0;
            default -> money;
        }
        */

        System.out.println("У меня есть загадка ");
        System.out.println("Что это желтый, большой, с рогами и полный зайцев");
        System.out.println("Как думаешь? ");

        String answer = scanner.nextLine();
        // "a    ffff" -> "a    ffff"
        // "   fdfdf fdfdd " - "fdfdf fdf fdfdd"


        // Троллейбус, тролейбус,  Троллейбус ->
        /*
        Объяснение:
answer.trim() удаляет пробелы вокруг строки, так что получится "HeLLo WoRLd!".
toLowerCase() преобразует строку в "hello world!".
Результат — строка в нижнем регистре без пробелов в начале и конце.
         */

        String answerClen = answer.trim().toLowerCase();
        switch (answerClen) {
            case "троллейбус":
            case "троллейбус!":
                System.out.println("Молодец угадал!");
                break;
            case "сдаюсь":
            case "сдаюсь!":
                System.out.println("Быстро ты сдался. Правильный ответ троллейбус");
                break;
            default:
                System.out.println("Ответ не верный");

        }

        }
    }

