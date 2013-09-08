package com.fixent.scm.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.fixent.scm.server.model.Rent;

public class RentDAO 
extends BaseDAO {


	Connection connection = null;
	PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	public boolean createRent(Rent rent) {
		
		int value = 0;
		Boolean status = false;
		try {
			
			connection = getConnection();

			preparedStatement = connection
					.prepareStatement("INSERT INTO rent (ID,ADVANCE_AMOUNT,BOOKING_DATE,SHOP_ID,TENANT_ID)VALUES(default,?,?,?,?);");
			
			
			
			preparedStatement.setDouble(1, rent.getAdvanceAmount());
			preparedStatement.setDate(2, getSqlDate(rent.getBookingDate()));
			preparedStatement.setInt(3, rent.getShop().getId());
			preparedStatement.setInt(4, rent.getTenant().getId());
				
			value = preparedStatement.executeUpdate();
			
			if (value == 1) {
				status = true;
			} else {
				status = false;
			}

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
