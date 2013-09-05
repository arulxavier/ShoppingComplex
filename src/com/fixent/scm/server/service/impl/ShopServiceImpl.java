package com.fixent.scm.server.service.impl;

import java.util.List;

import com.fixent.scm.server.dao.ShopDAO;
import com.fixent.scm.server.model.Shop;
import com.fixent.scm.server.service.BaseService;
import com.fixent.scm.server.service.ShopService;

public class ShopServiceImpl
extends BaseService
implements ShopService{

	@Override
	public Boolean createShop(Shop shop) {
		
		ShopDAO dao = new ShopDAO();
		Boolean status = dao.createShop(shop);
		return status;
	}

	@Override
	public Boolean modifyShop(Shop shop) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteShop(Shop shop) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shop getShop(Long shopId) {
		
		ShopDAO dao = new ShopDAO();
		Shop shop = dao.getShop(shopId);
		return shop;
	}

	@Override
	public List<Shop> getShops() {
		
		ShopDAO dao = new ShopDAO();
		List<Shop> shops = dao.getShops();
		return shops;
	}
	
	

}
