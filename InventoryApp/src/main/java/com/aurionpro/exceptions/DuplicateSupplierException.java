package com.aurionpro.exceptions;

public class DuplicateSupplierException extends Exception {
    @Override
    public String getMessage() {
        return "Supplier already exists.";
    }

}
