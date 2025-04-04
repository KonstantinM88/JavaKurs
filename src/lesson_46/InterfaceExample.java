package lesson_46;

// Stream API. Функциональные интерфейсы Function, Predicate, Consumer являются частью Java Lambda Expression, введеных в Java 8

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class InterfaceExample {

    public static void main(String[] args) {

        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string + "!!!");
            }
        };

//        example = String string -> System.out.println(string + "!!!");
//
//        example.accept("Hello World");
//        example.accept("Java");

    }

    List<Integer> list = new ArrayList<>(List.of(-1,3,-4,0,34,-45,11,45,10,-50,12,36,4));

    // Метод должен возвращать список обектов
    public static List<Integer> filterListPredicate(List<Integer> integers, Predicate<Integer> predicate) {
            List<Integer> result = new ArrayList<>();

        for (Integer value : integers) {
            if (predicate.test(value)) {
                result.add(value);
            }
        }

        return result;

    }

}
