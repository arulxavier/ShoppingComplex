package com.fixent.scm.server.service.impl;

import com.fixent.scm.server.model.Shop;

public class TestShopServiceImpl {
	
	public static void main(String[] args) {
		
		
		Shop shop = new Shop();
		shop.setName("Shop Namw");
		shop.setSqrtFeet(400);
		shop.setRentPerSqrtFeet(100);
		ShopServiceImpl impl = new ShopServiceImpl();
		impl.createShop(shop);
	}

}
