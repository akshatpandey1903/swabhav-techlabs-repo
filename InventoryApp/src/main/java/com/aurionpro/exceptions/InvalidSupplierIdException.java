package com.aurionpro.exceptions;

public class InvalidSupplierIdException extends Exception {
    @Override
    public String getMessage() {
        return "Supplier ID is invalid or not found.";
    }

}
