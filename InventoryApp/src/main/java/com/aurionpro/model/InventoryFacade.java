package com.aurionpro.model;
import com.aurionpro.exceptions.DuplicateSupplierException;
import com.aurionpro.exceptions.InsufficientStockException;
import com.aurionpro.exceptions.InvalidProductIdException;
import com.aurionpro.exceptions.InvalidSupplierIdException;
import com.aurionpro.utility.Utility;
import java.util.Scanner;

public class InventoryFacade {
    private ProductManager productManager;
    private SupplierManager supplierManager;
    private TransactionManager transactionManager;
    private Scanner scanner;

    public InventoryFacade() {
        this.productManager = new ProductManager();
        this.supplierManager = new SupplierManager();
        this.transactionManager = new TransactionManager(productManager);
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        while (true) {
            System.out.println("\nWelcome to the Inventory Management System");
            System.out.println("1. Product Management");
            System.out.println("2. Supplier Management");
            System.out.println("3. Transaction Management");
            System.out.println("4. Save Data");
            System.out.println("5. Load Data");
            System.out.println("6. Generate Reports");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                	productMenu();
                break;
                case 2:
                	supplierMenu();
                break;
                case 3:
                	transactionMenu();
                break;
                case 4:
                	saveData();
                	break;
                case 5:
                	loadData();
                	break;
                case 6:
                	generateReports();
                	break;
                case 7:{
                    System.out.println("Exiting the Inventory Management App");
                    return;
                }
                default:
                	System.out.println("Invalid choice! Please enter a valid option.");
                break;
            }
        }
    }

    private void productMenu() {
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

    private void supplierMenu() {
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

    private void transactionMenu() {
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

    private void generateReports() {
        System.out.println("\nGenerating Reports...");
        int totalProducts = Utility.getTotalNumberOfProducts(productManager);
        double totalStockValue = Utility.getTotalStockValue(productManager);
        System.out.println("Total Products: " + totalProducts);
        System.out.println("Total Stock Value: " + totalStockValue);
    }

    private void saveData() {
        System.out.println("Saving Data...");
        productManager.saveProducts();
        supplierManager.saveSuppliers();
        transactionManager.saveTransactions();
        System.out.println("Data saved successfully.");
    }

    private void loadData() {
        System.out.println("Loading Data...");
        productManager = new ProductManager();
        supplierManager = new SupplierManager();
        transactionManager = new TransactionManager(productManager);
        System.out.println("Data loaded successfully.");
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




