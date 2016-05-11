<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 添加 -->
	<form action="testpost" method="post">
	<input type="submit" value="test rest post">
	</form>
	
	<!-- 删除 -->
	<form action="testdelete/1" method="post">
	<input type="hidden" name="_method" value="DELETE"/>
	<input type="submit" value="test rest delete">
	</form>
	
	<!--  -->
	<form action="testput/1" method="post">
	<input type="hidden" name="_method" value="PUT"/>
	<input type="submit" value="test rest put">
	</form>
	
	<!-- 查询 -->
	<a href="testget/1">test rest get</a>
</body>
</html>