package com.fpmislata.practica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fpmislata.practica.common.BookIoCContainer;
import com.fpmislata.practica.domain.entinty.Author;
import com.fpmislata.practica.domain.service.AuthorService;
import com.fpmislata.practica.domain.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String findById(@PathVariable("id") int id, Model model) {
        model.addAttribute("book", bookService.findById(id));
        return "bookDetails";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("authors", authorService.findAll());
        return "addBook";
    }

    @PostMapping("/add")
    public String procesarFormularioContacto(Model model,
            @RequestParam("title") String title,
            @RequestParam("author") int authorID,
            @RequestParam("ISBN") String ISBN,
            @RequestParam("publisher") String publisher,
            @RequestParam("year") String year) {

        model.addAttribute("title", title);
        model.addAttribute("author", authorID);
        model.addAttribute("ISBN", ISBN);
        model.addAttribute("publisher", publisher);
        model.addAttribute("year", year);

        return "addedBook";
    }

}