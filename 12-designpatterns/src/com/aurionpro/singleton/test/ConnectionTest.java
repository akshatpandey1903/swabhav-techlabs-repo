package com.aurionpro.singleton.test;

import com.aurionpro.singleton.model.DatabaseConnection;

public class ConnectionTest {
	public static void main(String[] args) {
		
		DatabaseConnection connection1 = DatabaseConnection.getDatabaseConnection();
		System.out.println(connection1.hashCode());
		
		DatabaseConnection connection2 = DatabaseConnection.getDatabaseConnection();
		System.out.println(connection2.hashCode());
		
		DatabaseConnection connection3 = DatabaseConnection.getDatabaseConnection();
		System.out.println(connection3.hashCode());
		
		DatabaseConnection connection4 = DatabaseConnection.getDatabaseConnection();
		System.out.println(connection4.hashCode());
		
	}
}
