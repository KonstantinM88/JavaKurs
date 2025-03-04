package lesson_18;

public class MethodWithReturn {

    public static void main(String[] args) {

        // Возвращаемое значение - то результат, который метод возвращает вызывающему его метод коду как результат своей работы
        // Этот способ передать результат вычислений метода в другой части программы

   //     int sum = 10 + 5;
        calculateSum(10, 5);
           int sum = calculateSum(10, 5); // -> sum = 15;

        sum = calculateSum(10, 5) + calculateSum(20, 30); //sum = 15 + 50 ->sum = 65;
        System.out.println("sum: " + sum);

    int pow = powTwo(3);
        System.out.println("powTwo(3): " + pow);



    } // end method


    public static void test(int x) {
        // Не печатать числа если х = 3;
        if (x == 3) {
            // Как то проверить работу метода
            return; // Прекращает работу метода в void методах должен использоваться без возвращения значения
        }


        //печатает числа от 0 до x
        for (int i = 0; i < x; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();

    }

    // Написать метод возвращающий 2 в степени х. Х метод получает в качестве пораметра
    public static int powTwo(int x) {
        // 2 ^ x
        // 2 ^ 3 = 2 * 2 * 2 = 8

        boolean isPositive = x >= 0;

        // Что если х  отрицательный - отбрось знак числа
        if (x < 0) x *= -1;

// Вычисляем 2 ^ |x|
        int result = 1;
        // x = 2;
        for (int i = 1; i <= x; i++) {
            result = result * 2;
        }
        if (isPositive) {
            return result;
        } else {
            // 1/ double - 1/4.0 - > 0.25
            return 1 / result;
        }
     //   return result;



    }

    public static int calculateSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result; // return - оператор заканчивающий работу метода и возвращающий значение;

    }

}  // End class
