package com.rajiv.imdb.exception;

public class DuplicateMovieException extends RuntimeException {

	public DuplicateMovieException(String msg) {
		super(msg);
	}
	
	public DuplicateMovieException(String msg, Throwable t) {
		super(msg,t);
	}
}
