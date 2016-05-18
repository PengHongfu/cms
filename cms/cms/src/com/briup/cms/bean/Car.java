package com.briup.cms.bean;

public class Car {
	private Long brand_id;
	private String brand_name;
	private String brand_nation;
	public Car() {
			}
	
	public Car(Long brand_id, String brand_name, String brand_nation) {
		super();
		this.brand_id = brand_id;
		this.brand_name = brand_name;
		this.brand_nation = brand_nation;
	}

	public Long getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Long brand_id) {
		this.brand_id = brand_id;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getBrand_nation() {
		return brand_nation;
	}
	public void setBrand_nation(String brand_nation) {
		this.brand_nation = brand_nation;
	}
	
	
	
}