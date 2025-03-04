package lesson_13;

public class CharExample {
    public static void main(String[] args) {

        char a = 'A'; //Переменная будет хранить букву А латинского алфавита
        char a1 = 65; //Переменная будет хранить A латинского алфавита
        // (симаол соответствует коду 65 в десятичной СС)
        char a2 = 0x0041; // Присваиваю число в 16-формате без ведущих нулей. Что соответствует все той же букве А
        // a2 = 0x0041
        char a3 = '\u0041'; // Ещё один способ задать код в 16-м
        char x = '\u15EE';

        System.out.printf("\n======================");

        char letter = 'A';
        letter++; // Увеличивает код символа, который храниться в перемнной
        System.out.printf("letter: " + letter);

        System.out.printf(" a: " + a);
        System.out.printf(" a1: "+ a1);
        System.out.printf(" a2: "+ a2);
        System.out.printf(" a3: "+ a3);
        System.out.printf(" x: "+ x);

        System.out.printf("\n====================== ");

        char digit = 48; //Коду соответствует символ 0
        System.out.printf(" digit: " + digit);

        digit +=5; // digit = digit + 5;
        System.out.printf(" digit: " + digit);


        /*
        0...9 -> соответствует кодам 48...57
        a...z -> соответствует кодам 97...122
        A...Z -> соответствует кодам 65...90
         */

        digit = (char) (digit + 3);
        byte b1 = 120;
        b1 = (byte) (b1 + 1);

        // Чтобы получить код символа в деситиричной системы исчесления нужно привести тип char к типу int
        System.out.println("int из char даст 10й код символа: " + (int) digit);
        System.out.println(0 + digit);

        char x1 = 12853;
        System.out.printf(" x1: " + x1);

    }
}
