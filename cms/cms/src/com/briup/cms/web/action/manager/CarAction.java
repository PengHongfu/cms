package com.briup.cms.web.action.manager;

import java.util.List;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import com.briup.cms.bean.Car;
import com.briup.cms.service.ICarService;
import com.briup.cms.service.impl.CarServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 栏目处理类
 */
public class CarAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private Long brand_id;
	private  String brand_name;
	private  String brand_nation;
	private ICarService carService = new CarServiceImpl();
	private List<Car> carlist;
	
    //添加栏目方法
	@Action(value= "addCar")
	public void addCar(){
		Car car = new Car(null,brand_name,brand_nation);
		carService.add(car);
    }
	//删除品牌
		@Action(value= "delCar")
	public void delCategory(){
		System.out.println(brand_id);
	    carService.delete(brand_id);
			
	    }
	//品牌管理
		@Action(value="toCarManager",results={
				@Result(name="success",location="/WEB-INF/jsp/manager/carManager.jsp")})
		public String toCarManager(){
			setCarlist(carService.list());
			return "success";
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
	public List<Car> getCarlist() {
		return carlist;
	}
	public void setCarlist(List<Car> carlist) {
		this.carlist = carlist;
	}
	
}
