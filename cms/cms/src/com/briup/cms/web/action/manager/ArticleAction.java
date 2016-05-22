package com.briup.cms.web.action.manager;
import java.util.Date;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.briup.cms.bean.Article;
import com.briup.cms.bean.Category;
import com.briup.cms.service.IArticleService;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.service.impl.ArticleServiceImpl;
import com.briup.cms.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 栏目处理类
 */
public class ArticleAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private IArticleService articleService 
              = new ArticleServiceImpl();
	private ICategoryService categoryService 
              = new CategoryServiceImpl();
    private List<Category> categorylist;
    private List<Article> articlelist;
    private String title;
    private String author;
    private String content;
    private Long c_id;
    private Long id;

	@Action(value="toAddArticle",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/addArticle.jsp")})
	public String toAddArticle(){
		categorylist = categoryService.list();
		return "success";	
     }
   //添加文章
	@Action(value= "addArticle")
	public void addArticle(){ 
		Article article = new Article(null, title, author, content, new Date(), c_id);
		articleService.add(article);
    	//System.out.println("添加栏目");
    }
	//删除文章
		@Action(value= "delArticle")
		public void delCategory(){
			articleService.delete(id);
	    	//System.out.println(id);
	    }
	@Action(value="toArticleManager",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/articleManager.jsp")})
	public String toArticleManager(){
		articlelist = articleService.list();
		return "success";
	}

	public List<Article> getArticlelist() {
		return articlelist;
	}
	public void setArticlelist(List<Article> articlelist) {
		this.articlelist = articlelist;
	}
	public IArticleService getArticleService() {
		return articleService;
	}
	public void setArticleService(IArticleService articleService) {
		this.articleService = articleService;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
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
	public List<Category> getCategorylist() {
		return categorylist;
	}
	public void setCategorylist(List<Category> categorylist) {
		this.categorylist = categorylist;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
