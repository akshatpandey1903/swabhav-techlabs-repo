package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.aurionpro.model.CustomerAgeSort;

public class CustomerAgeSortTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<CustomerAgeSort> customers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Customer " + (i + 1));
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("DOB (dd-MM-yyyy): ");
            String dob = scanner.nextLine();
            System.out.print("Phone: ");
            String phone = scanner.nextLine();

            customers.add(new CustomerAgeSort(id, name, email, dob, phone));
        }

        Collections.sort(customers, new Comparator<CustomerAgeSort>() {
        	public int compare(CustomerAgeSort customer1, CustomerAgeSort customer2) {
        		return Integer.compare(customer1.getAge(), customer2.getAge());
        	}
        });
        
//        Arrays.sort(customers, (a, b) --> a.getDateOfBirth().compareTo(b.getDateOfBirth()));

        System.out.println("\nSorted Customers by Age:");
        for (CustomerAgeSort c : customers) c.display();

        scanner.close();

	}
}
