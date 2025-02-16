package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//import java.util.Scanner;

import com.aurionpro.model.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
//    	Scanner scanner = new Scanner(System.in);
//    	
//    	System.out.println("Enter the number of accounts you want to create");
//    	int numberOfAccounts = scanner.nextInt();
//    	
//    	for(int i=0; i<numberOfAccounts; ++i) {
//    		
//    	}
    	
        List<BankAccount> accounts = Arrays.asList(
                new BankAccount(101, "Akshat", 5000.0),
                new BankAccount(102, "Vatsal", 7000.0),
                new BankAccount(103, "Mustafa", 3000.0),
                new BankAccount(104, "Aadit", 10000.0),
                new BankAccount(105, "Bala", 2000.0)
        );

        
        accounts.stream()
        		.min(Comparator.comparingDouble(BankAccount::getBalance))
                .ifPresent(acc -> System.out.println("Account with Minimum Balance: " + acc));

        
        accounts.stream()
        		.max(Comparator.comparingDouble(BankAccount::getBalance))
                .ifPresent(acc -> System.out.println("Account with Maximum Balance: " + acc));

       
        System.out.println("Accounts with names > 6 characters:");
        accounts.stream()
                .filter(acc -> acc.getAccountHolderName().length() > 6)
                .map(BankAccount::getAccountHolderName)
                .forEach(System.out::println);
        
        double totalBalance = accounts.stream()
                .mapToDouble(BankAccount::getBalance)
                .sum();
        System.out.println("Total Balance in all accounts: " + totalBalance);
    }
}

