package com.fpmislata.practica.persistence.zdao.impl;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.fpmislata.practica.domain.entinty.Author;
import com.fpmislata.practica.persistence.zdao.AuthorDao;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class AuthorDaoImpl implements AuthorDao {
    List<Author> authors = new ArrayList<Author>();

    public AuthorDaoImpl() {
        try {
            Gson gson = new Gson();
            Reader reader = new FileReader("src/main/resources/data/AuthorRepositoryData.json");
            Type authorListType = new TypeToken<ArrayList<Author>>() {
            }.getType();
            authors = gson.fromJson(reader, authorListType);

            reader.close();
        } catch (Exception e) {
            System.err.println("\u001B[31mError al leer el fichero de datos de autores.\u001B[0m");
            e.printStackTrace();
        }
    }

    public List<Author> findAll() {
        return authors;
    };

    public Author findById(String id) {
        for (Author author : authors) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    };

    public void add(List<Author> authors) {
        try {
            Gson gson = new Gson();
            Type authorListType = new TypeToken<ArrayList<Author>>() {
            }.getType();
            Writer writer = new FileWriter("src/main/resources/data/AuthorRepositoryData.json");
            gson.toJson(authors, authorListType, writer);
            writer.close();

        } catch (Exception e) {
            System.err.println("\u001B[31mError al escribir el fichero de datos de autores.\u001B[0m");
            e.printStackTrace();
        }
    };
}
