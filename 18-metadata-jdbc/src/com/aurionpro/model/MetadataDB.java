package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetadataDB {
	
	private DatabaseConnection dataBase;
	private Connection connection;
	
	public MetadataDB() {
		dataBase = new DatabaseConnection();
		connection = dataBase.getConnection();
	}
	
	public void getMetaData() {
		DatabaseMetaData metaData;
		
		try {
			metaData = connection.getMetaData();
			Statement stmt = connection.createStatement();
			
			ResultSet tables = metaData.getTables("college", null, "%", new String[] {"TABLE"});
		    while (tables.next()) {
		        String tableName = tables.getString("TABLE_NAME");
		        System.out.println("Table: " + tableName);
		        
		        String query = "Select * from " + tableName;
		        ResultSet rs = stmt.executeQuery(query) ;
		        ResultSetMetaData rstmd = rs.getMetaData();
		        int columnNumber = rstmd.getColumnCount();
		        int i=1;
		        while (columnNumber > 0) {
		            String columnName = rstmd.getColumnName(i);
		            String columnType = rstmd.getColumnTypeName(i);
		            System.out.println("\tColumn: " + columnName + ", Type: " + columnType);
		            i++;
		            columnNumber--;
		        }
		    }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
