package lesson_32.methods;

import lesson_31.lists.MyList;

public class Utils {

   // Поменять места два элемента массива с любым ссылочным типом данных

    public static <T> void swap(T[] array, int idx1, int idx2) {
       T temp = array[idx1];
       array[idx1] = array[idx2];
       array[idx2] = temp;

    }
    // Метод кторый возвращает первый элемент в списке
    public static <T> T getFirstElement(MyList<T> list) {


        if (list.isEmpty()) return null;
        return list.get(0);
    }
    // Ограничение сверху Upper Bound
    // Ограничиваем диапазон

    // <T extends SomeClass> - это значить T должен быть либо классом SomeClass
    // либо его потомком (подклассом)
    public static <T extends Number> int sumElements(T... elements) {
       int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i].intValue();
        }
        return sum;
    }
    public static double listSum(MyList<? extends Number>  listNumber) {
        double sum = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            sum += listNumber.get(i).doubleValue();
        }
        return sum;
    }

    // Ограничения снизу Lower Bound
    // ? super Integer - мы работаем с неизвестным типом, который является
    // классом Integer тлт его родителям (суперклассом)
    public static void addNumbers(MyList<? super Integer> list) {
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);
    }

} //End

