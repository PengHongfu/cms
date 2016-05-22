package com.briup.cms.service.impl;

import java.util.List;


import com.briup.cms.bean.Automobile;
import com.briup.cms.dao.AutomobileDao;
import com.briup.cms.service.IAutomobileService;


public class AutomobileServiceImpl implements  IAutomobileService{
	private AutomobileDao automobileDao = new AutomobileDao();

	@Override
	public void add(Automobile automobile) {
		automobileDao.save(automobile);
		
	}
	@Override
	public List<Automobile> list() {
		return automobileDao.findAll();
	}
	@Override
	public void delete(long id) {
		automobileDao.deleteById(id);		
	}

	

}
