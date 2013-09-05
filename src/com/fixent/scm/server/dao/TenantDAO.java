package com.fixent.scm.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.fixent.scm.server.model.Shop;
import com.fixent.scm.server.model.ShopGroup;
import com.fixent.scm.server.model.Tenant;

public class TenantDAO 
extends BaseDAO {
	

	
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public Boolean createTenant(Tenant tenant) {
		
		int value = 0;
		Boolean status = false;
		try {
			
			connection = getConnection();

			preparedStatement = connection
					.prepareStatement("INSERT INTO TENANT (ID, NAME, MOBILE_NUMBER, BOOKING_DATE, "
							+ "ADVANCE_AMOUNT, LAST_DUE_DATE, NEXT_DUE_DATE, BALANCE_PAYMENT, "
							+ "EXTRA_PAYMENT) VALUES (default,?,?,?,?,?,?,?,?);");
			
			preparedStatement.setString(1, tenant.getName());
			preparedStatement.setInt(2, tenant.getMobileNumber());
			preparedStatement.setDate(3, getSqlDate(tenant.getBookingDate()));
			preparedStatement.setLong(4, tenant.getAdvanceAmount());
			preparedStatement.setInt(4, 1);
				
			value = preparedStatement.executeUpdate();
			
			if (value == 1) {
				status = true;
			} else {
				status = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	

	public Boolean modifyShop(Shop shop) {
		
		int value = 0;
		Boolean status = false;
		
		try {
			
			
			connection = getConnection();

			preparedStatement = connection
					.prepareStatement("UPDATE shop "
							+ "SET NAME = ?, "
							+ "SQRT_FEET = ?, "
							+ "RENT_PER_SQRT_FEET = ?, "
							+ "GROUP_ID = ? "
							+ "WHERE ID = ?");
			preparedStatement.setString(1, shop.getName());
			preparedStatement.setLong(2, shop.getSqrtFeet());
			preparedStatement.setLong(3, shop.getRentPerSqrtFeet());
			preparedStatement.setInt(4, shop.getGroup().getId());
			preparedStatement.setInt(5, shop.getId());
				
			value = preparedStatement.executeUpdate();
			
			if (value == 1) {
				status = true;
			} else {
				status = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
	Boolean deleteShop(Shop shop) {
		
		return false;
		
	}
	
	public Shop getShop(Long shopId) {
		
		Shop shop = new Shop();
		try {
			
			connection = getConnection();
			preparedStatement = connection.prepareStatement("SELECT * FROM shopping_complex.shop where id = ?");
			preparedStatement.setLong(1, shopId);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				shop.setId(resultSet.getInt(1));
				shop.setName(resultSet.getString(2));
				shop.setSqrtFeet(resultSet.getLong(3));
				shop.setRentPerSqrtFeet(resultSet.getLong(4));
				PreparedStatement preparedStatement = connection
						.prepareStatement("SELECT * FROM shopping_complex.shop_group where id = ?");
				preparedStatement.setLong(1, resultSet.getLong(5));
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					ShopGroup group = new ShopGroup();
					group.setId(resultSet.getInt(1));
					group.setName(resultSet.getString(2));
					shop.setGroup(group);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return shop;
	}
	
	public List<Shop> getShops() {
		

		List<Shop> shops = new ArrayList<Shop>();
		
		try {
			
			connection = getConnection();
			preparedStatement = connection.prepareStatement("SELECT * FROM shopping_complex.shop");
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				Shop shop = new Shop();
				shop.setId(resultSet.getInt(1));
				shop.setName(resultSet.getString(2));
				shop.setSqrtFeet(resultSet.getLong(3));
				shop.setRentPerSqrtFeet(resultSet.getLong(4));
				PreparedStatement preparedStatement = connection
						.prepareStatement("SELECT * FROM shopping_complex.shop_group where id = ?");
				preparedStatement.setLong(1, resultSet.getLong(5));
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					ShopGroup group = new ShopGroup();
					group.setId(resultSet.getInt(1));
					group.setName(resultSet.getString(2));
					shop.setGroup(group);
				}
				
				shops.add(shop);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return shops;
	}


}
