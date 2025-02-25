package com.aurionpro.model;

import java.util.List;
import java.util.Scanner;

public class CollegeMenu {
	
	private Scanner scanner = new Scanner(System.in);
	private CollegeFacade collegeFacade;
	
	public CollegeMenu() {
		this.collegeFacade = new CollegeFacade();
	}
	
	public void start() {
		while (true) {
            System.out.println("\n==== College Management System ====");
            System.out.println("1.  Add Student");
            System.out.println("2.  Update Student");
            System.out.println("3.  Delete Student");
            System.out.println("4.  View Students");
            System.out.println("5.  Add Subject");
            System.out.println("6.  Update Subject");
            System.out.println("7.  Delete Subject");
            System.out.println("8.  View Subjects");
            System.out.println("9.  Add Teacher");
            System.out.println("10. Update Teacher");
            System.out.println("11. Delete Teacher");
            System.out.println("12. View Teachers");
            System.out.println("13. Assign Subject to Student");
            System.out.println("14. Assign Subject to Teacher");
            System.out.println("15. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    collegeFacade.addStudent(rollNumber, studentName, age);
                    break;

                case 2:
                    System.out.print("Enter Roll Number: ");
                    int updateRoll = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Updated Name: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter Updated Age: ");
                    int updateAge = scanner.nextInt();
                    collegeFacade.updateStudent(updateRoll, updateName, updateAge);
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Delete: ");
                    int deleteRoll = scanner.nextInt();
                    collegeFacade.deleteStudent(deleteRoll);
                    break;

                case 4:
                    List<String> students = collegeFacade.getStudents();
                    System.out.println("\n==== Students List ====");
                    for (String student : students) {
                        System.out.println(student);
                    }
                    break;

                case 5:
                    System.out.print("Enter Subject ID: ");
                    int subId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Subject Name: ");
                    String subjectName = scanner.nextLine();
                    collegeFacade.addSubject(subId, subjectName);
                    break;

                case 6:
                    System.out.print("Enter Subject ID to Update: ");
                    int updateSubId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Updated Subject Name: ");
                    String updateSubName = scanner.nextLine();
                    collegeFacade.updateSubject(updateSubId, updateSubName);
                    break;

                case 7:
                    System.out.print("Enter Subject ID to Delete: ");
                    int deleteSubId = scanner.nextInt();
                    collegeFacade.deleteSubject(deleteSubId);
                    break;

                case 8:
                    List<String> subjects = collegeFacade.getSubjects();
                    System.out.println("\n==== Subjects List ====");
                    for (String subject : subjects) {
                        System.out.println(subject);
                    }
                    break;

                case 9:
                    System.out.print("Enter Teacher ID: ");
                    int teacherId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Teacher Name: ");
                    String teacherName = scanner.nextLine();
                    System.out.print("Enter Qualification: ");
                    String qualification = scanner.nextLine();
                    collegeFacade.addTeacher(teacherId, teacherName, qualification);
                    break;

                case 10:
                    System.out.print("Enter Teacher ID to Update: ");
                    int updateTeacherId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Updated Name: ");
                    String updateTeacherName = scanner.nextLine();
                    System.out.print("Enter Updated Qualification: ");
                    String updateQualification = scanner.nextLine();
                    collegeFacade.updateTeacher(updateTeacherId, updateTeacherName, updateQualification);
                    break;

                case 11:
                    System.out.print("Enter Teacher ID to Delete: ");
                    int deleteTeacherId = scanner.nextInt();
                    collegeFacade.deleteTeacher(deleteTeacherId);
                    break;

                case 12:
                    List<String> teachers = collegeFacade.getTeachers();
                    System.out.println("\n==== Teachers List ====");
                    for (String teacher : teachers) {
                        System.out.println(teacher);
                    }
                    break;

                case 13:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Enter Subject ID to Assign: ");
                    int assignSubId = scanner.nextInt();
                    collegeFacade.assignSubjectToStudent(studentId, assignSubId);
                    break;

                case 14:
                    System.out.print("Enter Teacher ID: ");
                    int assignTeacherId = scanner.nextInt();
                    System.out.print("Enter Subject ID to Assign: ");
                    int assignSubToTeacher = scanner.nextInt();
                    collegeFacade.assignSubjectToTeacher(assignTeacherId, assignSubToTeacher);
                    break;

                case 15:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}
	
}
