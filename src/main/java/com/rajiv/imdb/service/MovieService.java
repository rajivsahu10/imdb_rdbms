package com.rajiv.imdb.service;

import java.util.List;

import com.rajiv.imdb.model.Movie;

public interface MovieService {

	Movie getMovieByName(String name);

	List<Movie> getAll();

	Movie createMovie(Movie movie);

	void deleteMovie(String id);

	Movie updateMovie(Movie movie);

}