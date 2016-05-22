<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<script>
	$(function() {
		var form = $("#addAutomobileForm");
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
<h1>汽车发布</h1>
<hr>
<form action="addAutomobile.action" method="post" id="addAutomobileForm">
	汽车标题:<input type="text" name="title" /><br />
	 所属公司:<input type="text"name="company" /><br /> 
	所属栏目:<select name ="c_id">
		     <option>-----请选择-----</option>
		     <c:forEach items="${carlist}" var="c">
		     <option value="${c.brand_id}">${c.brand_name}</option>
	            </c:forEach>
	          </select><br /> 
	汽车信息:
	<textarea  name = "content"rows="5" cols="20"></textarea>
	<br> <input type="submit" value="添加" /><br />
</form>