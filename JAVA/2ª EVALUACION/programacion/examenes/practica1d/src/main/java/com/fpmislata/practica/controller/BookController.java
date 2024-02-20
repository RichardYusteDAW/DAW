package com.fpmislata.practica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fpmislata.practica.common.BookIoCContainer;
import com.fpmislata.practica.domain.entinty.Book;
import com.fpmislata.practica.domain.service.AuthorService;
import com.fpmislata.practica.domain.service.BookService;

@RequestMapping("/books")
@Controller
public class BookController {

    BookService bookService;
    AuthorService authorService;

    public BookController() {
        bookService = BookIoCContainer.getBookService();
        authorService = BookIoCContainer.getAuthorService();
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "books";
    }

    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable("id") String id) {
        model.addAttribute("book", bookService.findById(id));
        return "bookDetails";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("authors", authorService.findAll());
        return "addBook";
    }

    @PostMapping("/add")
    public String addBook(
            @RequestParam("title") String title,
            @RequestParam("author") String authorID,
            @RequestParam("ISBN") String ISBN,
            @RequestParam("publisher") String publisher,
            @RequestParam("year") int year) {

        Book book = new Book(title, null, ISBN, publisher, year);
        bookService.add(book, authorID);

        System.out.println(bookService.findAll());

        return "redirect:/books";
    }

}