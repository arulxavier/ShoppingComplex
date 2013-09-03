package com.fixent.scm.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.fixent.scm.server.model.Shop;

public class ShopDAO 
extends BaseDAO {
	
	Connection connection = null;
	PreparedStatement preparedStatement = null;

	public Boolean createShop(Shop shop) {
		
		int value = 0;
		Boolean status = false;
		try {
			
			connection = getConnection();

			preparedStatement = connection
					.prepareStatement("INSERT INTO shop "
							+ "(ID, NAME, SQRT_FEET, RENT_PER_SQRT_FEET, GROUP_ID) "
							+ "VALUES (default,?,?,?,?);");
			preparedStatement.setString(1, shop.getName());
			preparedStatement.setLong(2, shop.getSqrtFeet());
			preparedStatement.setLong(3, shop.getRentPerSqrtFeet());
			preparedStatement.setInt(4, 1);
				
			value = preparedStatement.executeUpdate();
			
			if (value == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
