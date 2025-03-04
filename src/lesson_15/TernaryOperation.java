package lesson_15;

public class TernaryOperation {
    public static void main(String[] args) {


        // Тернарный оператор- краткая запись оператора if-else, которая позволяет присваивать значение

        int age = 20;

        String status;

        if (age >= 18) {
            status = "Совершенолетний";
        } else {
            status = "Несовершенолетний";
        }
        System.out.println(status);

        String result = (age >= 18) ? "Совершенолетний" : "Несовершенолетний";

        int x = 10;

        System.out.println("Значение в переменной х" + ((x >=0) ? "Положительное" : "Отрецательное"));
    }
}
