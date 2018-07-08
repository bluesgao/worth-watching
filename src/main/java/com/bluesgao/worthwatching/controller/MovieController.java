package com.bluesgao.worthwatching.controller;

import com.bluesgao.worthwatching.domain.Movie;
import com.bluesgao.worthwatching.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: MovieController
 * Desc: TODO
 * Author: gaoxin11
 * Date: 2018/7/8 19:40
 **/
@Slf4j
@RestController
@RequestMapping("/movie")
public class MovieController {
    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get/{id}")
    Movie getMovie(@PathVariable String id) {
        return movieService.selOneMovie(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    Movie addMovie(@RequestBody Movie movie) {
        return movieService.insMovie(movie);
    }
}
