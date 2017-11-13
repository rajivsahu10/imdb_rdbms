package com.rajiv.imdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajiv.imdb.exception.DuplicateMovieException;
import com.rajiv.imdb.exception.MovieNotFoundException;
import com.rajiv.imdb.model.Movie;
import com.rajiv.imdb.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	
	@Override
	public Movie getMovieByName(String name) {
		Movie movie = movieRepository.findByName(name);
		if(movie==null) {
			throw new MovieNotFoundException("No movie found with the name [ "+ name + " ]");
		}
		return movie;
	}
	
	@Override
	public List<Movie> getAll() {
		List<Movie> allMovies = movieRepository.findAll();
		return allMovies;
	}
	
	@Override
	public Movie createMovie(Movie movie) {
		
		Movie existingMovie =movieRepository.findByName(movie.getName());
		if (existingMovie != null) {
			throw new DuplicateMovieException("Movie by the name "+ movie.getName() + " already exists.");
		}
		Movie createdMovie = movieRepository.save(movie);
		return createdMovie;
	}
			
	@Override
	public void deleteMovie(String id) {
		movieRepository.delete(id);
	}
	
	@Override
	public Movie updateMovie(Movie movie) {
		Movie createdMovie = movieRepository.save(movie);
		return createdMovie;
	}
	
	
}
