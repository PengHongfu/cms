<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <script>
$(function(){
	var form = $("#addCarForm");
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
<center>
<h1>添加汽车品牌页面</h1>
<hr>
<form action="addCar.action" method="post" id="addCarForm">
	汽车名称:<input type="text" name="brand_name"/><br/>
          品牌国籍:<input type="text" name="brand_nation"/><br/>
	<input type="submit" value="提交"/><br/>
</form></center>