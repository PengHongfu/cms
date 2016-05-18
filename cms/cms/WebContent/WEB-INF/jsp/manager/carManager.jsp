<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>品牌管理</h1>
<hr>
<table border="1" style="width: 100%;border-collapse:collapse;">
	<tr>
		<th>编号</th>
		<th>品牌名称</th>
		<th>品牌国籍</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${carlist}" var="c" >
	<tr>
		<td><input type="checkbox"/></td>
		<td>${c.brand_name}</td>
		<td>${c.brand_nation}</td>
		<td>
		<a href="delCar.action?brand_id=${c.brand_id}">删除  </a>
        <a href="javascript:void(0);">修改   </a>
         </td>
	</tr>
	</c:forEach>
</table>
