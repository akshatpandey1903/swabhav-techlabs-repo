package com.aurionpro.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.entity.Student;

public class DatabaseConnection {
	
	private Connection connection;
	private Statement statement;
	
	private final String url = "jdbc:mysql://localhost:3306/userdb";
	private final String user = "root";
	private final String password = "Manu+Mon1";
	
	public DatabaseConnection() {
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
	
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("Select * From students");
			while(rs.next()) {
				Student student = new Student(rs.getInt(1), rs.getString(3), rs.getInt(2), rs.getInt(4));
				students.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return students;
	}
	
}
