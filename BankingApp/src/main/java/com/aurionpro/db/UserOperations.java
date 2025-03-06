package com.aurionpro.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.entity.Account;
import com.aurionpro.entity.User;

public class UserOperations {

    private Connection connection;

    public UserOperations() {
        this.connection = DatabaseConnection.getObject().getConnection();
    }

    public boolean addUser(User user) {
        String query = "INSERT INTO users (username, password, role, email) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getRole());
            stmt.setString(4, user.getEmail());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public User getUserByUsername(String username) {
        String query = "SELECT * FROM users WHERE username = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new User(
                        rs.getInt("user_id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("role"),
                        rs.getString("email"),
                        rs.getString("created_at")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> getAllCustomers() {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM users WHERE role = 'customer'";
        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                users.add(new User(
                        rs.getInt("user_id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("role"),
                        rs.getString("email"),
                        rs.getString("created_at")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
    
    public User authenticateUser(String username, String password, String role) {
    	User user = null;
    	try {
    		String query = "SELECT * FROM users WHERE username=? AND password=? AND role=?";
    		PreparedStatement stmt = connection.prepareStatement(query);
    		stmt.setString(1, username);
    		stmt.setString(2, password);
    		stmt.setString(3, role);
    		ResultSet rs = stmt.executeQuery();

    		if (rs.next()) {
    			user = new User(
    					rs.getInt("user_id"), 
    					rs.getString("username"), 
    					rs.getString("password"),
    					rs.getString("role"), 
    					rs.getString("email"),
    					rs.getString("created_at"));
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return user;
    }

    public List<User> getAllCustomersSortedByUsername() {
    	List<User> customerList = new ArrayList<>();
    	try{
    		String sql = "SELECT * FROM users WHERE role='customer' ORDER BY username";
    		PreparedStatement pst = connection.prepareStatement(sql);
    		ResultSet rs = pst.executeQuery();
    		while (rs.next()) {
    			customerList.add(new User(
    					rs.getInt("user_id"),
    					rs.getString("username"),
    					rs.getString("password"),
    					rs.getString("role"),
    					rs.getString("email"),
    					rs.getString("created_at")));
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return customerList;
    }

    public List<User> searchCustomers(String keyword) {
    	List<User> customerList = new ArrayList<>();
    	try {
    		String sql = "SELECT * FROM users WHERE role='customer' AND username LIKE ?";
    		PreparedStatement pst = connection.prepareStatement(sql);
    		pst.setString(1, "%" + keyword + "%");
    		ResultSet rs = pst.executeQuery();
    		while (rs.next()) {
    			customerList.add(new User(
    					rs.getInt("user_id"),
    					rs.getString("username"),
    					rs.getString("password"),
    					rs.getString("role"),
    					rs.getString("email"),
    					rs.getString("created_at")));
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return customerList;
    }
    
    public boolean updateUser(User user) {
    	String query = "UPDATE users SET email = ?, password = ? WHERE user_id = ?";
    	try (PreparedStatement stmt = connection.prepareStatement(query)) {
    		stmt.setString(1, user.getEmail());
    		stmt.setString(2, user.getPassword());
    		stmt.setInt(3, user.getUserId());
    		int rows = stmt.executeUpdate();
    		return rows > 0;
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return false;
    }
    
    public List<Account> getAccountsByUserId(int userId) {
    	List<Account> accounts = new ArrayList<>();
    	String query = "SELECT * FROM accounts WHERE user_id = ?";
    	try (PreparedStatement stmt = connection.prepareStatement(query)) {
    		stmt.setInt(1, userId);
    		ResultSet rs = stmt.executeQuery();
    		while (rs.next()) {
    			Account account = new Account(
    					rs.getInt("account_no"),
    					rs.getInt("user_id"),
    					rs.getDouble("balance"),
    					rs.getString("created_at")
    			);
    			accounts.add(account);
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return accounts;
    }

}



