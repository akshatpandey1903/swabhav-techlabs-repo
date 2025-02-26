package com.aurionpro.exceptions;

public class InvalidTransactionException extends Exception {
    @Override
    public String getMessage() {
        return "Error: Transaction details are invalid.";
    }

}
