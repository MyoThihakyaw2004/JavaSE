package assignment7;

import java.lang.management.PlatformManagedObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeSet;

public class MovieStore {
			TreeSet<Movie> movieList=new TreeSet<Movie>();
			public void add(Movie movie) {
				movieList.add(movie);
			}
			public void delete(Movie movie) {
				movieList.remove(movie);
			}
			public void search(String inputmovies) {
				for (Movie movieName: movieList) {
					if(movieName.getTitle().contains(inputmovies)) {
						System.out.println(inputmovies);
					}
					
				}
				

				public Movie get(String name) {
					for(Movie movie: movieList) {
						if(movie.getTitle().contains(inputmovies)) {

						}
					}
				}				
			}
			public void edit(String title,Map updated) {
				
				
			}
		
}
