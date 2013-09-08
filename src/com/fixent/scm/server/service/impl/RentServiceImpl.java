package com.fixent.scm.server.service.impl;

import com.fixent.scm.server.dao.RentDAO;
import com.fixent.scm.server.model.Rent;

public class RentServiceImpl {
	
	public boolean createRent(Rent rent) {
		
		RentDAO dao = new RentDAO();
		boolean status = dao.createRent(rent);
		
		return status;
	}

}
