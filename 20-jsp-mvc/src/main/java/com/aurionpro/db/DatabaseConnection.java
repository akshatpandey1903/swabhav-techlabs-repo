package com.aurionpro.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static DatabaseConnection object;
	private Connection connection;
	
	private final String url = "jdbc:mysql://localhost:3306/userdb";
	private final String user = "root";
	private final String password = "Manu+Mon1";
	
	
	private DatabaseConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static DatabaseConnection getObject() {
		if(object == null) {
			object = new DatabaseConnection();
		}
		return object;
	}
	
	public Connection getConnection() {
		return connection;
	}
}

