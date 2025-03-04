package homework_14;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {

        // Создаем объект Random для генерации случайных чисел
        Random random = new Random();

        // Первая переменная (случайное значение от 0 до 50)
        int a = random.nextInt(51);  // 51 означает верхнюю границу (0 до 50 включительно)

        // Вторая переменная (случайное значение от 0 до 100)
        int b = random.nextInt(101); // 101 означает верхнюю границу (0 до 100 включительно)


        // Вывод значений переменных
        System.out.println("Переменная a: " + a);
        System.out.println("Переменная b: " + b);

        // Проверки
        System.out.println("a == b: " + (a == b)); // Проверка на равенство
        System.out.println("a != b: " + (a != b)); // Проверка на неравенство
        System.out.println("a > b: " + (a > b));   // Проверка, больше ли a чем b
        System.out.println("b < a: " + (b < a));   // Проверка, меньше ли b чем a
    }

}
