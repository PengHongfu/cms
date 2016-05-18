package com.briup.cms.service.impl;

import java.util.List;

import com.briup.cms.bean.Car;
import com.briup.cms.dao.CarDao;
import com.briup.cms.service.ICarService;

public class CarServiceImpl implements ICarService {
	private CarDao carDao = new CarDao();

	@Override
	public void add(Car car) {
		carDao.save(car);
	}
	@Override
	public List<Car> list() {
		return carDao.findAll();
	}
	@Override
	public void delete(long brand_id) {
		carDao.deleteById(brand_id);
	}

}
