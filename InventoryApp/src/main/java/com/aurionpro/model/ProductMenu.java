package com.aurionpro.model;

import java.util.Scanner;

import com.aurionpro.exceptions.InvalidProductIdException;

public class ProductMenu {
	private ProductManager productManager;
	private Scanner scanner;
	
	public ProductMenu(ProductManager productManager) {
		this.productManager = productManager;
		this.scanner = new Scanner(System.in);	
	}
	
	
	 public void menu() {
	        while (true) {
	            System.out.println("\nProduct Management");
	            System.out.println("1. Add Product");
	            System.out.println("2. Update Product");
	            System.out.println("3. Delete Product");
	            System.out.println("4. View Product Details");
	            System.out.println("5. View All Products");
	            System.out.println("6. Back to Main Menu");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine();

	            switch (choice) {
	                case 1:
	                	addProduct();
	                	break;
	                case 2:
	                	updateProduct();
	                	break;
	                case 3:
	                	deleteProduct();
	                	break;
	                case 4:
	                	viewProduct();
	                	break;
	                case 5:
	                	viewAllProducts();
	                	break;
	                case 6:
	                { 
	                	return; 
	                }
	                default:
	                	System.out.println("Invalid choice! Please enter a valid option.");
	                	break;
	            }
	        }
	    }
	 
	 
	 private void addProduct() {
	        System.out.print("Enter Product Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter Description: ");
	        String description = scanner.nextLine();
	        System.out.print("Enter Quantity: ");
	        int quantity = scanner.nextInt();
	        System.out.print("Enter Price: ");
	        double price = scanner.nextDouble();
	        scanner.nextLine();
	        int id = productManager.addProduct(name, description, quantity, price);
	        System.out.println("Product added successfully with ID: " + id);
	    }

	    private void updateProduct() {
	        System.out.print("Enter Product ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("Enter New Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter New Description: ");
	        String description = scanner.nextLine();
	        System.out.print("Enter New Quantity: ");
	        int quantity = scanner.nextInt();
	        System.out.print("Enter New Price: ");
	        double price = scanner.nextDouble();
	        scanner.nextLine();
	        productManager.updateProduct(id, name, description, quantity, price);
	        System.out.println("Product updated successfully!");
	    }

	    private void deleteProduct() {
	        System.out.print("Enter Product ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        productManager.deleteProduct(id);
	    }

	    private void viewProduct() {
	        System.out.print("Enter Product ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        try {
				productManager.getSingleProduct(id);
			} catch (InvalidProductIdException e) {
				// TODO Auto-generated catch block
				System.out.println("Error: " + e.getMessage());
			}
	    }

	    private void viewAllProducts() {
	        productManager.getAllProducts().forEach(System.out::println);
	    }
}
