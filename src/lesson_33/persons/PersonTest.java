package lesson_33.persons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @BeforeEach
    void setUp() {
        System.out.println("Method @BevoreEach");
    }
/*
@BeforeAll - метод выполняется один раз перед выполнением первого тестового метода
@AfterEach - выполняеться после каждого тестового метода
@


after
 */

    //@Test - указывает что метод является тестовым
    // Таким образом JUnit знает, что этот метод нужно запустить во время выполнения тестов
    @Test
    public void testAddidition() {
        // Протестировать, правильно ли работает метод

        int result = (2 + 3);

        //Реальное / фактическое значение переменной result
        // Ожидаемое значение - 5

        // Методы проверки утверждений

      //  assertEquals(expected, result);
        Assertions.assertEquals(5, result); // Проверяет равны ли два значения. Тест будет проведён если 2 значения равны
        Assertions.assertNotEquals(0, result); //Тест будет пройден если фактический результат НЕ совпадает с "неожидаемым результатом
        Assertions.assertTrue(result >= 4); //Проверяет, что условие верно (условие возвращает true)
        assertEquals(10, 5 + 5); // Статистический импорт позволяет использовать методы, без огранияения к классу.
        assertFalse(result > 10); // Проверяет, что условие ложно (условие возвращает False)
        assertNull(null); // Проверяет что обьект null. Тест будет пройдет если объект равен null
        assertNotNull("String"); // Проверяет что объект не равен null

    }

    @Test
    public void emptyTest() {
        System.out.println("Test Empty");
    // Если в методе нет ложного утверждения - он считается пройденым
        // В том числе пустой (вообще без утверждений)
    }

    //Параметризированные тесты

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "kiwi", "cherry"})
    public void testFruits(String fruit) {
        System.out.println("current value: " + fruit);
        assertNotNull(fruit);
        assertTrue(fruit.length() > 4);

    }
//    @ParameterizedTest
//    @ValueSource
//    void testStatic(int value) {
//        System.out.println("static value run: " + value);
//        Autobus bus = new Autobus(new BusDriver ("Test", "1111", 10));
//        System.out.println(bus);
//    }

    //Источник данных в формате CSV
    // Источник данных файл в формате CSV

    // Источкик данных - метод

    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSourseFruits(String fruit) {
        System.out.println("Current value: " + fruit);
    }

} //