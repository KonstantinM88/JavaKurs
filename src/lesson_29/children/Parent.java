package lesson_29.children;

public class Parent {

     String name;

    //Автоматически добовляется при компеляции
//    public Parent() {
       // Все поля инициализируются по умочанию
 //   }

    public Parent(String name) {
        this.name = name;
    }
    // Невозможно изменить реализацию (перераспределить) в наследниках
    final void show() {
        System.out.println("Show must go on");
    }
}
