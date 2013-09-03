package com.fixent.scm.server.service;

import java.util.List;

import com.fixent.scm.server.model.Shop;

public interface ShopService {
	
	Boolean createShop(Shop shop);
	
	Boolean modifyShop(Shop shop);
	
	Boolean deleteShop(Shop shop);
	
	Shop getShop(String shopId);
	
	List<Shop> getShops();
	
	

}
