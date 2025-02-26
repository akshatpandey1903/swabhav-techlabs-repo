package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FileHandler {
	
	public static <T> void saveToFile(String fileName, List<T> Items, Function<T, String>formatter) {
		File file = new File(fileName);
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(fileName));
			for(T item : Items) {
				writer.write(formatter.apply(item));
				writer.newLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static List<Product> loadProducts(){
		File file = new File("C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\InventoryApp\\src\\products.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch(IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		List<Product> products = new ArrayList<>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line;
			while((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				if(parts.length == 5) {
					int id = Integer.parseInt(parts[0]);
					String name = parts[1];
					String description = parts[2];
					int quantity = Integer.parseInt(parts[3]);
					double price = Double.parseDouble(parts[4]);
					products.add(new Product(id, name, description, quantity, price));
					IdManager.updateLastId("product", id);
				}
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return products;
	}
	
	public static List<Supplier> loadSuppliers() {
		File file = new File("C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\InventoryApp\\src\\suppliers.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch(IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
        List<Supplier> suppliers = new ArrayList<>();
        BufferedReader reader;
        try{
        	reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String contactInfo = parts[2];
                    suppliers.add(new Supplier(id, name, contactInfo));
                    IdManager.updateLastId("supplier", id);
                }
            }
        } catch (IOException e) {
        	System.out.println("Error: " + e.getMessage());
        }
        return suppliers;
    }

    public static List<Transaction> loadTransactions() {
    	File file = new File("C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\InventoryApp\\src\\transactions.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch(IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
        List<Transaction> transactions = new ArrayList<>();
        BufferedReader reader;
        try {
        	reader = new BufferedReader(new FileReader("transactions.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    int id = Integer.parseInt(parts[0]);
                    int productId = Integer.parseInt(parts[1]);
                    String type = parts[2];
                    int quantity = Integer.parseInt(parts[3]);
                    String date = parts[4];
                    transactions.add(new Transaction(id, productId, type, quantity, date));
                    IdManager.updateLastId("transaction", id);
                }
            }
        } catch (IOException e) {
        	System.out.println("Error: " + e.getMessage());
        }
        return transactions;
    }

}
