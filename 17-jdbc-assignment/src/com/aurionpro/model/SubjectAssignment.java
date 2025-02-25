package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SubjectAssignment {
    private Connection connection;

    public SubjectAssignment() {
        this.connection = DatabaseConnection.getObject().getConnection();
    }

    public void assignSubjectToStudent(int studentId, int subjectId) {
        String query = "INSERT INTO students_subjects (student_id, subject_id) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, studentId);
            stmt.setInt(2, subjectId);
            stmt.executeUpdate();
            System.out.println("Subject assigned to student successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void assignSubjectToTeacher(int teacherId, int subjectId) {
        String query = "INSERT INTO teachers_subjects (teacher_id, subject_id) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, teacherId);
            stmt.setInt(2, subjectId);
            stmt.executeUpdate();
            System.out.println("Subject assigned to teacher successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




