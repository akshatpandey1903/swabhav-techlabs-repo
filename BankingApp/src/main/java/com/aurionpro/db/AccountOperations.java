package com.aurionpro.db;

import com.aurionpro.entity.Account;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountOperations {
    private Connection connection;

    public AccountOperations(Connection con) {
        this.connection = con;
    }

    public boolean addAccount(int userId, double balance) {
        String query = "INSERT INTO accounts(user_id, balance) VALUES(?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, userId);
            ps.setDouble(2, balance);
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
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
}


