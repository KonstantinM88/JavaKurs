package homework_18;

import java.util.Arrays;
/*
Task 1
Написать метод со следующим функционалом:

На вход метод принимает массив целых чисел и число - длину нового массива. Метод должен создать и распечатать массив заданной в параметрах длинны. В начало массива должны быть скопированы элементы из входящего массива:

{0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
Copy
{0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}
Copy
Arrays.copyOf() использовать нельзя. Суть задачи - написать собственную реализацию этого метода
 */

public class Task_01_01 {

    // Метод, который принимает исходный массив и длину нового массива
    public static int[] copyOfArray(int[] array, int newLength) {
        // Создаём новый массив указанной длины
        int[] newArray = new int[newLength];

        // Копируем элементы из исходного массива в новый массив
        for (int i = 0; i < Math.min(array.length, newLength); i++) {
            newArray[i] = array[i];
        }

        // Новый массив автоматически заполняется нулями, так что дополнительные элементы
        // в новом массиве остаются равными 0 по умолчанию

        return newArray;
    }

    public static void main(String[] args) {
        // Пример 1
        int[] array1 = {0, 1, 2, 3, 4, 5, 6};
        int[] result1 = copyOfArray(array1, 3);
        System.out.println(Arrays.toString(result1));  // Вывод: {0, 1, 2}

        // Пример 2
        int[] array2 = {0, 1, 2};
        int[] result2 = copyOfArray(array2, 5);
        System.out.println(Arrays.toString(result2));  // Вывод: {0, 1, 2, 0, 0}
    }
}
