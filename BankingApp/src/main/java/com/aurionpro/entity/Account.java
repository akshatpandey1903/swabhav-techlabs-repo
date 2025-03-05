package com.aurionpro.entity;

public class Account {
    private int accountNo;
    private int userId;
    private double balance;
    private String createdAt;

    public Account(int accountNo, int userId, double balance, String createdAt) {
        this.accountNo = accountNo;
        this.userId = userId;
        this.balance = balance;
        this.createdAt = createdAt;
    }

    public Account() {}

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}



