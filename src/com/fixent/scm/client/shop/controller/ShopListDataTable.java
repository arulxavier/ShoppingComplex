package com.fixent.scm.client.shop.controller;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.fixent.scm.server.model.Shop;

public class ShopListDataTable extends AbstractTableModel {

	public ShopListDataTable(List<Shop> studentList) {
		super();
		this.shopList = studentList;
	}

	/**/
	private static final long serialVersionUID = 1L;
	List<Shop> shopList;
	String columnList[] = new String[] { "Shop No", "Group Name" };

	
	public int getColumnCount() {
		return columnList.length;
	}

	
	public int getRowCount() {
		return shopList.size();
	}

	
	public Object getValueAt(int rowIndex, int columnIndex) {

		Shop entity = shopList.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return entity.getNumber();
		case 1:
			return entity.getGroup() != null ? entity.getGroup().getName() : null;
		default:
			return null;
		}
	}

	
	public String getColumnName(int col) {
		return columnList[col];
	}

}
