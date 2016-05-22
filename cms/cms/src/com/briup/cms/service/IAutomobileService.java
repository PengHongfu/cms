package com.briup.cms.service;

import java.util.List;

import com.briup.cms.bean.Automobile;

public interface IAutomobileService {
	//添加学生
		void add(Automobile automobile);
		List<Automobile> list();
		void delete(long id);
}
