package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.exceptions.InsufficientStockException;
import com.aurionpro.exceptions.InvalidProductIdException;

public class TransactionManager {
    private List<Transaction> transactions;
    private ProductManager productManager;
    private static final String transactionFilePath = "C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\InventoryApp\\src\\transactions.txt";

    public TransactionManager(ProductManager productManager) {
        this.productManager = productManager;
        this.transactions = FileHandler.loadTransactions();
    }

    public void addStock(int productId, int quantity) {
        Product product;
		try {
			product = productManager.getProductById(productId);
			if(product == null) {
				throw new InvalidProductIdException();
			}
			int id = IdManager.getNextId("transaction");
	        
	        product.setQuantity(product.getQuantity() + quantity);
	        Transaction transaction = new Transaction(id, productId, "ADD", quantity, getCurrentDate());
	        transactions.add(transaction);
	        
	        saveTransactions();
	        productManager.updateProduct(product.getId(), product.getName(), product.getDescription(), product.getQuantity(), product.getPrice());
		} catch (InvalidProductIdException e) {
			// TODO Auto-generated catch block
			System.out.println("error: " + e.getMessage());
		}
        
    }

    public void removeStock(int productId, int quantity) throws InsufficientStockException {
        Product product;
		try {
			product = productManager.getProductById(productId);
			if(product == null) {
				throw new InvalidProductIdException();
			}
			if (product.getQuantity() < quantity) {
	            throw new InsufficientStockException();
	        }
			int id = IdManager.getNextId("transaction");

	        product.setQuantity(product.getQuantity() - quantity);
	        Transaction transaction = new Transaction(id, productId, "REMOVE", quantity, getCurrentDate());
	        transactions.add(transaction);
	        
	        saveTransactions();
	        productManager.updateProduct(product.getId(), product.getName(), product.getDescription(), product.getQuantity(), product.getPrice());
		} catch (InvalidProductIdException e) {
			// TODO Auto-generated catch block
			System.out.println("error: " + e.getMessage());
		}
        
    }
    
    public void saveTransactions() {
        FileHandler.saveToFile(transactionFilePath, transactions, 
            t -> t.getTransactionId() + "," + t.getProductId() + "," + t.getType() + "," + t.getQuantity() + "," + t.getDate());
    }
    
    public List<Transaction> getTransactions() {
        return new ArrayList<>(transactions);
    }
    
    private String getCurrentDate() {
        return java.time.LocalDate.now().toString();
    }
}



