package com.aurionpro.db;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Logic {
    private Connection connection;

    public Logic() {
        this.connection = DatabaseConnection.getObject().getConnection();
    }

    public String checkCredentials(String username, String password) {
        String query = "SELECT roleid FROM users WHERE user_name = ? AND password = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int roleid = resultSet.getInt("roleid");
                if (roleid == 1) {
                    return "customer";
                } else if (roleid == 2) {
                    return "admin";
                }
            }
        } catch (SQLException e) {
            System.out.println("Error in checkCredentials: " + e.getMessage());
        }
        return null;
    }
}



