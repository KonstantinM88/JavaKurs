package lesson_44;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        String str = "abc";
        System.out.println("str.hashCode: " + str.hashCode());

        String str2 = "abc";

        System.out.println("str.equals(str2): " + str.equals(str2));
        System.out.println("str2.hashCode(): " + str2.hashCode());

        /*
        Для корректной работы хеш-коллекций есть важное правило -
        контракт между hashCode() и equals()

        1. Если два объекта равны по методу equals(), то их hashCode() тоже должны быть равны
        2. Если hash-коды двух
         */

        //Конструктор
        Set<Integer> set = new HashSet<>();
        set = new HashSet<>(20); //Создает пустой hashSet с указанной емкостью
        // Принимает коллекцию - создаёт новый сет (множество), содержащий уникальные элементы
        set = new HashSet<>(List.of(1,2,3,5,6,5,3,6,0 ));

        System.out.println(set);

        // HashSet - не поддерживает порядок добавление элементов
     //   Set<Integer> startValues = List.of(15,1,2,3,);


        System.out.println("========================\n");


        //boolean remove(Object o) - удаляет элемент по значению
//        System.out.println(integers.remove(100)); //true
//        System.out.println(integers);
//
//        //boolean contains(Object o) - проверяет присутствие элемента в множестве
//        System.out.println("inegers.contains(100): " + integers.contains(100)); // false
//        System.out.println("inegers.contains(32): " + integers.contains(32)); // false

        /*
        int size() - колличество элементов в сете-е
        boolean isEmpty() - возвращает true, если сет не содержит элементов
        clear() - удаляет все элементы

         */
        System.out.println("==================\n");

        // interator() 0 возвращает итератор для элементов сет-а
        // Наличие итератора позволяет последовательно перебирать все элементы циклом

//        Iterator<Integer> interator = integers.iterator();

    }
    private static <T> List<T> getUniqueList(List<T> list) {
        //Получить коллекцию, состоящую из уникальных элемментов (убрать дубликаты)
        // P.S. Позаботиться о сохраниение порядка элементов из начального списка

        Set<T> set = new LinkedHashSet<>(list);


        // Преобразовать кол-цию уникальных элементов в список
        return new ArrayList<>(set);
    }

    }
