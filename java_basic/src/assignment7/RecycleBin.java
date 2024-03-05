package assignment7;

import java.util.LinkedHashMap;

public class RecycleBin {

	private LinkedHashMap<String, Movie> bin;
	private MovieStore database;

	public RecycleBin(MovieStore database) {
		super();
		this.bin = new LinkedHashMap<String, Movie>();
		this.database = database;
	}
	
	public void add(String id, Movie movie) {
		bin.put(id, movie);
	}
	
	public void remove(String id) {
		bin.remove(id);
	}
	
	public void removeAll() {
		bin.clear();
	}
	
	public void recover(String id) {
		Movie movie = bin.get(id);
		database.add(movie);
	}
	
	public void printAll() {
		bin.forEach((id, movie) -> {
			System.out.println(movie);
		});
	}
}
