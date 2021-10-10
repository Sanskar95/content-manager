package com.streaming.contentmanager.repository;

import com.streaming.contentmanager.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MovieRepository extends MongoRepository<Movie, String> {

    Movie findMovieById(String movieId);
    Movie findMovieByTitle(String title);

}