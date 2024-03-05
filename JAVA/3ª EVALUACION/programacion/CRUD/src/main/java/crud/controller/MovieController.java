package crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import crud.common.container.DirectorIoC;
import crud.common.container.MovieIoC;
import crud.domain.service.DirectorService;
import crud.domain.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

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

        model.addAttribute("movieList", movieService.findAll());

        return "movieList";
    }

    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable("id") Integer id) {

        model.addAttribute("movie", movieService.findById(id));

        return "movieDetail";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("directorList", directorService.findAll());
        return "addMovie";
    }

    @PostMapping("/add")
    public String add(
            @RequestParam String title,
            @RequestParam Integer year,
            @RequestParam("director") Integer directorId) {
        movieService.add(title, year, directorId);

        return "redirect:/movies";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id) {

        movieService.delete(id);

        return "redirect:/movies";
    }

    @GetMapping("/update/{id}")
    public String update(Model model, @PathVariable("id") Integer id) {

        model.addAttribute("movie", movieService.findById(id));
        model.addAttribute("directorList", directorService.findAll());

        return "updateMovie";
    }

    @PutMapping("path/{id}")
    public String update(
            @PathVariable("id") Integer id,
            @RequestParam String title,
            @RequestParam Integer year,
            @RequestParam("director") Integer directorId) {

        movieService.update(id, title, year, directorId);

        return "redirect:/movies";
    }

}