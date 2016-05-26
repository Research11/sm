<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请求参数</title>
</head>
<body>
	
	<form action="testModelAttribute" method="post">
		<input type="text" name="name" value="lisi"/>
		<input type="password" name="password" value=""/>
		<input type="text" name="email" value=""/>
		<input type="submit" value="pojo">
	</form>
	
</body>
</html>