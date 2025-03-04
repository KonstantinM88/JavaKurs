package lesson_25;

// Ключевое слово final. Оно может применять к классам, членам классов (полям, методам), пеерменным (в втом числе аргументом
//методов)

public class FinalDemo {

    //Для примитивных данных, помеченных как final
    // После инициализации (присвоения первого значения) - изменить значение переменных нельзя
    private final int capacity;

    //Ссылочный тип данных. Нельзя изменить значение переменной (привязать новый объект)
    // Состояние объекта, который привязан я могу изменить
    private final int[] ints = new int[5]; // [0, 0, 0, 0,]

    public FinalDemo(int capacity) {
        this.capacity = capacity;
        // Нельзя поменять значение final переменной
        // this.copacity++;

        // Нельзя присваивать ссылку на другой объект или null
      //  this.ints = new int[2];

        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 300;


    }

    public void finalArgument(int x, int[] array) {
        // нельзя изменить х
        // х ++;

        //не могу присвоить ссылку на новый объект
      //  array = new int[2];
        array[0] = x;
        array[1] = 1000;
    }


//    private int capacity;

}
