package com.aurionpro.model;
import com.aurionpro.utility.Utility;
import java.util.Scanner;

public class InventoryFacade {
    private ProductManager productManager;
    private ProductMenu productMenu;
    private SupplierManager supplierManager;
    private SupplierMenu supplierMenu;
    private TransactionManager transactionManager;
    private TransactionMenu transactionMenu;
    private Scanner scanner;

    public InventoryFacade() {
        this.productManager = new ProductManager();
        this.productMenu = new ProductMenu(productManager);
        this.supplierManager = new SupplierManager();
        this.supplierMenu = new SupplierMenu(supplierManager);
        this.transactionManager = new TransactionManager(productManager);
        this.transactionMenu = new TransactionMenu(transactionManager);
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
            scanner.nextLine();

            switch (choice) {
                case 1:
                	productMenu.menu();
                break;
                case 2:
                	supplierMenu.menu();
                break;
                case 3:
                	transactionMenu.menu();
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
}




