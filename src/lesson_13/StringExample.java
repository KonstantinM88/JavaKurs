package lesson_13;

public class StringExample {
    public static void main(String[] args) {

        String greeting = "Hello World! "; // Обьявление инициализации переменной типа String

        String string1 = new String("Hello! "); // Тоже создание но не рекомендуемый

        System.out.println(greeting);
        System.out.println(string1);
    // Метод length() - получит колличество символов в строке
        int length = greeting.length(); // Вызов метода length() - посчитать колличество символов в этой строке
        System.out.println("length()" + length); //Выведет 13

        System.out.println("Hello".length());

        // toUpperCase() - Метод позволяет позволяет вс символы в строке в верхний регистр

        System.out.println(greeting.toUpperCase());
        System.out.println("greeting: " + greeting);


        // String иммутабельна (неизменная)
        // Если я хочу сохранить метод результат работы метода - я должен сохранить в какуюто переменную

        // greeting.toLowerCase() - переводит все символы в нижний регистр
        String stringCase = greeting.toLowerCase();
        System.out.println("stringCase: " + stringCase);
        System.out.println("greeting: " + greeting);
        greeting = greeting.toUpperCase(); // x = x + 5
        System.out.println("greeting2: " + greeting);

        System.out.println("\n===================");
// Различные варианты конкатенации (склеивания / объеденения) строк
        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // Конкатенация
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);

        System.out.println(1 + 3);


        // + (Конкатенация vs Операция сложения
        System.out.println(1+3 + " : " + 2 + 3);

        //какойто тип данных х + String -> X производиться к строке и выполняеться конкатенация

        // 1+3 -> сложение -> 4
        //4 + str" : " -> "4" + " : " -> "4 : "
        //"4 : " + 2 -> "4 : " + "2" -> "4 : 2"
        //

        //Изменить приоритет мат операция
        System.out.println(1 + 3 + " : " + (2 + 3));

        // Конкатенация 2
        String concatStr2 = str1.concat(str2); //str1 + str2
        concatStr2 = concatStr2.concat(str3); // concatStr +str3
        System.out.println("IconcatStr2: " + concatStr2);

        //цепочка вызова метода
        String concatStr3 = str1.concat(str2).concat(str3).concat(str3).concat("!!!"); // ((str1 + str2) +str3) + "!!!"
        System.out.println("concatStr3: " + concatStr3);

        //Конкатенация 3
        // Слеить несколько сток, вставляя между ними одинаковый разделитель

        String concastStr5 = String.join(" ", "Hello", "World2", "Test", "!!!" );
        //"Hello World2 Test
        System.out.println("concastStr5: " + concastStr5);

        // Приведение типов. Когда есть строка и знак плюс - это знак конкатенации.
        // второй тип данныъ будет приведён в String (неявно)

        int a = 1;
        int b = 2;
        String str = "Сумма а + b = " + a + b; // Сумма a + b = 12
        System.out.println("str " + str);

        //Меняем порядок операции
        str = "Сумма а+в = " + (a + b); // Сумма a + b = 3
        System.out.println("str: " + str);

        System.out.println("\n================\n");

        String digits = "0123456789";
        System.out.println("digits.lenght()" + digits.length()); //Выводить количество символов (10)

        // chartAt(index) - Взять символ из строки по его индексу (номер)
        char symbol = digits.charAt(4); // Взять символ под индексом (номером) 4
        System.out.println("symbol: " + symbol);
        // Первый символ всегда имеет индекс 0. Последний самый правый всегда равен длина -1

        char first = digits.charAt(0);
        char last = digits.charAt(digits.length() - 1);

        System.out.println("first: " + first);
        System.out.println("last: " + last);

        System.out.println("\n=================\n");

        // Выделение подстроки
        String subString = digits.substring(2); //Выделит подстроку начиная с индкса 2 вкл и до конца строки
        System.out.println("subString(2): " + subString);
        System.out.println("digits: " + digits); // начальная строка остаёться без изменений

        String subString2 = digits.substring(2, 7); //Выводит подстрок с индексом 2 вкл до индекса 7 не включительно
        System.out.println("subString2: " + subString2); // 23456

        System.out.println("\n=======================\n");

        // Замена частей строк
        // replace(), replaceFirst(), replaceAll()

        //replace() - заменяет все совпадения заданой строки на другую строку
        // (Работает только со строками, не поддерживает регулярные выражения)

        String string = "One World One";
        String replStr = string.replace("One", "WWW");
        System.out.println("replStr: " + replStr); // WWW World WWW

        //replaceFirst() - заменяет только первое совпадение (поддерживает регулярные выражения)
        replStr = string.replaceFirst("One" , "WWW");
        System.out.println("replStr: " + replStr); // WWW World One

        //replaceAll() - заменяет все найденые совпадения на другую строку
        // Поддерживает регулярные выражения
        replStr = string.replaceAll("One" , "WWW");
        System.out.println("replStr: " + replStr); //WWW World WWW

        System.out.println("/n===stringReg.replaceAll");

        String stringReg = "One World One Onix 0";
        replStr = stringReg.replaceAll("\\bo\\w*", "Replaced");
        System.out.println("replStr: " + replStr);








    }
}
