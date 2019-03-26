package com.cts.connect_project.service;

import com.cts.connect_project.bean.Login;
import com.cts.connect_project.dao.LoginDAO;
import com.cts.connect_project.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService {
	
	
	LoginDAO loginDAO = new LoginDAOImpl();
	@Override
	public int authenticateUser(Login login) {
		// TODO Auto-generated method stub
		return loginDAO.authenticateUser(login);
	}
	
	

}
