package com.aurionpro.db;

import com.aurionpro.entity.Transaction;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionOperations {
    private Connection con;

    public TransactionOperations(Connection con) {
        this.con = con;
    }

    public boolean addTransaction(Transaction txn) {
        String query = "INSERT INTO transactions(sender_id, receiver_id, type, amount, description) VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, txn.getSenderId());
            ps.setInt(2, txn.getReceiverId());
            ps.setString(3, txn.getType());
            ps.setDouble(4, txn.getAmount());
            ps.setString(5, txn.getDescription());
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Transaction> getTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        String query = "SELECT * FROM transactions";
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
}



