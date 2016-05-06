package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.briup.cms.bean.Category;
import com.briup.cms.common.ConnectionFactory;

public class CategoryDao {
	public void save(Category category){
		Connection conn = ConnectionFactory.getConn();
		String sql = "";
		//PreparedStatement pstmt = conn.prepareStatement(sql);
	}
}
