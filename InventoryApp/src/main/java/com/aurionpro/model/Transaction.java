package com.aurionpro.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction implements Serializable {
    
    private int transactionId;
    private int productId;
    private String type;
    private int quantity;
    private String date;

    public Transaction(int id, int productId, String type, int quantity, String date) {
        this.transactionId = id;
        this.productId = productId;
        this.type = type;
        this.quantity = quantity;
        this.date = date;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getProductId() {
        return productId;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDate() {
        return date;
    }

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", productId=" + productId + ", type=" + type
				+ ", quantity=" + quantity + ", date=" + date + "]";
	}

}




