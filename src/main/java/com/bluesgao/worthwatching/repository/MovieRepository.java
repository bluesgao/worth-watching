package com.bluesgao.worthwatching.repository;

import com.bluesgao.worthwatching.domain.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
    Movie findOneById(String id);
    List<Movie> findByName(String name);
    @Override
    Movie insert(Movie movie);
}
