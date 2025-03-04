package homework_12;

public class Task02 {
    public static void main(String[] args) {

        // Температуры за неделю (например, 7 дней)
        double day1 = 4.2;  // температура первого дня
        double day2 = 7.8;  // температура второго дня
        double day3 = 9.1; // температура третьего дня
        double day4 = 11.3; // температура четвертого дня
        double day5 = 9.5;  // температура пятого дня
        double day6 = 8.4;  // температура шестого дня
        double day7 = 6.0;  // температура седьмого дня

        // Суммируем температуры всех дней
        double totalTemperature = day1 + day2 + day3 + day4 + day5 + day6 + day7;

        // Вычисляем среднюю температуру за неделю
        double averageTemperature = totalTemperature / 7;

        // Выводим среднюю температуру на экран
        System.out.println("Средняя температура за неделю: " + averageTemperature + "°C");
        System.out.printf("Средняя температура за неделю: %.2f", averageTemperature ,"°C"); // не разобрался как
        // в данной стоке добавить после числа градус (°C)
    }
}
/*
--------------ОТВЕТ-------------------------
Средняя температура за неделю: 8.042857142857143°C
Средняя температура за неделю: 8,04
 */