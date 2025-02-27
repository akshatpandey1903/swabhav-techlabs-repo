package com.aurionpro.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    public static <T> void saveToFile(String fileName, List<T> items) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(items);
            out.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
	public static List<Product> loadProducts() {
        File file = new File("C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\InventoryApp\\src\\products.bin");
        List<Product> products = new ArrayList<>();
        if (!file.exists()) {
            return products;
        }
        try (ObjectInputStream in= new ObjectInputStream(new FileInputStream(file))) {
            return (List<Product>) in.readObject();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
			
		}
        return new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
	public static List<Supplier> loadSuppliers() {
        File file = new File("C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\InventoryApp\\src\\suppliers.bin");
        List<Supplier> suppliers = new ArrayList<>();
        if (!file.exists()) {
            return suppliers;
        }
        try (ObjectInputStream in= new ObjectInputStream(new FileInputStream(file))) {
            return (List<Supplier>) in.readObject();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
			
		}
        return new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
	public static List<Transaction> loadTransactions() {
        File file = new File("C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\InventoryApp\\src\\transactions.bin");
        List<Transaction> transactions = new ArrayList<>();
        if (!file.exists()) {
            return transactions;
        }
        try (ObjectInputStream in= new ObjectInputStream(new FileInputStream(file))) {
            return (List<Transaction>) in.readObject();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
			
		}
        return new ArrayList<>();
    }
}



