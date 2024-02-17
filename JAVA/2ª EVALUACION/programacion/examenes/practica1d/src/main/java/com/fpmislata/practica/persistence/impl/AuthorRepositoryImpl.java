package com.fpmislata.practica.persistence.impl;

import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.fpmislata.practica.domain.entinty.Author;
import com.fpmislata.practica.domain.entinty.Book;
import com.fpmislata.practica.persistence.AuthorRepository;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class AuthorRepositoryImpl implements AuthorRepository {

    List<Author> authors = new ArrayList<Author>();

    public AuthorRepositoryImpl() {
        try {
            Gson gson = new Gson();
            Reader reader = new FileReader("src/main/resources/data/AuthorRepositoryData.json");
            Type bookListType = new TypeToken<ArrayList<Book>>() {
            }.getType();
            authors = gson.fromJson(reader, bookListType);
            System.out.println(authors.toString());
            reader.close();
        } catch (Exception e) {
            System.err.println("\u001B[31mError al leer el fichero de datos de libros.\u001B[0m");
            e.printStackTrace();
        }
    }

    public List<Author> findAll() {
        return authors;
    };

    public Author findById(int id) {
        for (Author author : authors) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    };
}