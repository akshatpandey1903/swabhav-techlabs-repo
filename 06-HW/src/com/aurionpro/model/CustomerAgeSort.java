package com.aurionpro.model;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class CustomerAgeSort {
	 private String customerId;
	    private String name;
	    private String email;
	    private LocalDate dateOfBirth;
	    private String phoneNumber;

	    public CustomerAgeSort(String customerId, String name, String email, String dob, String phoneNumber) {
	        this.customerId = customerId;
	        this.name = name;
	        this.email = email;
	        this.dateOfBirth = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	        this.phoneNumber = phoneNumber;
	    }
	    
	    public LocalDate getDateOfBirth(){
	    	return dateOfBirth;
	    }

	    public int getAge(){
	        return LocalDate.now().getYear() - dateOfBirth.getYear();
	    }

	    public void display(){
	        System.out.println("Customer ID: " + customerId + ", Name: " + name + ", Age: " + getAge());
	    }

}
