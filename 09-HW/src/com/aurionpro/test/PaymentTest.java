package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.CreditCardPayment;
import com.aurionpro.model.DebitCardPayment;
import com.aurionpro.model.Payment;
import com.aurionpro.model.UPIPayment;

public class PaymentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select payment method: 1. Credit Card  2. Debit Card  3. UPI");
        int choice = scanner.nextInt();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        Payment payment = null;
        switch (choice) {
            case 1: payment = new CreditCardPayment(); break;
            case 2: payment = new DebitCardPayment(); break;
            case 3: payment = new UPIPayment(); break;
            default: System.out.println("Invalid choice"); return;
        }

        payment.processPayment(amount);
        scanner.close();
    }
}

