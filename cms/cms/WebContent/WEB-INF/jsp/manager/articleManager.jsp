<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
	th{
		background: lightblue;
		font-family: 微软雅黑;
		font-size: 14px;
	}
	td{
		text-align: center;
		font-family: 微软雅黑;
		font-size: 14px;
	}
</style>
<h1>文章管理</h1>
<hr>
<table  border="1" style="width: 100%;border-collapse: collapse;margin-top: 10px" >
	<tr>
		<th>编号</th>
		<th>文章标题</th>
		<th>文章作者</th>
		<th>发布日期</th>
		<th>操作</th>
	</tr>
	<c:forEach items="${articlelist}" var="a" >
	<tr>
		<td><input type="checkbox"/></td>
		<td>${a.title}</td>
		<td>${a.author}</td>
		<td>${a.publishDate}</td>
		<td>
		<a href="javascript:void(0);" val="${a.id }"class ="del">删除  </a>
        <a href="javascript:void(0);">修改   </a>
         </td>
	</tr>
	</c:forEach>
</table>
<script>
$(function(){
	var url = "delArticle.action";
	var cc = $(".baseUI li:contains('信息管理')");
	$(".del").off();
	$(".del").on("click",function(){
		var id = $(this).attr("val");
		var flag = confirm("确认删除吗？");
		if(flag){
			$.post(url,{id:id},function(){
				//模拟点击
				cc.trigger("click");
			})
		}
	});
});
</script>