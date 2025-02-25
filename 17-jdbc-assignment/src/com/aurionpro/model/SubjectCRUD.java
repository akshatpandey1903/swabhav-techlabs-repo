package com.aurionpro.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SubjectCRUD{
    private Connection connection;

    public SubjectCRUD() {
        this.connection = DatabaseConnection.getObject().getConnection();
    }

    public void addSubject(int subid, String subjectName) {
        String query = "INSERT INTO subjects VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, subid);
            stmt.setString(2, subjectName);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> getSubjects() {
        List<String> subjects = new ArrayList<>();
        String query = "SELECT * FROM subjects";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                subjects.add(rs.getInt("subject_id") + " - " + rs.getString("subject_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return subjects;
    }

    public void updateSubject(int subid, String subjectName) {
        String query = "UPDATE subjects SET subject_name = ? WHERE subject_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, subjectName);
            stmt.setInt(2, subid);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteSubject(int subid) {
        String query = "DELETE FROM subjects WHERE subject_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, subid);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



