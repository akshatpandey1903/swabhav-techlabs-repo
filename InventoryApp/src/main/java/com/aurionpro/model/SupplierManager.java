package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.exceptions.DuplicateSupplierException;
import com.aurionpro.exceptions.InvalidSupplierIdException;

public class SupplierManager {
	private List<Supplier> suppliers;
	private static final String filePath = "C:\\Users\\Akshat.Pandey\\Desktop\\akJava\\InventoryApp\\src\\suppliers.txt";

    public SupplierManager() {
        this.suppliers = FileHandler.loadSuppliers();
    }
    
    public void addSupplier(String name, String contactInfo) throws DuplicateSupplierException {
    	for(Supplier supplier : suppliers) {
        	if(supplier.getName().equalsIgnoreCase(name)) {
        		throw new DuplicateSupplierException();
        	}
        }
        int id = IdManager.getNextId("supplier");
        Supplier supplier = new Supplier(id, name, contactInfo);
        suppliers.add(supplier);
        saveSuppliers();
    }
    
    public Supplier getSupplierById(int id) throws InvalidSupplierIdException {
        for(Supplier supplier : suppliers) {
        	if(supplier.getSupplierId() == id) {
        		return supplier;
        	}
        }
        throw new InvalidSupplierIdException();
    }
    
    public void updateSupplier(int id, String name, String contactInfo) {
        Supplier supplier;
		try {
			supplier = getSupplierById(id);
			if (supplier != null) {
	            supplier.setName(name);
	            supplier.setContactInfo(contactInfo);
	            saveSuppliers();
	        }
		} catch (InvalidSupplierIdException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: " + e.getMessage());
		}
        
    }

    public void deleteSupplier(int id) throws InvalidSupplierIdException {
        boolean removed = suppliers.removeIf(p -> p.getSupplierId() == id);
        if(!removed) {
        	throw new InvalidSupplierIdException();
        }
        saveSuppliers();
        System.out.println("Supplier deleted successfully!");
    }

    public List<Supplier> getAllSuppliers() {
        return new ArrayList<>(suppliers);
    }
    
    public void saveSuppliers() {
        FileHandler.saveToFile(filePath, suppliers, 
            s -> s.getSupplierId() + "," + s.getName() + "," + s.getContactInfo());
    }

}
