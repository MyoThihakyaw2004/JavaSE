package assignment7;

public class Movie {
	private int id;
private String title;
private Integer releaseYear;
 private String country;
 private Integer duration;
 private Double rating;

public Movie() {
	// TODO Auto-generated constructor stub
}

public Movie(int id, String title, Integer releaseYear, String country, Integer duration, Double rating) {
	super();
	this.id = id;
	this.title = title;
	this.releaseYear = releaseYear;
	this.country = country;
	this.duration = duration;
	this.rating = rating;
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
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
public Double getRating() {
	return rating;
}
public void setRating(Double rating) {
	this.rating = rating;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
	
}


}
