package crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import crud.common.container.DirectorIoC;
import crud.common.container.MovieIoC;
import crud.domain.service.DirectorService;
import crud.domain.service.MovieService;

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
    public String add(@RequestParam String title, @RequestParam Integer year,
            @RequestParam("director") Integer directorId) {
        movieService.add(title, year, directorId);

        return "redirect:/movies";
    }

}