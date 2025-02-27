package com.aurionpro.exceptions;

public class InsufficientStockException extends Exception {
    @Override
    public String getMessage() {
        return "Insufficient stock available for this transaction.";
    }

}
