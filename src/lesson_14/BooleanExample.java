package lesson_14;

public class BooleanExample {
    public static void main(String[] args) {

        boolean bol1 = true;
        bol1 = false;

        System.out.println(bol1);

        int x = 10;
        int y = 5;

        // Сравнение на равенство ==
        boolean b1 = x == y;  // X равен Y -> 10 равно 5 -> false
        System.out.printf("%s == %s - > %s\n", x, y, b1);
        // Не равенство !=
        b1 = x != y; //X не равен Y -> 10 не равно 5 -> true
        System.out.printf("%s !=%s -> %s\n", x, y, b1);

        // Больше >
        b1 = x > y; // x больше y -> 10 > 5 -> true
        System.out.printf("%s > %s -> %s\n", x , y, b1);

        y = 10;
        b1 = x > y; // X больше чем Y -> 10 > 10 - false
        System.out.printf("%s > %s -> %s\n", x , y, b1);

        // Меньше <
        x = 7;
        b1 = x < y; // x меньше чем Y -> 7 < 10 -> true
        System.out.printf("%s < %s -> %s\n", x , y, b1);

        // Меньше или равно
        b1 = x <= y; //X меньше чем Y ->7 меньше или равно 18 -> true
        System.out.printf("%s <= %s -> %s\n", x , y, b1);

        String str = "Java is the best";
        // Поиск вхождения подстроки
        // contains - возврращает true если строка содержит указанную последовательность символов (подстроку)
        boolean contains = str.contains("Java"); // строка str содержит последовательность символов "Java"
        System.out.println("str.contains(\"Java\"): " + contains);
        System.out.println("str.contains(\"Java\"): " + str.contains("java"));

        // start
        boolean startsWith = str.startsWith("Ja");
        System.out.println("str.contains(\"Ja\"): " + startsWith);
        System.out.println("str.contains(\"ava\"): " + str.startsWith("ava"));

        //Rename - Schift + F6

        boolean endsWith = str.startsWith("best");
        System.out.println("str.startsWith(\"best\"): " + endsWith);
        System.out.println("str.startsWith(\"Java\"): " + str.endsWith("Java"));

        System.out.println("\n=======Логические операции===========\n");

        // Логическое НЕ (отрицание) "!"
        // Меняет значение буля на противоположное
        boolean b2 = !false; // !false -> true
        System.out.println("!false: " + b2);

        b2 = !(4 == 5); //!false ->true
        System.out.println("!(4 == 5): " + b2);

        //Составные сравнения - два условия

        /*
        Логическое И "&"
        Используеться когда нужно, чтобы оба условия были истиными.
        Возвращает true, если оба условия true.
        Если хотябы в одной части буде falsev-> в результате получим false
        */

        b2 = true & true;
        System.out.println("true & true: " +b2);

        // Проверка, что число входит в нужный диапазон
        // Введите число от 0 до 100
        int input = 50;
        b2 = input >= 0 & input <= 100;
        System.out.println("input >= 0 & input <= 100: " +b2);

        input = 150;
        b2 = input >= 0 & input <= 100;
        System.out.println("input >= 0 & input <= 150: " +b2);

        //Логиеское или "|"
        // Когда достаточно, чтобы хотя бы одно условие было истиным

        b2 =  true | false;
        System.out.println("true | false: " + b2);
        System.out.println("false | true: " + (false | true));
        System.out.println("true | true: " + (true | true));
        System.out.println("false | false: " + (false | false));

        System.out.println("\n============ИЛИ (XOR ^=======");
        // Логическое исключающее ИЛИ (XOR) ^
        // Возвращение true, если две части выражения разные

        b2 = true ^ false;
        System.out.println("true ^ false: " + b2);
        System.out.println("false ^ true: " + (false ^ true));
        System.out.println("true ^ true: " + (true ^ true));
        System.out.println("false ^ false: " + (false ^ false));

        System.out.println("\n=================\n");

        // Логческое соращеной И "&&"
        // Выдаёт true, только если обе части возвращают true.
        b2 = true && true;
        System.out.println("true && true: " + b2);
        System.out.println("false && true: " + (false && true));

        int a = 10;
        int b = 0;

        // b = 0; 0!=0 -> false
        // false && ? -> false
        // b = 100 -> 100 !=0 -> true -> true && ? -> Надо считать правую часть

        boolean bol = (b != 0) && a / b > 2;
        System.out.println("bol: " + bol);

        b = 1;
        bol = (b != 0) && (a / b > 2);
        System.out.println("bol: " + bol);

        // Логическое сокращение ИЛИ "||"
        // Выдаёт true если хотя бы одна часть выражения равна true

        // true || ? -> true (независиимо от значения правой части)
        // Сокращение ИЛИ НЕ будет считать правую часть, а обычное ИЛИ будет считать
        b = 0;
        bol = true || (a / b > 2);
        System.out.println("bol: " + bol);

        System.out.println("\n=======Приоритет логических опереаций\n");
        /* ! & ^ | && || - приортет логических операций

        000 */

        System.out.println(true ^ true & false); //true
        System.out.println(true ^ false); //true
        System.out.println(true); // true

        System.out.println();

        System.out.println(true ^ true && false); //false
        System.out.println(false && false);














    }

}
