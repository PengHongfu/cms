package com.briup.cms.web.action.manager;
import java.util.Date;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.briup.cms.bean.Automobile;
import com.briup.cms.bean.Car;
import com.briup.cms.service.IAutomobileService;
import com.briup.cms.service.ICarService;
import com.briup.cms.service.impl.AutomobileServiceImpl;
import com.briup.cms.service.impl.CarServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 栏目处理类
 */
public class AutomobileAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private ICarService carService 
              = new CarServiceImpl();
	private IAutomobileService autobobileService 
	          = new AutomobileServiceImpl();
	private List<Car> carlist;
    private List<Automobile> automobilelist;
    private String title;
    private String  company;
    private String content;
    private Long c_id;
    private Long id;

	@Action(value="toAddAutomobile",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/addAutomobile.jsp")})
	public String toAddAutomobile(){
		carlist = carService.list();
		return "success";	
     }
   //添加文章
	@Action(value= "addAutomobile")
	public void addAutomobile(){ 
		Automobile automobile = new Automobile(null, title, company, content, new Date(), c_id);
		autobobileService.add(automobile);
    	//System.out.println("添加栏目");
    }
	//删除文章
		@Action(value= "delAutomobile")
		public void delAutomobile(){
			autobobileService.delete(id);
	    	//System.out.println(id);
	    }
		 
			public ICarService getCarService() {
			return carService;
		}
		public void setCarService(ICarService carService) {
			this.carService = carService;
		}
			public IAutomobileService getAutobobileService() {
				return autobobileService;
			}
			public void setAutobobileService(IAutomobileService autobobileService) {
				this.autobobileService = autobobileService;
			}
			public List<Car> getCarlist() {
				return carlist;
			}
			public void setCarlist(List<Car> carlist) {
				this.carlist = carlist;
			}
			public List<Automobile> getAutomobilelist() {
				return automobilelist;
			}
			public void setAutomobilelist(List<Automobile> automobilelist) {
				this.automobilelist = automobilelist;
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
			public Long getC_id() {
				return c_id;
			}
			public void setC_id(Long c_id) {
				this.c_id = c_id;
			}
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			
	
}
