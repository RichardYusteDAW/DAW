package fpmislata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fpmislata.common.DirectorIoC;
import fpmislata.common.MovieIoC;
import fpmislata.domain.service.DirectorService;
import fpmislata.domain.service.MovieService;

@RequestMapping("/movies")
@Controller
public class MovieController {

    MovieService movieService;
    DirectorService directorService;

    public MovieController() {
        this.movieService = MovieIoC.getMovieService();
        this.directorService = DirectorIoC.getDirectorService();
    }

    @GetMapping()
    public String findAll(Model model) {

        directorService.findAll();

        // model.addAttribute("directors", directorService.findAll());
        model.addAttribute("movies", movieService.findAll());

        return "movies";
    }

    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable("id") Integer id) {

        model.addAttribute("director", directorService.findAll());
        model.addAttribute("movie", movieService.findById(id));

        return "movie";
    }
}
