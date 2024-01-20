package fpmislata;

import java.util.List;

import fpmislata.controller.BookController;
import fpmislata.domain.entinty.Book;

public class App {
    private static BookController bookController = new BookController();

    public static void main(String[] args) {
        List<Book> books = bookController.getAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}