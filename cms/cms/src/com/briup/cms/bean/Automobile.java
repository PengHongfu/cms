package com.briup.cms.bean;

import java.util.Date;

public class Automobile {
	private Long  id;
	private String title;//标题
	private String company;//发布公司
	private String content;//发布内容
	private Date publishDate;//发布日期
	private Long c_id;//car类品牌，car类 外键
	public Automobile() {
			}
	
	public Automobile(Long id, String title, String company, String content,
			Date publishDate, Long c_id) {
		super();
		this.id = id;
		this.title = title;
		this.company = company;
		this.content = content;
		this.publishDate = publishDate;
		this.c_id = c_id;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Long getC_id() {
		return c_id;
	}
	public void setC_id(Long c_id) {
		this.c_id = c_id;
	}
	
	
}