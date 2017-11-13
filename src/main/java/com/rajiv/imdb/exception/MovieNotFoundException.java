package com.rajiv.imdb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No movie found")
public class MovieNotFoundException extends RuntimeException {
	
	public MovieNotFoundException(String msg) {
		super(msg);
	}
	
	public MovieNotFoundException(String msg, Throwable t) {
		super(msg,t);
	}
}
