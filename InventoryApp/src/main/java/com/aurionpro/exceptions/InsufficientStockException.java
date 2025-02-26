package com.aurionpro.exceptions;

public class InsufficientStockException extends Exception {
    @Override
    public String getMessage() {
        return "Error: Insufficient stock available for this transaction.";
    }

}
