package com.aurionpro.model;

import java.io.Serializable;

public class Supplier implements Serializable {
   
	private final int supplierId;
    private String name;
    private String contactInfo;

    public Supplier(int id, String name, String contactInfo) {
        this.supplierId = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public int getSupplierId(){ 
    	return supplierId; 
    }
    
    public String getName() { 
    	return name; 
    }
    
    public void setName(String name) { 
    	this.name = name; 
    }
    
    public String getContactInfo() { 
    	return contactInfo; 
    }
    
    public void setContactInfo(String contactInfo) { 
    	this.contactInfo = contactInfo; 
    }

    @Override
    public String toString() {
        return "Supplier ID: " + supplierId + ", Name: " + name + ", Contact: " + contactInfo;
    }
}




