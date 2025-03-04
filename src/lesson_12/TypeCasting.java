package lesson_12;

public class TypeCasting {
    public static void main(String[] args) {

        /*
        Два способа преобразования типа данных
        1. не явное преобразование оно же (автоматическое)
        2. явное преобразование (кастинг)
         */

        // Неявное преобразование происходит автоматически когда значение меньшего типа данных
        // преобразуется в больший тип данных

        byte byteVal = 123;
        int intVal;
        intVal = byteVal; // Неявное преобразование типа byte в тип int
        System.out.println("intVal: " + intVal);

        double doubleVal = intVal; // Неявное преобразование int в double
        // Явное преобразоване требуется
        // Требуется, когда нужно  преобразовать значение из  большего типа данных
        // в значение меньшего типа данных, так как
        // это может привести к потере данных

        double doubleVal2 = 42.9;
        int int1 = (int) doubleVal2; // Явное преобразование из double в int

        System.out.println("doubleVal2: " + doubleVal2);
        System.out.println("int1: " + int1);

        short shortVal = (short) int1; // к типу данных short
        System.out.println("shortVal: " + shortVal);

        double bigDouble = 3_000_000_000_000_000_000.00; //double вмещает гораздо больший диапазон значений
        // (в том числе в целой части)

        System.out.println("\n======================\n");

        int x = 20;
        int y = 7;

        double result;

        // 20 / 7 -> 2 (int) ->неявное автоматическое преобразование 2 -> 2.0
        result = x / y;
        System.out.println("result: " + result);

        // 20 / 7.0 -> 20.0 / 7.0 = 2.857
        result = x / 7.0;
        System.out.println("result int/double: " + result);

        /*
        Когда в формуле присутствует несколько типов данных,
        то все меньшие типы данных автоматически, не явно приводяться к более
        широкому типу
         */

        /*
        (float) 20 / 7 -> 20.0f / 7 -> 20.0f / 7.0f -> 2.85f -> auto 2.85d -> result
        1. int x - явно образуеться во float
        2. int y - не явно преобразуется во float
        3. Производиться деление 20.0f / 7.0f -> 2.85f
        4. 2.85f -> не явно (авто) преобразуется в тип данных double

         */
        result = (float) x /y;
        System.out.println("resoult(float): " + result);

        result = x / (double) y;
        System.out.println("doubl result: " + result);

        // Приоритет математических операций

        int varC = 2 + 8 / 2;
        System.out.println("varC: "+ varC);

        /*
        Если приоритет равный то как и в математике идёт вычисление с лева на права

        1. () - Сначала делается операция в скобках
        2. * / % - Умножение, деление, остаток от деления
        3. "+ -" - Сложение и вычитание


         */

        varC = (2+8) /2;
        System.out.println("varC: " + varC);
        // 12 % 5 = 2 + 2 остаток
        varC = 25 / (2 % 5) * 3;
        System.out.println("varC 25 / (2 % 5) * 3 = " + varC);
        varC = 25 / 2 % 5 * 3;
        System.out.println("25 / 2 % 5 * 3 = " + varC);
    }
}
