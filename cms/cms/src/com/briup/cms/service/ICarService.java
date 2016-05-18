package com.briup.cms.service;

import java.util.List;
import com.briup.cms.bean.Car;

/**
 * 栏目管理的业务逻辑
 * */
public interface ICarService {
	//添加栏目
	void add(Car car);
	//列出所有栏目
	List<Car> list();
	//删除栏目
	void delete(long brand_id);
	
}
