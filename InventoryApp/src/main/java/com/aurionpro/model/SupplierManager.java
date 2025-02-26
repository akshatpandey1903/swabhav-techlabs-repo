package com.aurionpro.model;

import java.util.List;

public class SupplierManager {
	private List<Supplier> suppliers;
	private static String filePath = "C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\InventoryApp\\src\\suppliers.txt";

    public SupplierManager() {
        this.suppliers = FileHandler.loadSuppliers();
    }
}
