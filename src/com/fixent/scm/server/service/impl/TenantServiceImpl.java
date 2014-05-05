package com.fixent.scm.server.service.impl;

import java.util.List;

import com.fixent.scm.server.dao.TenantDAO;
import com.fixent.scm.server.model.Tenant;
import com.fixent.scm.server.service.BaseService;
import com.fixent.scm.server.service.TenantService;

public class TenantServiceImpl 
extends BaseService 
implements TenantService {

	
	public Boolean createTenant(Tenant tenant) {
		
		TenantDAO dao = new TenantDAO();
		boolean status = dao.createTenant(tenant);		
		return  status;
	}

	
	public Boolean modifyTenant(Tenant tenant) {
		
		TenantDAO dao = new TenantDAO();
		return dao.modifyShop(tenant);
	}

	
	public Boolean deleteTenant(Tenant tenant) {
		
		TenantDAO dao = new TenantDAO();
		return dao.deleteShop(tenant);
	}

	
	public Tenant getTenant(Long tenantId) {
		
		TenantDAO dao = new TenantDAO();
		return dao.getTenant(tenantId);
	}

	
	public List<Tenant> getTenants() {
		
		TenantDAO dao = new TenantDAO();
		return dao.getTenants();
	}
	
	

}
