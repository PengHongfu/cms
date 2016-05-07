package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	public List<Category>findAll(){
		return null;
	}
}
