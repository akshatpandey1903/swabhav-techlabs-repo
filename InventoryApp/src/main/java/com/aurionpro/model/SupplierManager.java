package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class SupplierManager {
	private List<Supplier> suppliers;
	private static final String filePath = "C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\InventoryApp\\src\\suppliers.txt";

    public SupplierManager() {
        this.suppliers = FileHandler.loadSuppliers();
    }
    
    public void addSupplier(String name, String contactInfo) {
        int id = IdManager.getNextId("supplier");
        Supplier supplier = new Supplier(id, name, contactInfo);
        suppliers.add(supplier);
        FileHandler.saveToFile(filePath, suppliers, s -> s.getSupplierId() + "," + s.getName() + "," + s.getContactInfo());
    }
    
    public Supplier getSupplierById(int id) {
        for(Supplier supplier : suppliers) {
        	if(supplier.getSupplierId() == id) {
        		return supplier;
        	}
        }
        return null;
    }
    
    public void updateSupplier(int id, String name, String contactInfo) {
        Supplier supplier = getSupplierById(id);
        if (supplier != null) {
            supplier.setName(name);
            supplier.setContactInfo(contactInfo);
            FileHandler.saveToFile(filePath, suppliers, s -> s.getSupplierId() + "," + s.getName() + "," + s.getContactInfo());
        }
    }

    public void deleteSupplier(int id) {
        boolean removed = suppliers.removeIf(p -> p.getSupplierId() == id);
        if(removed == false) {
        	System.out.println("Supplier not found");
        	return;
        }
        FileHandler.saveToFile(filePath, suppliers, s -> s.getSupplierId() + "," + s.getName() + "," + s.getContactInfo());
        System.out.println("Supplier deleted successfully!");
    }

    public List<Supplier> getAllSuppliers() {
        return new ArrayList<>(suppliers);
    }
}
