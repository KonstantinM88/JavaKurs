package lesson_23;

public class Cat {
   private String name;
   private int age;
   private int weight;
   protected boolean isProtected;
   boolean isDefault;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    // Геттеры и сеттеры - специальные публичные методы, дающие возможность
    // получать или изменять поля

    // Геттер для поля age
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
     // 20 (20 < 0 || 2 - > 30 -> false - > !false -> true
     // Если возраст НЕ меньше 0 или больше 30, то делай код 1. Иначе делай код 2

        if (!(age < 0 || age > 30)) {
            //Если age подходит
            this.age = age;
        }
    }
/*
public void setAge(int age) {

        }
 */
/*
if (age < 0 || age > 30) {
            //пусто Возраст не подходит - ничего не делаю
        } else {
            this.age = age;
        }
 */
    public void setWeight(int weight) {
        // Имеем возможность проверить входящее значение
        if (weight < 0) {
            // Если входящее не устраивает - я могу установить значение по умолчанию
            this.weight = 0;
            System.out.println("Текущий вес кота: " + this.weight);
            return; // работа метода прекращается
        }
        // Если вес НЕ больше 50кг - то делаем блок кода 1. Иначе дела код 2
        // - 5 > 50? !false = true
        else if ( !(weight > 50)) {
            // код 1
            this.weight = weight; //
        }
        // Иначе ничего не делаем = оставляем старое значение
    }

    //Я не хочу давать возможность изменять имя коту после создания объекта -
    // поэтому в классе не пишу сеттер на имя

   public void sayMeow() {
        System.out.println("Meow! " + name);
        //testMethod();
    }
    public String toString() {
//        System.out.printf("Cat %s, age: %d, weight: %d\n" ,name , age , weight);

        String result = String.format("Cat %s, age: %d, weight: %d\n", name , age , weight);
        return result;
    }

}
