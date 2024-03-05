package controller;

import java.util.List;
import java.util.Scanner;

import model.Movie;
import model.MovieDAO;

public class MovieController {

	private final MovieDAO movieDAO = new MovieDAO();
	
	public String updateMovie (Movie movie) {
		if (movie.getId() == null) {
			return "movie id is null";
		}
		
		return movieDAO.updateMovie(movie) ? "movie with id="+movie.getId()+" is updated" : "Movie update failed";
		
	}
	
	public List<Movie> searchMovieByTitle(String charSeq) {
		return movieDAO.getAllMovies().stream()
				.filter(m -> m.getTitle().toLowerCase().contains(charSeq))
				.toList();
	}
	
	public Movie getMovieById(Long movieId) {
		return movieDAO.getMovieById(movieId);
	}
	
	public List<Movie> getAllMovieData() {
		return movieDAO.getAllMovies();
	}
	
	public String createMovie(Movie movie) {		
		return movieDAO.insertMovie(movie)?"Movie is created" : "Failed";
	}
	
	public String deleteMovie(Long movieId) {		
		return movieDAO.deleteMovie(movieId) ? "Movie ("+movieId+") is deleted" : "Delete failed";
	}
}
