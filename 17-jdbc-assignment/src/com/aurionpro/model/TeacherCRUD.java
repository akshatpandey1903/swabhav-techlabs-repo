package com.aurionpro.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherCRUD{
    private Connection connection;

    public TeacherCRUD() {
        this.connection = DatabaseConnection.getObject().getConnection();
    }

    public void addTeacher(int teacherId, String name, String qualification) {
        String query = "INSERT INTO teacher VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, teacherId);
            stmt.setString(2, name);
            stmt.setString(3, qualification);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> getTeachers() {
        List<String> teachers = new ArrayList<>();
        String query = "SELECT * FROM teacher";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                teachers.add(rs.getInt("teacher_id") + " - " + rs.getString("name") + " - " + rs.getString("qualification"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teachers;
    }

    public void updateTeacher(int teacherId, String name, String qualification) {
        String query = "UPDATE teacher SET name = ?, qualification = ? WHERE teacher_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, qualification);
            stmt.setInt(3, teacherId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteTeacher(int teacherId) {
        String query = "DELETE FROM teacher WHERE teacher_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, teacherId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




