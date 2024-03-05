package assignment7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import assignment7.enums.Genres;
import assignment7.enums.MovieFields;

public class MovieStoreControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieStore movieStore = new MovieStore();
		
		//Add a movie
		Movie movie = new Movie("Oppeheimer", "Christopher Nolan", 2023, "US", 180, Genres.BIOGRAPHY);
		String id = movieStore.add(movie); /*Store generates an id for the movie*/
		System.out.println(id);
		System.out.println(movieStore.get(id));
		
		//Edit a movie
		id = movieStore.edit(id, MovieFields.TITLE, "Inception"); /*Store re-renerates a new id*/
		System.out.println(movieStore.get(id));
		
		//Add move movies
		Movie movie1 = new Movie("Social Network", "David Fincher", 2010, "US", 175, Genres.DRAMA);
		Movie movie2 = new Movie("Fight Club", "David Fincher", 1999, "US", 185, Genres.ACTION);
		Movie movie3 = new Movie("The Killer", "Christopher Nolan", 2023, "US", 180, Genres.THRILLER);
		Movie movie4 = new Movie("Seven", "David Fincher", 1995, "US", 120, Genres.THRILLER);
		
		String id1 = movieStore.add(movie1);
		String id2= movieStore.add(movie2);
		String id3 = movieStore.add(movie3);
		String id4 = movieStore.add(movie4);
		
		System.out.println("Before Delete");
		movieStore.printAll();
		System.out.println();
		
		// Delete movies
		movieStore.delete(id2);/*They are moved into recycle bin*/
		movieStore.delete(id3);
		
		System.out.println("After delete");
		movieStore.printAll();
		System.out.println();
		
		//Restore movies
		RecycleBin bin = movieStore.getRecycleBin();
		System.out.println("Movies in Recycle bin");
		bin.printAll();
		System.out.println();
		
		bin.recover(id2);
		bin.recover(id3);
		System.out.println("After restore");
		movieStore.printAll();
		System.out.println();
		
		// Search by title
		ArrayList<Movie> results = movieStore.search("Fight");
		System.out.println("Result of 'fight' ");
		for (Movie m: results) {
			System.out.println(m);
		}
		System.out.println();
		
		// Search by genre
		results = movieStore.genreSearch(Genres.THRILLER);
		System.out.println("Result of THRILLER ");
		for (Movie m: results) {
			System.out.println(m);
		}
		System.out.println();
		
		// I'm feeling lucky
		Movie resultMovie = movieStore.luckySearch("Club");
		System.out.println("I'm feeling lucky search 'Club'");
		System.out.println(resultMovie);
		
		User user1 = movieStore.createUser("MgMg");
		user1.addToFavorites(movie1);
		user1.addToFavorites(movie2);
		user1.printFavorites();
		System.out.println();
		
		/*
		 * Custom feature 'import from file'
		 */
		
		System.out.println("### Custom features ###");
		System.out.println("Import from file");
		
		String importPath = "src/assignment7/text/movies.txt";
		File importFile = new File(importPath);
		
		try {
			movieStore.importFromFile(importFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		movieStore.printAll();
		
		/*
		 * Custom feature 'export to file'
		 */
		
		System.out.println("### Custom features ###");
		System.out.println("Import from file");
		
		String exportPath = "src/assignment7/text/moviesExport.txt";
		File exportFile = new File(exportPath);
		
		try {
			movieStore.exportToFile(exportFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
