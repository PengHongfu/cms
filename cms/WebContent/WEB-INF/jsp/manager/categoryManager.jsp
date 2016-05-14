<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>栏目管理</h1>
<hr>
<table border="1" style="width: 100%;border-collapse:collapse;">
	<tr>
		<th>编号</th>
		<th>栏目名称</th>
		<th>栏目编号</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${categorylist }" var="c" >
	<tr>
		<td><input type="checkbox"/></td>
		<td>${c.name}</td>
		<td>${c.code}</td>
		<td>
		<a href="delCategory.action?id=${c.id}">删除  </a>
        <a href="javascript:void(0);">修改   </a>
         </td>
	</tr>
	</c:forEach>
</table>