package lesson_12;

public class IncrementExample {

    public static void main(String[] args) {

        int x = 5;
        x = x +10;

        x += 5; //x = x + 5
        System.out.println("x = " + x);
        x -= 2; // x = x - 2
        x *= 2; // x = x * 2
        x /= 5; // x = x / 2
        System.out.println("x = " + x);
    // Инкримент, декремент
    x++; // x = x + ; // x -= 1; // Декремент - уменьшить текущее значение в переменной х на 1

        System.out.println("X:" + x);

        x--; // x + x -1; // x -= 1; уменьшение текущего значение в переменной х на 1
        System.out.println("X:" + x);

        System.out.println("==================\n");

        /*

        Инкримент и декремент можно записать по разному:
        после переменной х++, х-- (постфикс)
        перед переменной ++х, --х (префикс)

        Если запись постфикс (х++), то сначала используеться текущее значение переменной, а потом оно будет увеличено

         */

        int var = 100;
        System.out.println("var: " + var++);
        System.out.println("var: " + var);

        int y = 100;
        System.out.println("y: " + ++y);
        System.out.println("y: " + y);

    }
}
