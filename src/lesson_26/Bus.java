package lesson_26;

//extends - наследование. Bus наследует Vehicle
// Smartphone is-a Vehicle -> Не верно. Применять наследование НЕЛЬЗЯ.
// Bus is-a Vehicle - верно. Можно применить наследование

public class Bus extends Vehicle {

    private int copacity;
    private int countPassenger;

    //Так выглядит конструктор по умолчанию для класса-потомка
 //   public Bus() {


//}

    public Bus(String model, int year, int copacity) {
        // Нужно сначала создать объект родителя
        //Если в конструкторе потомок нет явного вызова конструктора родителя
        //то автоматически будет вызван пустой конструктор родителя
        super(model, year); // вызов родительского конструктора принимающий модель и год
        this.copacity = copacity;
    }

    public int getCopacity() {
        return copacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public boolean takePassenger() {
        // Проверить есть ли свободное место?
        // если есть посадить - увеличить кол-во пассажиров в автобусе
        if (countPassenger < copacity) {
            countPassenger++;
            //имею доступ в наследнике к полю родителя с модификатором protected
            System.out.println("Пассажир зашел в автобус: " + model);
         //   System.out.println("Пассажир звшел в автобус: " + getModel());
            return true;
        }
        // По сути есть блок else. В эту строку я попаду только если if выдаст false

        System.out.printf("В автобусе %s больше мест нет. Сейчас %d пассажиров" , model, countPassenger);
        return false;

    }
} //конец
