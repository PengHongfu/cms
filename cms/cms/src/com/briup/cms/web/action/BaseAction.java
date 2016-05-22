package com.briup.cms.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.briup.cms.bean.Category;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private List<Category> categorylist;
	private ICategoryService categoryService = new CategoryServiceImpl();
	/**
	 * 跳转到首页
	 * ip:port/命名空间/url
	 * http://localhost:8080/toIndex.action
	 * */
	@Action(value="toIndex",results={
			@Result(name="success",location="/WEB-INF/jsp/index.jsp")})
	public String toIndex(){
		//调用service方法查询栏目信息，并给list里 
		categorylist = categoryService.list();
		//System.out.println("hello---toIndex");
		return "success";
	}
	
	/**
	 * 跳转到列表页
	 * */
	@Action(value="toList",results={
			@Result(name="success",location="/WEB-INF/jsp/list.jsp")})
	public String toList(){
		categorylist = categoryService.list();
		return "success";
	}
	/**
	 * 跳转到内容页
	 * */
	@Action(value="toContent",results={
			@Result(name="success",location="/WEB-INF/jsp/content.jsp")})
	public String toContent(){
		
		return "success";
	}

	public List<Category> getCategorylist() {
		return categorylist;
	}

	public void setCategorylist(List<Category> categorylist) {
		this.categorylist = categorylist;
	}


}
