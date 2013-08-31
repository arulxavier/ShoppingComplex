package com.fixent.scm.client.common;

import java.util.HashMap;
import java.util.Map;

public class Menu {
	
	Map<String, String> rootMenu = new HashMap<String, String>();
	Map<String, Map<String, String>> subMenuMap = new HashMap<String, Map<String,String>>();
	Map<String, String> masterSubMenu = new HashMap<String, String>();
	Map<String, String> rentSubMenu = new HashMap<String, String>();
	
	public Menu() {
		
		rootMenu.put("1", "Master");
		rootMenu.put("2", "Rent");

		masterSubMenu.put("1", "Shop Detail");
		masterSubMenu.put("2", "Tenant Detail");

		rentSubMenu.put("1", "Rent Detail");
		
		subMenuMap.put("Master", masterSubMenu);
		subMenuMap.put("Rent", rentSubMenu);
		
	}

	public Map<String, String> getRootMenu() {
		return rootMenu;
	}

	public void setRootMenu(Map<String, String> rootMenu) {
		this.rootMenu = rootMenu;
	}

	public Map<String, Map<String, String>> getSubMenuMap() {
		return subMenuMap;
	}

	public void setSubMenuMap(Map<String, Map<String, String>> subMenuMap) {
		this.subMenuMap = subMenuMap;
	}

	
	

}
