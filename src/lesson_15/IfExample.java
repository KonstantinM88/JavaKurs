package lesson_15;

import java.util.Random;

// Ctrl + Alt + o - удалить не использываный импорт

public class IfExample {
    public static void main(String[] args) {

        // Условный оператор if - позволяет выборочно выполнять отдельные части программы (блоки кода)
/*


        // if (условие) оператор;

        */
        /*
        if (условие) {
            // Код при условие = True
            } else {
            // код при условии = false

         */

        int age = 15;
        if (age >= 18) System.out.println("Вам больше 18");

        System.out.println("Вам меньше 18 " + age);

        if (age > 11) {
            System.out.println("Блок IF");
            System.out.println("Вы уже не ребенок");
        } else {
            //Блок который выполниться когда условивия выдаст false
            System.out.println("Блок ELSE");
            System.out.println("сейчас age = " + age);
        }

        Random rand = new Random(); // Генерируем случайное число
        int score = rand.nextInt(101); // Присваем случайное число переменной

        // int score = 90;
        if (score >= 90) {
            System.out.println("Супер! " + score);
        } else  if (score >= 75) {
            System.out.println("Хорошо!" + score);
        } else if (score >= 50) {
            System.out.println("Удовлетворительно! " + score);
        } else {
            System.out.println("Плохо" + score);
        }
        System.out.println("Продолжение программы!");

        System.out.println("\n===================");

        // Нахождение min из нескольких чисел
        int v1 = rand.nextInt(51); // случайное числ от 0 до 50 вкл.
        int v2 = rand.nextInt(51) - 25; // (0...50) -- -0-25 -> -25; 50 - 25 = max = 25
        int v3 = rand.nextInt(51);

        // -25 до +25

        //-20 до 80 ->
        int r4 = rand.nextInt(101) - 20;
     //Java 17 or h
        //   r4 = rand.nextInt(10,70);
        System.out.println(v1 + " | " + v2 + " | " + v3);

        int min = v1;
        if (v2 < min) {
            min = v2;
        }
    if (v3 < min) min = v3;
        System.out.println("min " + min);

    }
}
