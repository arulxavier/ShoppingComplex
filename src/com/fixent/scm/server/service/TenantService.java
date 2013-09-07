package com.fixent.scm.server.service;

import java.util.List;

import com.fixent.scm.server.model.Tenant;

public interface TenantService {
	
	Boolean createTenant(Tenant tenant);
	
	Boolean modifyTenant(Tenant tenant);
	
	Boolean deleteTenant(Tenant tenant);
	
	Tenant getTenant(Long tenantId);
	
	List<Tenant> getTenants();

}
