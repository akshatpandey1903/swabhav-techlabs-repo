package com.aurionpro.model;

import java.util.Scanner;

import com.aurionpro.exceptions.InsufficientStockException;

public class TransactionMenu {
	private TransactionManager transactionManager;
	private Scanner scanner;
	
	public TransactionMenu(TransactionManager transactionManager) {
		this.transactionManager = transactionManager;
		this.scanner = new Scanner(System.in);	
	}
	
	public void menu() {
        while (true) {
            System.out.println("\nTransaction Management");
            System.out.println("1. Add Stock");
            System.out.println("2. Remove Stock");
            System.out.println("3. View Transaction History");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                	addStock();
                	break;
                case 2:
                	removeStock();
                	break;
                case 3:
                	viewTransactions();
                	break;
                case 4:{ return; }
                default:
                	System.out.println("Invalid choice! Please enter a valid option.");
                	break;
            }
        }
    }
	
	private void addStock() {
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        transactionManager.addStock(id, quantity);
    }

    private void removeStock() {
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        try {
			transactionManager.removeStock(id, quantity);
		} catch (InsufficientStockException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
		}
    }

    private void viewTransactions() {
        transactionManager.getTransactions().forEach(System.out::println);
    }
}
