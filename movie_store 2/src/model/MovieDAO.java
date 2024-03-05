package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.DBConnection;

public class MovieDAO {

	private Connection connection;
	private Statement stmt;
	private PreparedStatement pStmt;
	private ResultSet rs;

	private void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public boolean updateMovie(Movie movie) {
		boolean updateOk = false;
		connection = DBConnection.getConnection();
		try {
			pStmt = connection.prepareStatement("update moviedb.movie set "
					+ "title=?, "
					+ "genre=?, "
					+ "durationByMin=?, "
					+ "imdbRating=?, "
					+ "rtRating=?, "
					+ "rRated=?, "
					+ "releasedDate=?, "
					+ "description=? where id=?");
			pStmt.setString(1, movie.getTitle());
			pStmt.setString(2, movie.getGenre());
			pStmt.setInt(3, movie.getDurationByMin());
			pStmt.setDouble(4, movie.getImdbRating());
			pStmt.setInt(5, movie.getRtRating());
			pStmt.setBoolean(6, movie.getrRated());
			pStmt.setDate(7, Date.valueOf(movie.getReleasedDate()));
			pStmt.setString(8, movie.getDescription());
			pStmt.setLong(9, movie.getId());
			
			int rowEffected = pStmt.executeUpdate();
			
			if (rowEffected > 0) {
				updateOk = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return updateOk;
	}
	
	// Search ID
	public Movie getMovieById(Long movieId) {
		Movie movie = null;
		connection = DBConnection.getConnection();
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from moviedb.movie where id='"+movieId+"';");
			
			while (rs.next()) {
				movie = (new Movie(
						rs.getLong("id"),
						rs.getString("title"),
						rs.getString("genre"),
						rs.getInt("durationByMin"),
						rs.getDouble("imdbRating"),
						rs.getInt("rtRating"),
						rs.getBoolean("rRated"),
						rs.getDate("releasedDate").toLocalDate(),
						rs.getString("description")
						));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return movie;
		
	}
	
	
	//Read R
	public List<Movie> getAllMovies() {
		List<Movie> movieList = new ArrayList<Movie>();
		connection = DBConnection.getConnection();
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery("select * from moviedb.movie;");
			
			while (rs.next()) {
				movieList.add(new Movie(
						rs.getLong("id"),
						rs.getString("title"),
						rs.getString("genre"),
						rs.getInt("durationByMin"),
						rs.getDouble("imdbRating"),
						rs.getInt("rtRating"),
						rs.getBoolean("rRated"),
						rs.getDate("releasedDate").toLocalDate(),
						rs.getString("description")
						));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return movieList;
		
	}
	
	public boolean insertMovie(Movie movie) {
		boolean insertOk = false;
		connection = DBConnection.getConnection();
		try {
			pStmt = connection.prepareStatement("insert into moviedb.movie "
					+ "(title, genre, durationByMin, "
					+ "imdbRating, rtRating, rRated, "
					+ "releasedDate, description) "
					+ "values(?,?,?,?,?,?,?,?);");
			pStmt.setString(1, movie.getTitle());
			pStmt.setString(2, movie.getGenre());
			pStmt.setInt(3, movie.getDurationByMin());
			pStmt.setDouble(4, movie.getImdbRating());
			pStmt.setInt(5, movie.getRtRating());
			pStmt.setBoolean(6, movie.getrRated());
			pStmt.setDate(7, Date.valueOf(movie.getReleasedDate()));
			pStmt.setString(8, movie.getDescription());
			
			int rowEffected = pStmt.executeUpdate();
			
			if (rowEffected > 0) {
				insertOk = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return insertOk;
	}
	
	public boolean deleteMovie(Long movieId) {
		boolean deleteOk = false;
		
		connection = DBConnection.getConnection();
		try {
			pStmt = connection.prepareStatement("delete from moviedb.movie where id=?");
			pStmt.setLong(1, movieId);
			int rowEffected = pStmt.executeUpdate();
			if (rowEffected > 0) deleteOk = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		
		return deleteOk;
	}
	
//	public boolean insertMovie(Movie movie) {
//		boolean insertOk = false;
//		connection = DBConnection.getConnection();
//		try {
//			stmt = connection.createStatement();
//			int rowEffected = stmt.executeUpdate("insert into moviedb.movie "
//					+ "(title, genre, durationByMin, imdbRating, rtRating, rRated, releasedDate, description) "
//					+ "values('"
//						+movie.getTitle()+"','"
//						+movie.getGenre()+"','"
//						+movie.getDurationByMin()+"','"
//						+movie.getImdbRating()+"','"
//						+movie.getRtRating()+"','"
//						+(movie.getrRated() ? 1 : 0)+"','"
//						+movie.getReleasedDate()+"','"
//						+movie.getDescription()
//							+"')");
//			if (rowEffected > 0) {
//				insertOk = true;
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			closeConnection();
//		}
//		return insertOk;
//	}
}
