package com.aurionpro.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionTest {

    private static final String URL = "jdbc:mysql://localhost:3306/organization";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    private static final String INSERT_EMPLOYEE_SQL = "INSERT INTO employee (`empNo`, `empName`, `job`, `hireDate`, `salary`, `deptno`) VALUES (?, ?, ?, ?, ?, ?);";
    private static final String UPDATE_EMPLOYEE_SQL = "UPDATE employee SET salary = ? WHERE empNo = ?;";

    public static void main(String[] args) {
    	Connection connection;
        try {
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
            
        	connection  = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);

            try (PreparedStatement insertStatement = connection.prepareStatement(INSERT_EMPLOYEE_SQL);
                 PreparedStatement updateStatement = connection.prepareStatement(UPDATE_EMPLOYEE_SQL)) {

                
                insertStatement.setInt(1, 7941);
                insertStatement.setString(2, "CCC");
                insertStatement.setString(3, "CLERK");
                insertStatement.setString(4, "1991-01-01");
                insertStatement.setInt(5, 1100);
                insertStatement.setInt(6, 10);
                insertStatement.executeUpdate();

                
                updateStatement.setInt(1, 2300);
                updateStatement.setInt(2, 7940);
                updateStatement.executeUpdate();

                
                connection.commit();
                System.out.println("Transaction committed successfully!");

            } catch (SQLException e) {
                connection.rollback();
                System.out.println("Transaction rolled back.");
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
    }
}
