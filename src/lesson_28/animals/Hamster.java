package lesson_28.animals;

public class Hamster extends Animal {
    // Ничего не переопределяем - получаем реализацию всех родителей

    // Переопределение метода родителя (Animal)
    @Override
    public String toString() {
        return "Hamster !";
    }
}
