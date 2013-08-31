package com.fixent.scm.server.service.impl;

import com.fixent.scm.server.dao.UserDAO;
import com.fixent.scm.server.model.User;
import com.fixent.scm.server.service.UserService;

public class UserServiceImpl 
implements UserService{

	@Override
	public Boolean login(User user) {
		
		UserDAO dao = new UserDAO();
		boolean status = dao.login(user);
		return status;
	}

}
