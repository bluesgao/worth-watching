package com.bluesgao.worthwatching.service;

import com.bluesgao.worthwatching.domain.Movie;

import java.util.List;

public interface MovieService {
    Movie selOneMovie(String id);
    List<Movie> selListMovie(String name);
    Movie insMovie(Movie movie);
}
