package assignment7;

import java.util.ArrayList;

public class User {
	private String name;
	private ArrayList<String> favorites;
	private MovieStore database;
	
	public User(String name, MovieStore store) {
		super();
		this.name = name;
		this.database = store;
		favorites = new ArrayList<String>();
	}

	public void addToFavorites(String id) {
		favorites.add(id);
	}
	
	public void addToFavorites(Movie movie) {
		favorites.add(movie.getId());
	}
	
	public void printFavorites() {
		System.out.println("Favorite movies of " + name + " : ");
		favorites.forEach(id -> System.out.println(database.get(id)));
	}
}
