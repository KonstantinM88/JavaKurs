package lesson_30.flyable.interfaces;


// Интерфейс может расширять другой интерфейс
public interface ColorPrintable extends Printable {
    // дочерний интерфейс наследует все методы родительского интерфейса

    void colorPrint();

}

