package lesson_29.children;

public class Child extends Parent{
    // Скопированно из родителей
 //   private String name;
    int age;

    // Емли нет не одного конструктора, будет добавлен конструктор вида
 //   public Child() {
    // Вызывается устой конструктор родителя
    //    super(name);
    public Child() {
        //Сначала я ДОЛЖЕН создать объект ро
        // super(); // Если не вызвал конструктор
        super("Default");
        this.age = 20;
    }

    public Child(String name, int age) {
        super(name);
        this.name = name;
        this.age = age;
    }

    //Я не могу переопределить final-метод
 //   @Override
 //   void schow() {
 //       System.out.println("Another schow");
 //   }

}//End

