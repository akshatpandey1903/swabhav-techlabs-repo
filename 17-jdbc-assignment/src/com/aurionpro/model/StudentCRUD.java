package com.aurionpro.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentCRUD {
    private Connection connection;

    public StudentCRUD() {
        this.connection = DatabaseConnection.getObject().getConnection();
    }

    public void addStudent(int rollNumber, String name, int age) {
        String query = "INSERT INTO students (rollnumber, name, age) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, rollNumber);
            stmt.setString(2, name);
            stmt.setInt(3, age);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> getStudents() {
        List<String> students = new ArrayList<>();
        String query = "SELECT * FROM students";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                students.add(rs.getInt("studentid")+ " - " +rs.getInt("rollnumber") + " - " + rs.getString("name") + " - " + rs.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }

    public void updateStudent(int studentid, String name, int age) {
        String query = "UPDATE students SET name = ?, age = ? WHERE studentid = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setInt(3, studentid);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int studentid) {
        String query = "DELETE FROM students WHERE studentid = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, studentid);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



