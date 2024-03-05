package assignment7;

import assignment7.enums.Genres;

public class Movie {
	private String id;
	private String title;
	private String director;
	private Integer releaseYear;
	private String country;
	private Integer duration;
	private Genres genre;
	
	public Movie() {}

	public Movie(String title, String director, Integer releaseYear, String country, Integer duration, Genres genre) {
		super();
		this.title = title;
		this.director = director;
		this.releaseYear = releaseYear;
		this.country = country;
		this.duration = duration;
		this.genre = genre;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Genres getGenre() {
		return genre;
	}

	public void setGenre(Genres genre) {
		this.genre = genre;
	}
	
	static String generateId(Movie movie) {
		String info = movie.getTitle()+"|"+movie.getDirector()+"|"+movie.getReleaseYear()+"|"+movie.getGenre();
		String id = Integer.toHexString(info.hashCode());
		
		return id;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", director=" + director + ", releaseYear=" + releaseYear
				+ ", country=" + country + ", duration=" + duration + ", genre=" + genre + "]";
	}
	
	
}
