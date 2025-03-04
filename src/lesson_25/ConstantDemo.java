package lesson_25;


// в Java константой считается Не та переменная, которую нельзя изменить в рамках объект в котором она находится
// такая переменная создается или инициализируется один раз для всех экземпляров класса.

// В Java константой считается НЕ переменная, которую нельзя изменить в рамках одного объекта

// static - делает переменную единственной для всех экземпляров класса (единое значение)
// + final делает ее неизменной


public class ConstantDemo {

    public static final double PI = 3.141519; //Константа
    public static final String COUNTRY = "Germany"; // Константа т.к. невозможно изменить значение

    public static final String[] COLORS = {"blue" , "red", "green"}; // НЕ константа
    //


    // не является константой, т.к. состояние объекта (значение в массиве) можно изменить
    public static final int[] ints = new int[5];

    public static double doublePisqrt() {
        double result = 2 * PI * PI;
        return result;
    }

    //
}
