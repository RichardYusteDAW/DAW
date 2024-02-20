package com.fpmislata.practica.persistence.zdao.impl;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.fpmislata.practica.domain.entinty.Author;
import com.fpmislata.practica.domain.entinty.Book;
import com.fpmislata.practica.persistence.zdao.BookDao;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class BookDaoImpl implements BookDao {
    List<Book> books = new ArrayList<Book>();

    public BookDaoImpl() {
        try {
            Gson gson = new Gson();
            Reader reader = new InputStreamReader(
                    new FileInputStream("src/main/resources/data/BookRepositoryData.json"), StandardCharsets.UTF_8);
            Type bookListType = new TypeToken<ArrayList<Book>>() {
            }.getType();
            books = gson.fromJson(reader, bookListType);

            reader.close();
        } catch (Exception e) {
            System.err.println("\u001B[31m" + "Error al leer el fichero de datos de libros" + ".\u001B[0m");
            e.printStackTrace();
        }
    }

    public List<Book> findAll() {
        return books;
    }

    public Book findById(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    public void add(List<Book> books) {
        try {
            Gson gson = new Gson();
            Type bookListType = new TypeToken<ArrayList<Author>>() {
            }.getType();
            Writer writer = new FileWriter("src/main/resources/data/BookRepositoryJson.json");
            gson.toJson(books, bookListType, writer);
            writer.close();

        } catch (Exception e) {
            System.err.println("\u001B[31mError al escribir el fichero de datos de autores.\u001B[0m");
            e.printStackTrace();
        }
    }
}
