package assignment7;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

import assignment7.enums.Genres;
import assignment7.enums.MovieFields;

public class MovieStore {

	private Map<String, Movie> movieList;
	private RecycleBin recycleBin;
	
	public MovieStore() {
		super();
		this.movieList = new HashMap<String, Movie>();
		this.recycleBin = new RecycleBin(this);
	}

	public String add(Movie movie) {
		String id = Movie.generateId(movie);
		movie.setId(id);
		movieList.put(id,  movie);
		
		return id;
	}
	
	public void delete(String id) {
		this.recycleBin.add(id, movieList.remove(id));
	}
	
	public RecycleBin getRecycleBin() {
		return this.recycleBin;
	}
	
	public Movie get(String id) {
		return movieList.get(id);
	}
	
	public void printAll() {
		movieList.forEach((id, movie) -> {
			System.out.println(movie);
		});
	}
	
	public ArrayList<Movie> search(String title) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		movieList.forEach((id, movie) -> {
			if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
				list.add(movie);
			}
		});
		
		return list;
	}
	
	public ArrayList<Movie> genreSearch(Genres genre) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		movieList.forEach((id, movie) -> {
			if (movie.getGenre().equals(genre)) {
				list.add(movie);
			}
		});
		
		return list;
	}
	
	public Movie luckySearch(String title) {
		
		for (Entry<String, Movie> movieEntry : movieList.entrySet()) {
			Movie movie = movieEntry.getValue();
			
			if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
				return movie;
			}
		}

		
		return null;
	}
	
	public String edit(String id, MovieFields field, Object value) {
		
		Movie movie = movieList.remove(id);
		
		if (!(value instanceof String || value instanceof Integer)) {
			System.out.println("Updated value is not valid");
			return null;
		}
		
		switch (field) {
		case TITLE -> movie.setTitle((String) value);
		case DIRECTOR -> movie.setDirector((String) value);
		case DURATION -> movie.setDuration((Integer) value);
		case RELEASE_YEAR -> movie.setReleaseYear((Integer) value);
		case COUNTRY -> movie.setCountry((String) value);
		
		default ->
		throw new IllegalArgumentException("Unexpected value: " + field);
		}
		
		String newId = Movie.generateId(movie);
		movie.setId(newId);
		movieList.put(newId, movie);
		return newId;
		
	}
	
	public void importFromFile(File inputFile) throws IOException {
		System.out.println("Inside importFromFile");
		
		Scanner scanner = new Scanner(inputFile);
		
		while (scanner.hasNextLine()) {
			String movieLine = scanner.nextLine();
			String[] movieArr = movieLine.split(",");
			
			Movie movie = new Movie(movieArr[0].strip(), movieArr[1].strip(), Integer.valueOf(movieArr[2].strip()),
					movieArr[3].strip(),Integer.valueOf(movieArr[4].strip()), Genres.valueOf(movieArr[5].strip().toUpperCase()));
			
			String id = Movie.generateId(movie);
			movie.setId(id);
			movieList.put(id, movie);
		}
		System.out.println("File is read");
		scanner.close();
	}
	
	public void exportToFile(File exportFile) throws IOException {
		System.out.println("Inside exportToFile");
				
		PrintWriter writer = new PrintWriter(exportFile);
		
		movieList.forEach((id, movie) -> {
			writer.printf("%s, %s, %d, %s, %d, %s %n", movie.getTitle(), movie.getDirector(), movie.getReleaseYear(),
					movie.getCountry(), movie.getDuration(), movie.getGenre());
		});
		
		System.out.println("File is written");
		writer.close();
	}
	
	public User createUser(String name) {
		return new User(name, this);
	}
}
