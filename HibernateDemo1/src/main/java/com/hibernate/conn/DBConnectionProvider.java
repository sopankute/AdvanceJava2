package com.hibernate.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionProvider {

	private static Connection connectionProvider = null;

	private DBConnectionProvider() {
		if(connectionProvider!=null) {
			throw new RuntimeException("Exception occurred in creating new Instance of DBConnectionProvider");
		}
	}
	
	public static Connection getConnection() {
		
		if(connectionProvider == null) {
			
			synchronized (DBConnectionProvider.class) {
				if(connectionProvider==null)
					try {
						return  DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "Mysqsk45@123");
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
		}
		
		return connectionProvider;
	}
	
}
