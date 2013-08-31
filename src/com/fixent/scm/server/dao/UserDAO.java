package com.fixent.scm.server.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.fixent.scm.server.model.User;

public class UserDAO {

	private Connection connect = null;
//	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public Boolean login(User user) {

		boolean status = false;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/ssm?user=ssmuser&password=ssmpw");

//			statement = connect.createStatement();
//			resultSet = statement.executeQuery("select * from user");
			preparedStatement = connect
					.prepareStatement("select * from user where user_name = ? and password = ?;");
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			status = preparedStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	
	Date getSqlDate(java.util.Date date) {
		
		return new java.sql.Date(date.getTime());
	} 
	

}
