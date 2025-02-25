package com.aurionpro.model;

import java.util.List;

public class CollegeFacade {
    private StudentCRUD student;
    private SubjectCRUD subject;
    private TeacherCRUD teacher;
    private SubjectAssignment subjectAssignment;

    public CollegeFacade() {
        this.student = new StudentCRUD();
        this.subject = new SubjectCRUD();
        this.teacher = new TeacherCRUD();
        this.subjectAssignment = new SubjectAssignment();
    }

    // Student CRUD Operations
    public void addStudent(int rollNumber, String name, int age) {
        student.addStudent(rollNumber, name, age);
    }

    public void updateStudent(int rollNumber, String name, int age) {
        student.updateStudent(rollNumber, name, age);
    }

    public void deleteStudent(int rollNumber) {
        student.deleteStudent(rollNumber);
    }

    public List<String> getStudents() {
        return student.getStudents();
    }

    // Subject CRUD Operations
    public void addSubject(int subId, String subjectName) {
        subject.addSubject(subId, subjectName);
    }

    public void updateSubject(int subId, String subjectName) {
        subject.updateSubject(subId, subjectName);
    }

    public void deleteSubject(int subId) {
        subject.deleteSubject(subId);
    }

    public List<String> getSubjects() {
        return subject.getSubjects();
    }

    // Teacher CRUD Operations
    public void addTeacher(int teacherId, String name, String qualification) {
        teacher.addTeacher(teacherId, name, qualification);
    }

    public void updateTeacher(int teacherId, String name, String qualification) {
        teacher.updateTeacher(teacherId, name, qualification);
    }

    public void deleteTeacher(int teacherId) {
        teacher.deleteTeacher(teacherId);
    }

    public List<String> getTeachers() {
        return teacher.getTeachers();
    }

    // Assigning Subjects
    public void assignSubjectToStudent(int studentId, int subjectId) {
        subjectAssignment.assignSubjectToStudent(studentId, subjectId);
    }

    public void assignSubjectToTeacher(int teacherId, int subjectId) {
        subjectAssignment.assignSubjectToTeacher(teacherId, subjectId);
    }
}




