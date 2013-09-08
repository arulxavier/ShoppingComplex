package com.fixent.scm.server.service.impl;

import sun.awt.geom.AreaOp.AddOp;

import com.fixent.scm.server.model.Address;
import com.fixent.scm.server.model.Shop;
import com.fixent.scm.server.model.Tenant;

public class TestTenantServiceImpl {
	
	public static void main(String[] args) {
		
		TenantServiceImpl impl = new TenantServiceImpl();
		
		Tenant tenant = new Tenant();
		
		Address address = new Address();
		address.setStreet("Ram Nagar");
		address.setCity("Chennai");
		address.setState("TamilNadu");
		address.setCountry("India");
		address.setPincode(600042);
		tenant.setAddress(address);
		
		Shop shop = new Shop();
		shop.setId(12);
		shop.setNumber(67);
		tenant.setShop(shop);
		
		tenant.setShopName("Vasanthamm Caterinng");
		tenant.setContactPersonName("Arul Xavier Raj");
		tenant.setMobileNumber(9940478587L);
		tenant.setLandLineNumber(04412345L);
		
		
		
		
		impl.createTenant(tenant);
	}

}
