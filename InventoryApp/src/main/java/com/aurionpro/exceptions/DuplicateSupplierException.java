package com.aurionpro.exceptions;

public class DuplicateSupplierException extends Exception {
    @Override
    public String getMessage() {
        return "Error: Supplier already exists.";
    }

}
