package com.fixent.scm.server.service.impl;

import java.util.List;

import com.fixent.scm.server.dao.ShopGroupDAO;
import com.fixent.scm.server.model.ShopGroup;
import com.fixent.scm.server.service.BaseService;
import com.fixent.scm.server.service.ShopGroupService;

public class ShopGroupServiceImpl 
extends BaseService
implements ShopGroupService 
{

	
	public boolean createShopGroup(ShopGroup shopGroup) {

		ShopGroupDAO dao = new ShopGroupDAO();
		Boolean status = dao.createShopGroup(shopGroup);
		return status;
	}

	
	public boolean modifyShopGroup(ShopGroup shopGroup) {
		
		ShopGroupDAO dao = new ShopGroupDAO();
		Boolean status = dao.modifyShopGroup(shopGroup);
		return status;
	}

	
	public boolean deleteShopGroup(ShopGroup shopGroup) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public List<ShopGroup> getShopGroups() {
		// TODO Auto-generated method stub
		return null;
	}

}
