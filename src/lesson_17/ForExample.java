package lesson_17;

import java.util.Random;

public class ForExample {
    public static void main(String[] args) {

        /*
        for (<Блок инициализации> ; <Блок проверок / условие выхода> ; <Блок изменений>) {
        // Тело цикла
        }
         */
        // Вывести все числа от 0 до 10
        int j = 0;
        while (j < 10) {
            System.out.print(j + ", ");
            j++;
        }
        System.out.println();
        System.out.println("\n===============");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("После цикла for");
// Зауститься бесконечный циклю. Для цикла for ни один из блоков не является обязательным.
  //      for ( ; ; ) {
    //        System.out.println("Hello, World!");
      //  }

        int i1 = 5;
        for (i1 = 0; i1 >= 0; i1 = i1 + 100_000) {
            System.out.print(i1 + ", ");
        }
        System.out.println();
        System.out.println("Состояние переменной i1:" + i1);

        System.out.println("\n===============");
        //В блоке инициализации может быть переменная любого типа
        for (String str = "Hello"; str.length() < 10; str += "$") {
            System.out.println(str);
        }
        System.out.println("\n===============");

        // М можем инициализировать и изменять любое количество переменных в блоках и инициализации и/или изменений


        // Создать массив целых чисел случайной длины от 0 до 15
        // Заполнить массив случайными значениями от - 50 до 50

        Random random = new Random();
    //    int lenght = random.nextInt(11) + 5; //Случайня длина
        int[] ints = new int[random.nextInt(11) + 5];

        System.out.print("[");
        // [0..len-2] -> ", "; len - 1 -> "]\n]
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50; // получу значение от -50 до 50 вкл
            System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "]\n")); //Красиво закрывает скобку без запятой в конце

        }
       // найти минимальное значение в массиве ints (вывести его на консоль)
        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) min = ints[i];
        }
        System.out.println("Минимальное значение: " + min);

        System.out.println("\n===================================");

        //continue, break

        for (int i = 0;i < 7; i++) {
            if (i == 3) continue;// continue прерывает текущую итерацию цикла и перейти в блок изменений (i++)
            // Мы перейдём в блок изменений переменных (i++) и потом в блок проверки условия
            // В текущей итерации все команды после continue будут пропущены
            System.out.print(i + ", ");
        }
        System.out.println();
        for (int i = 0;i < 7; i++) {
            if (i == 3) break; // break - прекращает ткущую итерацию и работу всего цикла
            // Все следущие итерации не будут выполнены (независимо от условия в блоке проверок)
            System.out.print(i + ", ");
        }
     }
}
