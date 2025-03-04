package lesson_11;

public class Variables {

    public static void main(String[] args) {





//  Java - строго типизированный язык программирования

        //Python: x = 10 # Пайтон сам понимает / определяет тип переменной
        /*
        Строгая типизация - Каждая переменная должна иметть определённый тип данных, который не может изменится.
        Тип данных определяет какие значения могут храниться в переменных
         и какие операции можно выполнить со значением  этой переменной.

         Объявляя переменную мы должны указать тип данных и выбрать уникальное имя

         Имена должны быть всегда пишуться с маленькой буквы и в camelCase нотации
         my first variable

         */
        int myFirstVariable; // Объявление (декларация) переменной типа int

        // Интциализация переменной - первое прсвоение значения
        myFirstVariable = 1; //Прсвоение значения

        System.out.println(myFirstVariable);

        int mySecondVariable =25;
        //Java требует указание типа переменной(int - целое число)

        System.out.println(mySecondVariable);

        mySecondVariable =50;

        System.out.println("mySecondVariable: " + mySecondVariable);

        byte byteVar = 125; // Объявление и инициализация переменной типа Byte
        byteVar = 0;
        System.out.println("Значение переменной byteVar " + byteVar);

        //Имя переменной должно быть уникально в границах видимости.
        // byte mySecondVariable; я не могу использовать повторно объявить переменную с таким же именем

        short shortVar; //Объявление переменной типа short
        shortVar = 31000; // инициализация переменной

        // Знак _ для визуального разделения разрядов в числе
        long longVarible = 2_100_000_000_000_000L; // L в конце числа - сказать компиляторе, что это число  в этой форме
        System.out.println("shortVar: " + shortVar);
        System.out.println("longVarible: " + longVarible);

        //В коде любое число  воспринимаеться компилятором как число в формате int

        double doubleVar = 10.5421; // Разделитель дробной части точка
        System.out.println("double:" + doubleVar);

        float floatVar = 123.564f; // f/F - указать, что число в формате float
        System.out.println("floatVar:" + floatVar);
    }
}
