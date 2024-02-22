package fpmislata.domain.service;

import java.util.List;

import fpmislata.domain.entinty.Director;

public interface DirectorService {
    List<Director> findAll();

    Director findById(Integer id);
}
