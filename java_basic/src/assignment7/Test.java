package assignment7;

import java.io.File;
import java.io.IOException;

import assignment7.enums.Genres;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieStore movieStore  = new MovieStore();
		Movie movie = new Movie("Oppeheimer", "Christopher Nolan", 2023, "US", 180, Genres.BIOGRAPHY);
		
		String id = movieStore.add(movie);
		System.out.println(id);
		
		String exportPath = "src/assignment7/text/movies1.txt";
		File file = new File(exportPath);
		try {
			movieStore.exportToFile(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String importPath = "src/assignment7/text/movies.txt";
		File importFile = new File(importPath);
		
		try {
			movieStore.importFromFile(importFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		movieStore.printAll();
		
		
	}

}
