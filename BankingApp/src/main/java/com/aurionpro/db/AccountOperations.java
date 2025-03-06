package com.aurionpro.db;

import com.aurionpro.entity.Account;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountOperations {
    private Connection connection;

    public AccountOperations() {
        this.connection = DatabaseConnection.getObject().getConnection();
    }
    
    private int generateAccountNumber() {
    	int accountNo = 1000; // Starting Number
    	String query = "SELECT MAX(account_no) FROM accounts";
    	
    	try (
    		 PreparedStatement stmt = connection.prepareStatement(query);
    		 ResultSet rs = stmt.executeQuery()) {

    		if (rs.next() && rs.getInt(1) != 0) {
    			accountNo = rs.getInt(1) + 1;
    		}

    	} catch (Exception e) {
    		e.printStackTrace();
    	}

    	return accountNo;
    }

    public boolean addAccount(int userId, double balance) {
        String query = "INSERT INTO accounts(account_no, user_id, balance) VALUES(?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            int accNo = generateAccountNumber();
            ps.setInt(1, accNo);
            ps.setInt(2, userId);
            ps.setDouble(3, balance);
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }   
    }

    public List<Account> getAccounts() {
        List<Account> accounts = new ArrayList<>();
        String query = "SELECT * FROM accounts";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Account acc = new Account(
                        rs.getInt("account_no"),
                        rs.getInt("user_id"),
                        rs.getDouble("balance"),
                        rs.getString("created_at"));
                accounts.add(acc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }
    
    public Account getAccountByUserId(int userId) {
    	Account account = null;
    	try (PreparedStatement ps = connection.prepareStatement("SELECT * FROM accounts WHERE user_id = ?")) {
    		ps.setInt(1, userId);
    		ResultSet rs = ps.executeQuery();
    		if (rs.next()) {
    			account = new Account(
    					rs.getInt("account_no"),
    					rs.getInt("user_id"),
    					rs.getDouble("balance"),
    					rs.getString("created_at")
    			);
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return account;
    }

    public boolean updateAccount(Account acc) {
    	String query = "UPDATE accounts SET balance = ? WHERE account_no = ?";
    	try (PreparedStatement stmt = connection.prepareStatement(query)) {
    		stmt.setDouble(1, acc.getBalance());
    		stmt.setInt(2, acc.getAccountNo());
    		int rows = stmt.executeUpdate();
    		return rows > 0;
    	} catch (SQLException e) {
    		e.printStackTrace();
    		System.out.println("Error while updating account balance");
    	}
    	return false;
    }



}


