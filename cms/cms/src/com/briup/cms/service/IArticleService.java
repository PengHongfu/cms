package com.briup.cms.service;

import java.util.List;

import com.briup.cms.bean.Article;

public interface IArticleService {
	//添加学生
		void add(Article article);
		List<Article> list();
}
