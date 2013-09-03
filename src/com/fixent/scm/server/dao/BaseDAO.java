package com.fixent.scm.server.dao;

import java.sql.Connection;

import com.fixent.scm.server.common.DBConnection;

public class BaseDAO {
	
	Connection getConnection() {
		
		Connection connection = DBConnection.getInstance().getConnection();
				
		return connection;
	}

}
