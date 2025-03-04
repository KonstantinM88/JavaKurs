package homework_14;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Запрашиваем у пользователя ввод числа
                System.out.print("Введите целое число: ");
                int number = scanner.nextInt();

                // Проверяем четность числа
                boolean isEven = number % 2 == 0;

                // Проверяем кратность 3
                boolean isThree = number % 3 == 0;

                // Проверяем, что число одновременно четное и кратно 3
                boolean isEvenAndisThree = isEven && isThree;

                // Выводим результаты в нужном формате
                System.out.println("Число: " + number +
                        " четное: " + isEven +
                        "; кратно 3: " + isThree +
                        "; четное и кратное 3: " + isEvenAndisThree);


    }
}
