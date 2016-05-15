package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.briup.cms.bean.Article;
import com.briup.cms.bean.Category;
import com.briup.cms.common.ConnectionFactory;

public class ArticleDao {
	public void save(Article article){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try {
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_article("
						+ "title,content,author,publishDate,c_id) values(?,?,?,?,?)";
				//预处理sql
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, article.getTitle());
				pstmt.setString(2, article.getContent());
				pstmt.setString(3, article.getAuthor());
				//java.sql.Date  java.util.Date
				long time = article.getPublishDate().getTime();
				pstmt.setDate(4, new Date(time));
				pstmt.setLong(5, article.getC_id());
				
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
	public List<Article>findAll(){
		List<Article> list = new ArrayList<Article>();
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_article";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					Article article = new Article();
					long id = rs.getLong("id");
					String title = rs.getString("title");
					String author = rs.getString("author");
					String content = rs.getString("content");				
					java.util.Date publishDate = rs.getDate("publishDate");
					long c_id = rs.getLong("c_id");
					Article artitle = new Article(id, title, author, content, publishDate, c_id);
				   list.add(artitle);
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

}
