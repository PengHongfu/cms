package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.briup.cms.bean.Category;
import com.briup.cms.common.ConnectionFactory;

public class CategoryDao {
	
	public void save(Category category){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_category(name,code) values(?,?)";
				//预处理sql
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, category.getName());
				pstmt.setString(2, category.getCode());
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
public List<Category> findAll(){
		List<Category> list = new ArrayList<Category>();
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_category";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					Category category = new Category();
					long id = rs.getLong("id");
					String name = rs.getString("name");
					String code = rs.getString("code");
					category.setCode(code);
					category.setId(id);
					category.setName(name);
					list.add(category);
				}
			}finally{
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
public void deleteById(long id){
			try {
				Connection conn = null;
				PreparedStatement pstmt = null;
				try{
					//获取连接
					conn = ConnectionFactory.getConn();
					String sql = "delete from t_category where id=?";
					//预处理sql
					pstmt = conn.prepareStatement(sql);
					pstmt.setLong(1, id);
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
