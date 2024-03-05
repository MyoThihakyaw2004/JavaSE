package test;

import java.sql.Connection;

import database.DBConnection;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = DBConnection.getConnection();
		
		if(connection != null) {
			System.out.println("Successfully connected to DB");
		} else {
			System.out.println("Fail to connect to DB");
		}
	}

}
