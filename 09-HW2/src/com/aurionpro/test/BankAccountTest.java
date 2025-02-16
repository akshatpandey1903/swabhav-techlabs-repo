package com.aurionpro.test;

import java.util.HashSet;

import com.aurionpro.model.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        HashSet<BankAccount> accounts = new HashSet<>();
        accounts.add(new BankAccount(101, "Akshat", 5000.0));
        accounts.add(new BankAccount(102, "Vatsal", 7000.0));
        accounts.add(new BankAccount(103, "Mustafa", 3000.0));

        BankAccount maxBalanceAccount = null;
        double maxBalance = Double.MIN_VALUE;

        for (BankAccount acc : accounts) {
            if (acc.getBalance() > maxBalance) {
                maxBalance = acc.getBalance();
                maxBalanceAccount = acc;
            }
        }

        System.out.println("All Accounts:");
        for (BankAccount acc : accounts) {
            System.out.println(acc);
        }

        System.out.println("\nAccount with Maximum Balance:");
        System.out.println(maxBalanceAccount);
    }
}

