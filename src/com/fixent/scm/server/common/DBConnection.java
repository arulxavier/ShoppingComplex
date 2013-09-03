package com.fixent.scm.server.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static DBConnection instance;
	
	private DBConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public static DBConnection getInstance() {
		
		if (instance == null) {
			instance = new DBConnection();
		}
		return instance;
	}
	
	public Connection getConnection() {
		
		Connection connection = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/SHOPPING_COMPLEX?user=scmuser&password=scmpw");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;

	}

}
