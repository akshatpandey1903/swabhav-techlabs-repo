package com.aurionpro.test;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Insert Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    insert(employees, scanner);
                    break;
                case 2: 
                    update(employees, scanner);
                    break;
                case 3: 
                	delete(employees, scanner);
                    break;
                case 4: 
                    search(employees, scanner);
                    break;
                case 5:
                    System.out.println("You chose to eixt");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
    public static void insert(HashMap<Integer, String> employees, Scanner scanner) {
    	System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        employees.put(id, name);
        System.out.println("Employee added.");
    }
    
    public static void update(HashMap<Integer, String> employees, Scanner scanner) {
    	System.out.print("Enter Employee ID to update: ");
        int updateId = scanner.nextInt();
        scanner.nextLine();
        if (!employees.containsKey(updateId)) {
        	System.out.println("Employee not found.");
        	return;
        }
        System.out.print("Enter new Name: ");
        String newName = scanner.nextLine();
        employees.put(updateId, newName);
        System.out.println("Employee updated.");
    }
    
    public static void delete(HashMap<Integer, String> employees, Scanner scanner) {
    	 System.out.print("Enter Employee ID to delete: ");
         int deleteId = scanner.nextInt();
         if (employees.remove(deleteId) == null) {
        	 System.out.println("Employee not found.");
        	 return;
         }
         System.out.println("Employee deleted.");
    }
    
    public static void search(HashMap<Integer, String> employees, Scanner scanner) {
    	System.out.print("Enter Employee ID to search: ");
        int searchId = scanner.nextInt();
        System.out.println(employees.getOrDefault(searchId, "Employee not found."));
    }
}
