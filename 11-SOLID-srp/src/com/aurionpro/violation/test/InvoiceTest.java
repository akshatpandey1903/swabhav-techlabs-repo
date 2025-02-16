package com.aurionpro.violation.test;

import java.util.Scanner;

import com.aurionpro.violation.model.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Invoice invoice = null;
		
		invoice = takeProductDetails(invoice, scanner);
		invoice.printInvoice();
	}
	
	public static Invoice takeProductDetails(Invoice invoice, Scanner scanner) {
		System.out.print("Enter Product ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Product description: ");
		String description = scanner.nextLine();
		System.out.print("Product amount: ");
		double amount = scanner.nextDouble();
		
		invoice = new Invoice(id,description,amount);
		return invoice;
	}
	
}
