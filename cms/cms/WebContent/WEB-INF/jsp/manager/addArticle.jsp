<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<script>
	$(function() {
		var form = $("#addArticleForm");
		form.off();
		form.on("submit", function() {
			form.ajaxSubmit(function() {
				form[0].reset();
				alert("添加成功！");
			});
			return false;
		});
	});
</script>
<h1>信息发布</h1>
<hr>
<form action="addArticle.action" method="post" id="addArticleForm">
	信息标题:<input type="text" name="title" /><br />
	 信息作者:<input type="text"name="author" /><br /> 
	所属栏目:<select name ="c_id">
		     <option>-----请选择-----</option>
		     <c:forEach items="${categorylist }" var="c">
		     <option value="${c.id}">${c.name}</option>
	            </c:forEach>
	          </select><br /> 
	信息内容:
	<textarea  name = "content"rows="5" cols="20"></textarea>
	<br> <input type="submit" value="添加" /><br />
</form>