package com.briup.cms.web.action.manager;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

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
	private Long id;
	private ICategoryService categoryService 
              = new CategoryServiceImpl();
    private List<Category> categorylist;
    
    //添加栏目方法
	@Action(value= "addCategory")
	public void addCategory(){
		Category category = new Category(null,name,code);
		categoryService.add(category);
    	//System.out.println("添加栏目");
    }
	//删除栏目
	@Action(value= "delCategory")
	public void delCategory(){
		categoryService.delete(id);
    	//System.out.println(id);
    }
	//栏目管理
	@Action(value="toCategoryManager",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/categoryManager.jsp")})
	public String toCategoryManager(){
		categorylist = categoryService.list();
		return "success";
	}
	

	public List<Category> getCategorylist() {
		return categorylist;
	}
	public void setCategorylist(List<Category> categorylist) {
		this.categorylist = categorylist;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
}
