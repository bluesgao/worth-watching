package com.bluesgao.worthwatching.service.impl;

import com.bluesgao.worthwatching.domain.Movie;
import com.bluesgao.worthwatching.repository.MovieRepository;
import com.bluesgao.worthwatching.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: MovieServiceImpl
 * Desc: TODO
 * Author: gaoxin11
 * Date: 2018/7/8 19:29
 **/
@Slf4j
@Service
public class MovieServiceImpl implements MovieService {
    private MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public Movie selOneMovie(String id) {
        return movieRepository.findOneById(id);
    }

    @Override
    public List<Movie> selListMovie(String name) {
        return movieRepository.findByName(name);
    }

    @Override
    public Movie insMovie(Movie movie) {
        return movieRepository.insert(movie);
    }
}
