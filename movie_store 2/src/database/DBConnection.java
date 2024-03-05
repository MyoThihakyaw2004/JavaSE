package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() {
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String password = "1234";
		try {
			connection = DriverManager.getConnection(url, user, password);
			//connection = DriverManager.getConnection(url);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
} 
