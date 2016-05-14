<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <script>
$(function(){
	var form = $("#addCategoryForm");
	form.off();
	form.on("submit",function(){
		form.ajaxSubmit(function(){
			form[0].reset();
		alert("添加成功！");
		});
		return false;
	});
});
</script> 
<h1>添加栏目页面</h1>
<hr>
<form action="addCategory.action" method="post" id="addCategoryForm">
	栏目名称:<input type="text" name="name"/><br/>
	栏目编号:<input type="text" name="code"/><br/>
	<input type="submit" value="添加"/><br/>
</form>