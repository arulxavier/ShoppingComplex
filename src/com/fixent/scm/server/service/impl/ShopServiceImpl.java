package com.fixent.scm.server.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.fixent.scm.server.dao.ShopDAO;
import com.fixent.scm.server.model.Shop;
import com.fixent.scm.server.service.BaseService;
import com.fixent.scm.server.service.ShopService;

public class ShopServiceImpl
extends BaseService
implements ShopService{

	
	public Boolean createShop(Shop shop) {
		
		ShopDAO dao = new ShopDAO();
		Boolean status = dao.createShop(shop);
		return status;
	}

	
	public Boolean modifyShop(Shop shop) {
		
		ShopDAO dao = new ShopDAO();
		return dao.modifyShop(shop);
	}

	
	public Boolean deleteShop(Shop shop) {
		
		ShopDAO dao = new ShopDAO();
		dao.deleteShop(shop);
		return null;
	}

	
	public Shop getShop(int shopId) {
		
		ShopDAO dao = new ShopDAO();
		Shop shop = dao.getShop(shopId);
		return shop;
	}

	
	public List<Shop> getShops() {
		
		ShopDAO dao = new ShopDAO();
		List<Shop> shops = dao.getShops();
		return shops;
	}

	/**
	 * 
	 * @return
	 */
	public List<String> getShopNumbers() {
		
		List<String> shopNumbers = new ArrayList<String>();
		try {
			
			ShopDAO dao = new ShopDAO();
			shopNumbers = dao.getShopNumbers();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return shopNumbers;
	}
	
	

}
