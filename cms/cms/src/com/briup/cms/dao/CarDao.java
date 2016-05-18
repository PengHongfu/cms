package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.briup.cms.bean.Car;
import com.briup.cms.bean.Category;
import com.briup.cms.common.ConnectionFactory;

public class CarDao {
	//添加
	public void save(Car car){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_car(brand_name,brand_nation) values(?,?)";
				//预处理sql
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, car.getBrand_name());
				pstmt.setString(2, car.getBrand_nation());
				//执行sql
				pstmt.executeUpdate();
			}finally {
				if(pstmt!=null)
					pstmt.close();
				if(conn!=null){
					conn.close();	
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//查询
public List<Car> findAll(){
		List<Car> list = new ArrayList<Car>();
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_car";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					Car car= new Car();
					long brand_id = rs.getLong("brand_id");
					String brand_name = rs.getString("brand_name");
					String brand_nation = rs.getString("brand_nation");
					car.setBrand_nation(brand_nation);
					car.setBrand_id(brand_id);
					car.setBrand_name(brand_name);
					list.add(car);
				}
			}finally{
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	//删除
public void deleteById(long brand_id){
			try {
				Connection conn = null;
				PreparedStatement pstmt = null;
				try{
					//获取连接
					conn = ConnectionFactory.getConn();
					String sql = "delete from t_car where brand_id=?";
					//预处理sql
					pstmt = conn.prepareStatement(sql);
					pstmt.setLong(1, brand_id);
					//执行sql
					pstmt.executeUpdate();
				}finally{
					if(pstmt!=null){
						pstmt.close();
					}
					if(conn!=null){
						conn.close();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
