package lesson_49.validator;

// extends RuntimeException = проверяемое исключение
// extends RuntimeException - для проверяемых
public class EmailValidateException extends Exception {

    /*
    getMessage() - возвращает троку с коротким описанием исключения
    getCause() - возвращает исключение, которое вызвало текущее исключение
    toString() - строковая представление исключения
    printStackTrace() - выводит трассировку исключения
     */

    public EmailValidateException(String message) {
        super(message);

    }
    @Override
    public String getMessage() {
        return "Email validate exception | " + super.getMessage();
    }

}
