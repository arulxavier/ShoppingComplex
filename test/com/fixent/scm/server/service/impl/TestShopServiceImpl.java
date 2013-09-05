package com.fixent.scm.server.service.impl;

import java.util.List;

import com.fixent.scm.server.model.Shop;
import com.fixent.scm.server.model.ShopGroup;

public class TestShopServiceImpl {
	
	public static void main(String[] args) {
		
		
		Shop shop = new Shop();
		shop.setName("Shop Namw");
		shop.setSqrtFeet(400);
		shop.setRentPerSqrtFeet(100);
		ShopGroup group = new ShopGroup();
		group.setId(1);
		group.setName("sdsad");
		shop.setGroup(group);
		ShopServiceImpl impl = new ShopServiceImpl();
		impl.createShop(shop);
		
		shop = impl.getShop(2l);
		
		List<Shop> list = impl.getShops();
		
		System.out.println();
	}

}
