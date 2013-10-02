package com.fixent.scm.server.dao;

import java.util.ArrayList;
import java.util.List;

import com.fixent.scm.server.model.ShopGroup;

public class ShopGroupDAO extends BaseDAO {

	public boolean createShopGroup(ShopGroup shopGroup) {
		int value = 0;
		Boolean status = false;
		try {

			connection = getConnection();
			preparedStatement = connection
					.prepareStatement("INSERT INTO shop_group (ID, NAME) VALUES (default,?);");
			preparedStatement.setString(1, shopGroup.getName());
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

	public boolean modifyShopGroup(ShopGroup shopGroup) {

		int value = 0;
		Boolean status = false;
		
		try {
			connection = getConnection();
			preparedStatement = connection
					.prepareStatement("UPDATE shop_group SET NAME = ? WHERE ID = ?;");
			preparedStatement.setString(1, shopGroup.getName());
			preparedStatement.setInt(2, shopGroup.getId());
			status = preparedStatement.execute();
			
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

	public boolean deleteShopGroup(ShopGroup shopGroup) throws Exception {

		boolean status = false;
		connection = getConnection();
		preparedStatement = connection
				.prepareStatement("DELETE FROM SHOP_GROUP WHERE ID = ?;");
		preparedStatement.setInt(1, shopGroup.getId());
		status = preparedStatement.execute();
		return status;
	}

	public List<ShopGroup> getShopGroups() throws Exception {

		List<ShopGroup> shopGroups = new ArrayList<ShopGroup>();
		connection = getConnection();
		preparedStatement = connection.prepareStatement("");
		resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {

			ShopGroup shopGroup = new ShopGroup();
			shopGroup.setId(resultSet.getInt(1));
			shopGroup.setName(resultSet.getString(2));
			shopGroups.add(shopGroup);
		}
		return shopGroups;
	}

}
