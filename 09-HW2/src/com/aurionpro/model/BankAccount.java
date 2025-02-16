package com.aurionpro.model;

import java.util.Objects;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{Account Number=" + accountNumber + ", Holder=" + accountHolderName + ", Balance=" + balance + "}";
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (!(obj instanceof BankAccount)) return false;
//        BankAccount account = (BankAccount) obj;
//        return accountNumber == account.accountNumber;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(accountNumber);
//    }
}

