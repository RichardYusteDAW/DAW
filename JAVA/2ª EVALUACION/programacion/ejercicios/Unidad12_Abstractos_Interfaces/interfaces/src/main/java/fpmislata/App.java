package fpmislata;

import java.util.List;

import fpmislata.controller.BookController;
import fpmislata.domain.entinty.Book;

public class App {

    public static void main(String[] args) {
        BookController bookController = new BookController();
        List<Book> books = bookController.getAll();

        for (Book book : books) {
            System.out.println(book);
        }
    }
}