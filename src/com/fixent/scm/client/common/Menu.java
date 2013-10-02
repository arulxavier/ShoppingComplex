package com.fixent.scm.client.common;

import java.util.HashMap;
import java.util.Map;

public class Menu {
	
	Map<String, String> rootMenu = new HashMap<String, String>();
	Map<String, Map<String, String>> subMenuMap = new HashMap<String, Map<String,String>>();
	Map<String, String> shopinfo = new HashMap<String, String>();
	Map<String, String> rentSubMenu = new HashMap<String, String>();
	
	public Menu() {
		
		rootMenu.put("1", "Shop Info");
		rootMenu.put("2", "Report");

		shopinfo.put("1", "Shop Details");
		shopinfo.put("2", "Tenant Details");
		shopinfo.put("3", "Booking Details");

		
		subMenuMap.put("Shop Info", shopinfo);
		
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
