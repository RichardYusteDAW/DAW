package com.fpmislata.practica.persistence.impl;

import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.fpmislata.practica.domain.entinty.Book;
import com.fpmislata.practica.persistence.BookRepository;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class BookRepositoryImpl implements BookRepository {

    List<Book> books = new ArrayList<Book>();

    public BookRepositoryImpl() {
        try {
            Gson gson = new Gson();
            Reader reader = new FileReader("src/main/resources/data/AuthorRepositoryData.json");
            Type bookListType = new TypeToken<ArrayList<Book>>() {
            }.getType();
            books = gson.fromJson(reader, bookListType);
            System.out.println(books.toString());
            reader.close();
        } catch (Exception e) {
            System.err.println("\u001B[31mError al leer el fichero de datos de libros.\u001B[0m");
            e.printStackTrace();
        }
    }

    public List<Book> findAll() {
        return books;
    }

    public Book findById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}