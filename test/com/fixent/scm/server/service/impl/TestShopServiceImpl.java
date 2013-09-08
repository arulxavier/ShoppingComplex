package com.fixent.scm.server.service.impl;

import com.fixent.scm.server.model.Shop;
import com.fixent.scm.server.model.ShopGroup;

public class TestShopServiceImpl {
	
	public static void main(String[] args) {
		
		
		Shop shop = new Shop();
		shop.setNumber(123);
		shop.setSqrtFeet(400.00);
		shop.setRentPerSqrtFeet(100.00);
		ShopGroup group = new ShopGroup();
		group.setId(2);
		shop.setGroup(group);
		
		ShopServiceImpl impl = new ShopServiceImpl();
		System.out.println("Shop Create : " + impl.createShop(shop));
		
		/*shop = impl.getShop(12);
		
		List<Shop> list = impl.getShops();
		
		shop.setSqrtFeet(500.00);
		impl.modifyShop(shop);
		
		impl.deleteShop(shop);
		
		System.out.println();*/
	}

}
