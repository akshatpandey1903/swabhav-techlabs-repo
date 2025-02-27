package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.exceptions.InvalidProductIdException;

public class ProductManager {
    private List<Product> products;
    private static String filePath = "C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\InventoryApp\\src\\products.bin";

    public ProductManager() {
        this.products = FileHandler.loadProducts();
    }

    public int addProduct(String name, String description, int quantity, double price) {
        int id = IdManager.getNextId("product");
        Product product = new Product(id, name, description, quantity, price);
        products.add(product);
        saveProducts();
        return id;
    }

    public Product getProductById(int id) throws InvalidProductIdException {
        for(Product product : products) {
        	if(product.getId() == id) {
        		return product;
        	}
        }
        throw new InvalidProductIdException();
    }
    public void getSingleProduct(int id) throws InvalidProductIdException {
    	 System.out.println(getProductById(id));
    }

    public void updateProduct(int id, String name, String description, int quantity, double price) {
        Product product;
		try {
			product = getProductById(id);
			if (product != null) {
	            product.setName(name);
	            product.setDescription(description);
	            product.setQuantity(quantity);
	            product.setPrice(price);
	            saveProducts();
	        }
		} catch (InvalidProductIdException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
		}
    }

    public void deleteProduct(int id) {
        boolean removed = products.removeIf(p -> p.getId() == id);
        if(removed == false) {
        	System.out.println("Product not found");
        	return;
        }
        saveProducts();
        System.out.println("Product deleted successfully!");
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
    
    public void saveProducts() {
        FileHandler.saveToFile(filePath, products);
    }

}




