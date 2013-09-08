package com.fixent.scm.server.service.impl;

import java.util.List;

import com.fixent.scm.server.dao.TenantDAO;
import com.fixent.scm.server.model.Tenant;
import com.fixent.scm.server.service.BaseService;
import com.fixent.scm.server.service.TenantService;

public class TenantServiceImpl 
extends BaseService 
implements TenantService {

	@Override
	public Boolean createTenant(Tenant tenant) {
		
		TenantDAO dao = new TenantDAO();
		dao.createTenant(tenant);
		
		try {
			
			ShopServiceImpl impl = new ShopServiceImpl();
			impl.updateShopNumber(tenant.getShop());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return  null;
	}

	@Override
	public Boolean modifyTenant(Tenant tenant) {
		
		TenantDAO dao = new TenantDAO();
		return dao.modifyShop(tenant);
	}

	@Override
	public Boolean deleteTenant(Tenant tenant) {
		
		TenantDAO dao = new TenantDAO();
		return dao.deleteShop(tenant);
	}

	@Override
	public Tenant getTenant(Long tenantId) {
		
		TenantDAO dao = new TenantDAO();
		return dao.getTenant(tenantId);
	}

	@Override
	public List<Tenant> getTenants() {
		
		TenantDAO dao = new TenantDAO();
		return dao.getTenants();
	}
	
	

}
