package com.fixent.scm.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.fixent.scm.server.model.Shop;
import com.fixent.scm.server.model.ShopGroup;

public class ShopDAO 
extends BaseDAO {
	
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public Boolean createShop(Shop shop) {
		
		int value = 0;
		Boolean status = false;
		try {
			
			connection = getConnection();

			preparedStatement = connection
					.prepareStatement("INSERT INTO shop "
							+ "(ID, NUMBER, SQRT_FEET, RENT_PER_SQRT_FEET, GROUP_ID) "
							+ "VALUES (default,?,?,?,?);");
			preparedStatement.setInt(1, shop.getNumber());
			preparedStatement.setDouble(2, shop.getSqrtFeet());
			preparedStatement.setDouble(3, shop.getRentPerSqrtFeet());
			preparedStatement.setInt(4, shop.getGroup().getId());
				
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
	

	public Boolean modifyShop(Shop shop) {
		
		int value = 0;
		Boolean status = false;
		
		try {
			
			
			connection = getConnection();

			preparedStatement = connection
					.prepareStatement("UPDATE shop "
							+ "SET SQRT_FEET = ?, "
							+ "RENT_PER_SQRT_FEET = ?, "
							+ "GROUP_ID = ? "
							+ "WHERE ID = ?");
			preparedStatement.setDouble(1, shop.getSqrtFeet());
			preparedStatement.setDouble(2, shop.getRentPerSqrtFeet());
			preparedStatement.setInt(3, shop.getGroup().getId());
			preparedStatement.setInt(4, shop.getId());
				
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
	
	public Boolean deleteShop(Shop shop) {
		
		
		return false;
		
	}
	
	public Shop getShop(int shopId) {
		
		Shop shop = new Shop();
		try {
			
			connection = getConnection();
			preparedStatement = connection.prepareStatement("SELECT * FROM shopping_complex.shop where id = ?");
			preparedStatement.setLong(1, shopId);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				shop.setId(resultSet.getInt(1));
				shop.setSqrtFeet(resultSet.getDouble(2));
				shop.setRentPerSqrtFeet(resultSet.getDouble(3));
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
				shop.setSqrtFeet(resultSet.getDouble(2));
				shop.setRentPerSqrtFeet(resultSet.getDouble(3));
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


	public Boolean updateShopNumber(Shop shop) {
		
		int value = 0;
		Boolean status = false;
		
		try {
			
			
			connection = getConnection();

			preparedStatement = connection
					.prepareStatement("UPDATE shop SET NUMBER = ? WHERE ID = ?;");
			preparedStatement.setInt(1, shop.getNumber());
			preparedStatement.setInt(2, shop.getId());
				
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
