package com.aurionpro.exceptions;

public class InvalidSupplierIdException extends Exception {
    @Override
    public String getMessage() {
        return "Error: Supplier ID is invalid or not found.";
    }

}
