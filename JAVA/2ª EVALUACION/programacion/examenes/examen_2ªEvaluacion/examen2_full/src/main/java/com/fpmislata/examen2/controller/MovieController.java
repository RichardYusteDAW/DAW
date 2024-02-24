package com.fpmislata.examen2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fpmislata.examen2.common.container.MovieIoC;
import com.fpmislata.examen2.domain.service.MovieService;

@RequestMapping("/movies")
@Controller
public class MovieController {
    MovieService movieService;
    // DirectorService directorService;

    public MovieController() {
        this.movieService = MovieIoC.getMovieService();
        // this.directorService = DirectorIoC.getDirectorService();
    }

    @GetMapping()
    public String findAll(Model model) {

        model.addAttribute("movieList", movieService.findAll());

        return "movieList";
    }

    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable("id") Integer id) {

        model.addAttribute("movie", movieService.findById(id));

        return "movieDetail";
    }
}
