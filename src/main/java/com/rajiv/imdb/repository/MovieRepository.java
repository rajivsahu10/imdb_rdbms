package com.rajiv.imdb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajiv.imdb.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, String>{

	public Movie findByName(String name);
	public List<Movie> findAll();
} 
