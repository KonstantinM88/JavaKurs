package homework_15;

import java.util.Random;

/*
Task 1
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
Output:
Максимальное число: 33
 */
public class Task01 {
    public static void main(String[] args) {

        // Создаем объект Random для генерации случайных чисел
        Random random = new Random();

        // Генерируем четыре случайных числа от 0 до 100
        int num1 = random.nextInt(101);  // Генерация числа от 0 до 100 (включительно)
        int num2 = random.nextInt(101);
        int num3 = random.nextInt(101);
        int num4 = random.nextInt(101);

        // Выводим все четыре числа
        System.out.println("Число 1: " + num1);
        System.out.println("Число 2: " + num2);
        System.out.println("Число 3: " + num3);
        System.out.println("Число 4: " + num4);
        // Второй вариант вывода на экран
        System.out.println(num1 + " | " + num2 + " | " + num3 + " | " + num4);

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) max = num3;
        if (num4 > max) max = num4;
        System.out.println("Максимальное число: " + max);

/*
        -------Альтернативный вариант используя метод Math.max
        // Находим максимальное число
        int max1 = Math.max(num1, num2);
        int max2 = Math.max(num3, num4);
        int max = Math.max(max1, max2);

        // Выводим максимальное число
        System.out.println("Максимальное число: " + max);
*/
    }
}
