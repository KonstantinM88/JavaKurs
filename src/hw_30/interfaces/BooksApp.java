package hw_30.interfaces;

import lesson_30.flyable.interfaces.Book;


public class BooksApp {

    public static void main(String[] args) {

        Book book = new Book("Title", "Author");

        book.defaultMethod();
    }
}
