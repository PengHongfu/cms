package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.briup.cms.bean.Automobile;
import com.briup.cms.common.ConnectionFactory;

public class AutomobileDao {
	public void save(Automobile automobile){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_automobile("
						+ "title,company,content,publishDate,c_id) values(?,?,?,?,?)";
				//预处理sql
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, automobile.getTitle());
				pstmt.setString(3, automobile.getContent());
				pstmt.setString(2, automobile.getCompany());
				//java.sql.Date  java.util.Date
				long time = automobile.getPublishDate().getTime();
				pstmt.setDate(4, new Date(time));
				pstmt.setLong(5, automobile.getC_id());
				
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
	/*
	 * 查询信息
	 * */
	public List<Automobile>findAll(){
		List<Automobile> list = new ArrayList<Automobile>();
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_automobile";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					Automobile autombile = new Automobile();
					long id = rs.getLong("id");
					String title = rs.getString("title");
					String company = rs.getString("company");
					String content = rs.getString("content");				
					java.util.Date publishDate = rs.getDate("publishDate");
					long c_id = rs.getLong("c_id");
					Automobile automoblie1 = new Automobile(id, title, company, content, publishDate, c_id);
				   list.add(automoblie1);
				}
			}finally{
				if(rs!=null){
					rs.close();
				}
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
		
		return list;
	}
	public void deleteById(long id){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				//获取连接
				conn = ConnectionFactory.getConn();
				String sql = "delete from t_automobile where id=?";
				//预处理sql
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1,id);
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
