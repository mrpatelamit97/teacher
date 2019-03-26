package com.cts.connect_project.service;

import com.cts.connect_project.bean.Help;
import com.cts.connect_project.dao.HelpDao;
import com.cts.connect_project.dao.HelpDaoImpl;

public class HelpServiceImpl implements HelpService {

	HelpDao helpDao = new HelpDaoImpl();
	@Override
	public String insertHelp(Help help) {
		// TODO Auto-generated method stub
		return helpDao.insertHelp(help);
	}

}
