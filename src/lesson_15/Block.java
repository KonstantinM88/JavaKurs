package lesson_15;

public class Block {
    public static void main(String[] args) {

        // Блок или составной оператор - {} - это произвольное количество простых операторов
        // java заключенных в фигурные скобки. Блоки могут быть вложены один в другой.

        // Scope - область видимости переменной - часть программы в которой переменная доступна для использования.
        // Область видимости определяется фигурными скобками.

        int x = 10;

        // Анонмный блок
        {
            int y = 5;
            x = x + y;
            System.out.println("x = " + x);
            System.out.println("y = " + y);

        }

     //   x = x + y; // переменная y не видна или не доступна вне своего блока кода, вне своей области видимости
    // Новая переменная с именем у

        int y = 124;

    }
}
