package com.fixent.scm.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.fixent.scm.server.model.User;

public class UserDAO 
extends BaseDAO {

	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public Boolean login(User user) {

		boolean status = false;
		try {

			connection = getConnection();

//			statement = connect.createStatement();
//			resultSet = statement.executeQuery("select * from user");
			preparedStatement = connection
					.prepareStatement("select * from user where user_name = ? and password = ?;");
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			status = preparedStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return status;
	}
}
