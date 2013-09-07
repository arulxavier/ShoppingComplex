package com.fixent.scm.server.dao;

import java.sql.Connection;
import java.sql.Date;

import com.fixent.scm.server.common.DBConnection;

public class BaseDAO {
	
	Connection getConnection() {
		
		Connection connection = DBConnection.getInstance().getConnection();
				
		return connection;
	}
	
	Date getSqlDate(java.util.Date date) {
		
		return new java.sql.Date(date.getTime());
	} 
	
	java.util.Date getUtilDate(java.sql.Date date) {
		
		return new java.util.Date(date.getTime());
	}

}
