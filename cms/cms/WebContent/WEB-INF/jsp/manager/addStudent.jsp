<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>添加学生页面</h1>
<hr>
<form action="addStudent.action" method="post">
	学生名称:<input type="text" name="name"/><br/>
	学生年龄:<input type="text" name="age"/><br/>
	学生性别:<input type="text" name="sex"/><br/>
	<input type="submit" value="提交"/><br/>
</form>