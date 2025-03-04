package homework_17;

public class Task02 {

        // Метод для распечатки массива в обратной последовательности
        public static void printReversed(int[] array) {
            // Перебираем массив с конца до начала и выводим элементы
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        // Перегруженный метод, который принимает индекс
        public static void printReversedIndex(int[] array, int index) {
            // Сначала выводим элементы массива до индекса включительно
            for (int i = 0; i < index; i++) {
                System.out.print(array[i] + " ");
            }

            // Затем выводим элементы от индекса до конца массива в обратном порядке
            for (int i = array.length - 1; i >= index; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] array = {1, 4, 3, 6, 7};

            // Вызов метода для печати в обратной последовательности
            System.out.print("Массив в обратном порядке: ");
            printReversed(array);  // Вывод: [7, 6, 3, 4, 1]
            /*
            Этот метод принимает массив и перебирает его элементы с конца (с последнего индекса) к первому,
             чтобы распечатать массив в обратном порядке.
             */
            // Вызов перегруженного метода с индексом
            System.out.print("Массив с индекса 2 в обратном порядке: ");
            printReversedIndex(array, 2);  // Вывод: [1, 4, 7, 6, 3]
        }


}
