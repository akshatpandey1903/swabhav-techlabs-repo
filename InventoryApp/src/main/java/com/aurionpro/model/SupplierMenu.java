package com.aurionpro.model;

import java.util.Scanner;

import com.aurionpro.exceptions.DuplicateSupplierException;
import com.aurionpro.exceptions.InvalidSupplierIdException;

public class SupplierMenu {
	private SupplierManager supplierManager;
	private Scanner scanner;
	
	public SupplierMenu(SupplierManager supplierManager) {
		this.supplierManager = supplierManager;
		this.scanner = new Scanner(System.in);	
	}
	
	public void menu() {
        while (true) {
            System.out.println("\nSupplier Management");
            System.out.println("1. Add Supplier");
            System.out.println("2. Update Supplier");
            System.out.println("3. Delete Supplier");
            System.out.println("4. View Supplier Details");
            System.out.println("5. View All Suppliers");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                	addSupplier();
                	break;
                case 2:
                	updateSupplier();
                	break;
                case 3:
                	deleteSupplier();
                	break;
                case 4:
                	viewSupplier();
                	break;
                case 5:
                	viewAllSuppliers();
                	break;
                case 6:{ return; }
                default:
                	System.out.println("Invalid choice! Please enter a valid option.");
                	break;
            }
        }
    }
	
	 private void addSupplier() {
	        System.out.print("Enter Supplier Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter Contact Info: ");
	        String contactInfo = scanner.nextLine();
	        try {
				supplierManager.addSupplier(name, contactInfo);
			} catch (DuplicateSupplierException e) {
				// TODO Auto-generated catch block
				System.out.println("Error: " + e.getMessage());
				return;
			}
	        System.out.println("Supplier added successfully!");
	    }

	    private void updateSupplier() {
	        System.out.print("Enter Supplier ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("Enter New Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter New Contact Info: ");
	        String contactInfo = scanner.nextLine();
	        supplierManager.updateSupplier(id, name, contactInfo);
	    }

	    private void deleteSupplier() {
	        System.out.print("Enter Supplier ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        try {
				supplierManager.deleteSupplier(id);
			} catch (InvalidSupplierIdException e) {
				// TODO Auto-generated catch block
				System.out.println("Error: " + e.getMessage());
			}
	    }

	    private void viewSupplier() {
	        System.out.print("Enter Supplier ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        try {
				supplierManager.getSupplierById(id);
			} catch (InvalidSupplierIdException e) {
				// TODO Auto-generated catch block
				System.out.println("Error: " + e.getMessage());
			}
	    }

	    private void viewAllSuppliers() {
	        supplierManager.getAllSuppliers().forEach(System.out::println);
	    }
}
