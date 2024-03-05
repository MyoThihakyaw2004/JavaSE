package view;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import controller.MovieController;
import model.Movie;

public class MovieView {

	private final MovieController movieController = 
			new MovieController();
	
	private void showMovieData(Movie movie) {
		if (movie != null) {
			System.out.println("Movie ID : "+movie.getId());
			System.out.println("Movie Title : "+movie.getTitle());
			System.out.println("Movie Genre : "+movie.getGenre());
			System.out.println("Movie DurationByMin : "+movie.getDurationByMin());
			System.out.println("Movie imdbRating : "+movie.getImdbRating());
			System.out.println("Movie RottenTomatoes meter : "+movie.getRtRating());
			System.out.println("Movie rRated : "+(movie.getrRated() ? "Yes" : "No"));
			System.out.println("Movie Released Date : "+movie.getReleasedDate());
			System.out.println("Movie Description : ");
			System.out.println(movie.getDescription());
		} else {
			System.out.println("Movie with is not found");
		}
	}
	
	public void showIdSearchResult(Scanner userInput) {
		System.out.println("MovieID : ");
		Long movieId = userInput.nextLong();

		showMovieData(movieController.getMovieById(movieId));
	}
	
	public void showDeleteResult(Scanner userInput) {
		System.out.println("MovieID you want to delete");
		Long movieId = userInput.nextLong();
		String message = movieController.deleteMovie(movieId);
		System.out.println("### Movie delete result ###");
		System.out.println(message);
	}
	
	public void showUpdateResult(Scanner userInput) {
		System.out.println("MovieID you want to update");
		Long movieId = userInput.nextLong();
		System.out.println("Updated Movie Data : ");
		Movie updatedMovie = movieController.getMovieById(movieId);
		while (true) {
			System.out.println("1.title, 2.genre, 3.durationByMin, 4.imdbRating, 5.rtRating 6.rRated 7.releasedDate 8.description");
			int operation = userInput.nextInt();
			
			switch (operation) {
			case 1 -> {
				System.out.println("Title : ");
				userInput.nextLine();
				updatedMovie.setTitle(userInput.nextLine());
			}
			case 2 -> {
				System.out.println("Genre : ");
				userInput.nextLine();
				updatedMovie.setGenre(userInput.nextLine());
			}
			case 3 -> {
				System.out.println("DurationByMin : ");
				updatedMovie.setDurationByMin(userInput.nextInt());
			}
			case 4 -> {
				System.out.println("imdbRating : ");
				updatedMovie.setImdbRating(userInput.nextDouble());
			}
			case 5 -> {
				System.out.println("RottenTomatoes : ");
				updatedMovie.setRtRating(userInput.nextInt());
			}
			case 6 -> {
				System.out.println("R rated : yes-y or no-n");
				updatedMovie.setrRated(userInput.next().charAt(0) == 'y');
			}
			case 7 -> {
				System.out.println("Released Date : ");
				updatedMovie.setReleasedDate(LocalDate.parse(userInput.next()));
			}
			case 8 -> {
				System.out.println("Description : ");
				userInput.nextLine();
				updatedMovie.setDescription(userInput.nextLine());
			}
			
			default ->
			throw new IllegalArgumentException("Unexpected value: " + operation);
			}
			System.out.println("Continue update? Yes-y or No-n");
			char decision = userInput.next().charAt(0);
			if (decision == 'n') {
				break;
			}
		}
		
		System.out.println("### Movie Update Result ###");
		System.out.println(movieController.updateMovie(updatedMovie));
	}
	
	public void showCreateResult(Scanner userInput) {
		System.out.println("Title : ");
		userInput.nextLine();
		String title = userInput.nextLine();
		System.out.println("Genre : " );
		String genre = userInput.nextLine();
		System.out.println("Duration By Min : ");
		Integer durationByMin = userInput.nextInt();
		System.out.println("Imdb Rating : ");
		Double imdbRating = userInput.nextDouble();
		System.out.println("Rotten Tomatoes : ");
		Integer rtRating = userInput.nextInt();
		System.out.println("R-Rated : yes-y or no-n");
		Boolean rRated = userInput.next().charAt(0) == 'y';
		System.out.println("ReleasedDate : yyyy-MM-dd");
		LocalDate releasedDate  = LocalDate.parse(userInput.nextLine());
		System.out.println("Description : ");
		userInput.nextLine();
		String description = userInput.nextLine();
		
		Movie movie = new Movie(title, genre, durationByMin, imdbRating, rtRating, rRated, releasedDate, description);
		String message = movieController.createMovie(movie);
		System.out.println("### Movie Creation Result ###");
		System.out.println(message);
	}
	
	public void listMovie(List<Movie> movieList) {
		if (!movieList.isEmpty()) {
			System.out.println("All Movie Data : ");
			System.out.println();
			int i = 1;
			for (final Movie movie : movieList) {
				System.out.println("### Movie "+i+" ###");
				showMovieData(movie);
				System.out.println();
				i++;
			}
		}
	}
	
	public void showMovieList() {
		
		listMovie(movieController.getAllMovieData());
	}
	
	public void showTitleSearchResult(Scanner userInput) {
		System.out.println("Enter searched text : ");
		userInput.nextLine();
		String charSeq = userInput.nextLine();
		listMovie(movieController.searchMovieByTitle(charSeq));
	}
}
