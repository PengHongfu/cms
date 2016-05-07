package com.briup.cms.web.action.manager;

import org.apache.struts2.convention.annotation.Action;
import com.briup.cms.bean.Student;
import com.briup.cms.service.IStudentService;
import com.briup.cms.service.impl.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {

	/**
	 *学生类
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String sex;
	private IStudentService studentService 
    = new StudentServiceImpl();
	@Action(value= "addStudent")
	public void addCategory(){
		Student student = new Student(null, name,age,sex);
		studentService.add(student);
    	System.out.println("添加学生");
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
