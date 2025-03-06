package com.aurionpro.db;

import com.aurionpro.entity.Account;
import com.aurionpro.entity.Transaction;
import com.aurionpro.exceptions.InsufficientBalanceException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionOperations {
    private Connection con;
    private AccountOperations accOps;

    public TransactionOperations() {
        this.con = DatabaseConnection.getObject().getConnection();
        accOps = new AccountOperations();
    }

    public boolean addTransaction(int senderId, int receiverId, String type, double amount, String description) {
    	String sql = "INSERT INTO transactions(sender_id, receiver_id, type, amount, description, transaction_date) VALUES (?, ?, ?, ?, ?, NOW())";
    	try (
    	     PreparedStatement ps = con.prepareStatement(sql)) {

    		if (type.equals("deposit")) {
    			ps.setNull(1, java.sql.Types.INTEGER);
    			ps.setInt(2, receiverId);             
    		} else if (type.equals("withdraw")) {
    			ps.setInt(1, senderId);               
    			ps.setNull(2, java.sql.Types.INTEGER); 
    		} else if (type.equals("transfer")) {
    			ps.setInt(1, senderId);
    			ps.setInt(2, receiverId);
    		}

    		ps.setString(3, type);
    		ps.setDouble(4, amount);
    		ps.setString(5, description);

    		int rows = ps.executeUpdate();
    		return rows > 0;
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return false;
    }

    public List<Transaction> getTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        String query = "SELECT * FROM transactions ORDER by transaction_date desc";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Transaction txn = new Transaction(
                        rs.getInt("transaction_id"),
                        rs.getInt("sender_id"),
                        rs.getInt("receiver_id"),
                        rs.getString("type"),
                        rs.getDouble("amount"),
                        rs.getString("description"),
                        rs.getString("transaction_date"));
                transactions.add(txn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transactions;
    }
    
    public List<Transaction> getFilteredTransactions(String type, String sort, String order) {
    	List<Transaction> transactions = new ArrayList<>();

    	try{
    		String sql = "SELECT * FROM transactions WHERE (? = '' OR type = ?) ORDER BY " + sort + " " + order;

    		PreparedStatement ps = con.prepareStatement(sql);
    		ps.setString(1, type);
    		ps.setString(2, type);

    		ResultSet rs = ps.executeQuery();
    		while (rs.next()) {
    			Transaction transaction = new Transaction(
    					rs.getInt("transaction_id"),
    					rs.getInt("sender_id"),
    					rs.getInt("receiver_id"),
    					rs.getString("type"),
    					rs.getDouble("amount"),
    					rs.getString("description"),
    					rs.getString("transaction_date"));
    			transactions.add(transaction);
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return transactions;
    }

    public List<Transaction> getTransactionsByAccountNo(int accountNo) {
    	List<Transaction> transactions = new ArrayList<>();
    	try (PreparedStatement ps = con.prepareStatement("SELECT * FROM transactions WHERE sender_id = ? OR receiver_id = ? ORDER BY transaction_date DESC")) {
    		ps.setInt(1, accountNo);
    		ps.setInt(2, accountNo);
    		ResultSet rs = ps.executeQuery();
    		while (rs.next()) {
    			Transaction transaction = new Transaction(
    					rs.getInt("transaction_id"),
    					rs.getInt("sender_id"),
    					rs.getInt("receiver_id"),
    					rs.getString("type"),
    					rs.getDouble("amount"),
    					rs.getString("description"),
    					rs.getString("transaction_date"));
    			transactions.add(transaction);
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return transactions;
    }

    public void deposit(int accId, double amount, String description) throws Exception {
    	Account acc = accOps.getAccountByUserId(accId);
    	acc.setBalance(acc.getBalance() + amount);
    	if(!accOps.updateAccount(acc)) {
    		System.out.println("Failed to update");
    		return;
    	}
    	System.out.println("Updated successfully");
    	addTransaction(accId, accId, "deposit", amount, description);
    }

    public void withdraw(int accId, double amount, String description) throws Exception {
    	Account acc = accOps.getAccountByUserId(accId);
    	if (acc.getBalance() < amount) {
    		throw new InsufficientBalanceException();
    	}
    	acc.setBalance(acc.getBalance() - amount);
    	if(!accOps.updateAccount(acc)) {
    		System.out.println("Failed to update");
    		return;
    	}
    	System.out.println("Updated successfully");
    	addTransaction(accId, accId, "withdraw", amount, description);
    }

    public void transfer(int senderId, int receiverId, double amount, String description) throws Exception {
    	Account senderAcc = accOps.getAccountByUserId(senderId);
    	Account receiverAcc = accOps.getAccountByUserId(receiverId);

    	if (senderAcc.getBalance() < amount) {
    		throw new InsufficientBalanceException();
    	}

    	senderAcc.setBalance(senderAcc.getBalance() - amount);
    	receiverAcc.setBalance(receiverAcc.getBalance() + amount);

    	if(!accOps.updateAccount(senderAcc)) {
    		System.out.println("Failed to update");
    		return;
    	}
    	System.out.println("Updated successfully");
    	if(!accOps.updateAccount(receiverAcc)) {
    		System.out.println("Failed to update");
    		return;
    	}
    	System.out.println("Updated successfully");
    	addTransaction(senderId, receiverId, "transfer", amount, description);
    }

}



