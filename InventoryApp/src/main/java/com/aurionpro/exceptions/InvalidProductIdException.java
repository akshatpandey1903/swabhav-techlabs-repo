package com.aurionpro.exceptions;

public class InvalidProductIdException extends Exception {
    @Override
    public String getMessage() {
        return "Product ID is invalid or not found.";
    }

}
