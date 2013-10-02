package com.fixent.scm.server.service;

import java.util.List;

import com.fixent.scm.server.model.ShopGroup;

public interface ShopGroupService {
	
	boolean createShopGroup(ShopGroup shopGroup);
	
	boolean modifyShopGroup(ShopGroup shopGroup);
	
	boolean deleteShopGroup(ShopGroup shopGroup);
	
	List<ShopGroup> getShopGroups();

}
