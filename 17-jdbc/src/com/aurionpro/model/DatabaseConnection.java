package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	
	public void connect() {
		
		Connection connection = null;
		
		Statement statement = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/studentdb",
	                "usernameHere", "passwordHere");
			
			System.out.println("Connection successful!");
			
			statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
			
			while(resultSet.next()) {
				System.out.println("Id:" + resultSet.getInt(1) + "\t Name:" + resultSet.getString("name") + "\tRollNumber:" + resultSet.getInt("rollnumber") + "\tAge:" + resultSet.getInt("age"));
			}
			
//			int rowsAffected = statement.executeUpdate("INSERT INTO students VALUES(2125, 'Parth', 3, 23)");
//			System.out.println("table updated, rows affected: " + rowsAffected);
//			
//			ResultSet resultSet2 = statement.executeQuery("SELECT * FROM students");
//			
//			while(resultSet2.next()) {
//				System.out.println("Id:" + resultSet2.getInt(1) + "\t Name:" + resultSet2.getString("name") + "\tRollNumber:" + resultSet2.getInt("rollnumber") + "\tAge:" + resultSet2.getInt("age"));
//			}
			
			int stdId = 2126;
			int rno = 2;
			String name = "Prathamesh";
			int age = 15;
			PreparedStatement preparedStatement = connection.prepareStatement("update students set name = ? where rollnumber = ?");
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, rno);
//			preparedStatement.setInt(3, rno);
//			preparedStatement.setInt(4, age);
			
			preparedStatement.executeUpdate();
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
