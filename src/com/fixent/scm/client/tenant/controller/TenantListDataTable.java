package com.fixent.scm.client.tenant.controller;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.fixent.scm.server.model.Tenant;

public class TenantListDataTable extends AbstractTableModel {

	public TenantListDataTable(List<Tenant> shopList) {
		super();
		this.shopList = shopList;
	}

	/**/
	private static final long serialVersionUID = 1L;
	List<Tenant> shopList;
	String columnList[] = new String[] { "Shop No", "Shop Name" };

	@Override
	public int getColumnCount() {
		return columnList.length;
	}

	@Override
	public int getRowCount() {
		return shopList.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		Tenant entity = shopList.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return entity.getShop() != null ? entity.getShop().getNumber() : null;
		case 1:
			return entity.getShopName() ;
		default:
			return null;
		}
	}

	@Override
	public String getColumnName(int col) {
		return columnList[col];
	}

}
