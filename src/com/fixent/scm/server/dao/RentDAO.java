package com.fixent.scm.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;

import com.fixent.scm.server.model.Rent;
import com.fixent.scm.server.util.DateUtil;

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
					.prepareStatement("INSERT INTO rent (ID,ADVANCE_AMOUNT,BOOKING_DATE,SHOP_NO,TENANT_ID)VALUES(default,?,?,?,?);");
			
			
			
			preparedStatement.setDouble(1, rent.getAdvanceAmount());
			preparedStatement.setDate(2, getSqlDate(rent.getBookingDate()));
			preparedStatement.setInt(3, rent.getShop().getNumber());
			preparedStatement.setInt(4, rent.getTenant().getId());
			
			value = preparedStatement.executeUpdate();
			
			preparedStatement = connection.prepareStatement("SELECT ID FROM RENT WHERE SHOP_NO = ? AND TENANT_ID = ?");
			preparedStatement.setInt(1, rent.getShop().getNumber());
			preparedStatement.setInt(2, rent.getTenant().getId());
			
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				
				int rentId = resultSet.getInt(1);
			}
			
			
			preparedStatement = connection
					.prepareStatement("INSERT INTO schedule (" +
							"LAST_DUE_DATE, " +
							"DUE_DATE, " +
							"DUE_AMOUNT, " +
							"PAYMENT_DATE, " +
							"PAYMENT_AMOUNT, " +
							"RENT_ID) " +
							"VALUES (default, ?, ?, ?, ?, ?, ?);");
			preparedStatement.setDate(1, null);
			preparedStatement.setDate(2, getSqlDate(DateUtil.getLastDayOfTheMonth()));
			preparedStatement.setInt(3, rent.getId());
			
			
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
