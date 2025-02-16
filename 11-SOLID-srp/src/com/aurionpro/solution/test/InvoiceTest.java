package com.aurionpro.solution.test;

import java.util.Scanner;

import com.aurionpro.solution.model.Invoice;
import com.aurionpro.solution.model.InvoicePrinter;
import com.aurionpro.solution.model.TaxCalculator;


public class InvoiceTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Invoice invoice = null;
		
		invoice = takeProductDetails(invoice, scanner);
		TaxCalculator taxCalculator = new TaxCalculator(invoice);
		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice, taxCalculator);
		
		System.out.println();
		invoicePrinter.printInvoice();
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

