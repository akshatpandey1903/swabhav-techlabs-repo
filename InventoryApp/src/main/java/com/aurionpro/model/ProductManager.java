package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products;
    private static String filePath = "C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\InventoryApp\\src\\products.txt";

    public ProductManager() {
        this.products = FileHandler.loadProducts();
    }

    public void addProduct(String name, String description, int quantity, double price) {
        int id = IdManager.getNextId("product");
        Product product = new Product(id, name, description, quantity, price);
        products.add(product);
        FileHandler.saveToFile(filePath, products, p -> p.getId() + "," + p.getName() + "," + p.getDescription() + "," + p.getQuantity() + "," + p.getPrice());
    }

    public Product getProductById(int id) {
        for(Product product : products) {
        	if(product.getId() == id) {
        		return product;
        	}
        }
        return null;
    }

    public void updateProduct(int id, String name, String description, int quantity, double price) {
        Product product = getProductById(id);
        if (product != null) {
            product.setName(name);
            product.setDescription(description);
            product.setQuantity(quantity);
            product.setPrice(price);
            FileHandler.saveToFile(filePath, products, p -> p.getId() + "," + p.getName() + "," + p.getDescription() + "," + p.getQuantity() + "," + p.getPrice());
        }
    }

    public void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
        FileHandler.saveToFile(filePath, products, p -> p.getId() + "," + p.getName() + "," + p.getDescription() + "," + p.getQuantity() + "," + p.getPrice());
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
}




