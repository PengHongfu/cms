package com.briup.cms.web.action.manager;

import org.apache.struts2.convention.annotation.Action;

import com.briup.cms.bean.Category;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 栏目处理类
 */
public class CategoryAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String code;
    private ICategoryService categoryService 
              = new CategoryServiceImpl();
	@Action(value= "addCategory")
	public void addCategory(){
		Category category = new Category(null,name,code);
		categoryService.add(category);
    	//System.out.println("添加栏目");
    }
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
