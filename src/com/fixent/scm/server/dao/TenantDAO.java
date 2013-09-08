package com.fixent.scm.server.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
					.prepareStatement("INSERT INTO tenant ("
							+ "ID, "
							+ "SHOP_NAME, "
							+ "CONTACT_PERSON_NAME, "
							+ "MOBILE_NUMBER, "
							+ "LAND_LINE_NUMBER, "
							+ "STREET, "
							+ "CITY, "
							+ "STATE, "
							+ "COUNTRY, "
							+ "PINCODE, "
							+ "SHOP_ID) "
							+ "VALUES (deffault,?,?,?,?,?,?,?,?,?,?);");
			preparedStatement.setString(1, tenant.getShopName());
			preparedStatement.setString(2, tenant.getContactPersonName());
			preparedStatement.setLong(3, tenant.getMobileNumber());
			preparedStatement.setLong(4, tenant.getLandLineNumber());
			preparedStatement.setString(5, tenant.getAddress().getStreet());
			preparedStatement.setString(6, tenant.getAddress().getCity());
			preparedStatement.setString(7, tenant.getAddress().getState());
			preparedStatement.setString(8, tenant.getAddress().getCountry());
			preparedStatement.setInt(9, tenant.getAddress().getPincode());
			preparedStatement.setInt(10, tenant.getShop().getId());
				
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
	

	public Boolean modifyShop(Tenant tenant) {
		
		int value = 0;
		Boolean status = false;
		
		try {
			
			
			connection = getConnection();

			preparedStatement = connection
					.prepareStatement("UPDATE tenant "
							+ "SET NAME = ?, "
							+ "MOBILE_NUMBER = ?, "
							+ "BOOKING_DATE = ?, "
							+ "ADVANCE_AMOUNT = ?, "
							+ "LAST_DUE_DATE = ?, "
							+ "NEXT_DUE_DATE = ?, "
							+ "BALANCE_PAYMENT = ?, "
							+ "EXTRA_PAYMENT = ? "
							+ "WHERE ID = ?;");
			preparedStatement.setString(1, tenant.getContactPersonName());
//			preparedStatement.setInt(2, tenant.getMobileNumber());
			preparedStatement.setInt(9, tenant.getId());
				
				
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
	
	public Boolean deleteShop(Tenant tenant) {
		
		return false;
		
	}
	
	public Tenant getTenant(Long tenantId) {
		
		Tenant tenant = new Tenant();
		try {
			
			connection = getConnection();
			preparedStatement = connection.prepareStatement("SELECT * FROM tenant where id = ?;");
			preparedStatement.setLong(1, tenantId);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				tenant.setId(resultSet.getInt(1));
				tenant.setContactPersonName(resultSet.getString(2));
				tenant.setMobileNumber(resultSet.getInt(3));
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
	
		return tenant;
	}
	
	public List<Tenant> getTenants() {
		

		List<Tenant> tenants = new ArrayList<Tenant>();
		
		try {
			
			connection = getConnection();
			preparedStatement = connection.prepareStatement("SELECT * FROM tenant;");
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				Tenant tenant = new Tenant();
				tenant.setId(resultSet.getInt(1));
				tenant.setContactPersonName(resultSet.getString(2));
				tenant.setMobileNumber(resultSet.getInt(3));
				tenants.add(tenant);
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
	
		return tenants;
	}


}
