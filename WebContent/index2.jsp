<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请求参数</title>
</head>
<body>
	
	<form action="testRequestParam" method="post">
		<input type="text" name="username" value=""/>
		<input type="text" name="age" value=""/>
		<input type="submit" value="requestparam">
	</form>
	
	<hr/>
	
	<form action="testpojo" method="post">
		<input type="text" name="name" value=""/>
		<input type="password" name="password" value=""/>
		<input type="text" name="email" value=""/>
		<input type="text" name="address.city" value=""/>
		<input type="text" name="address.province" value=""/>
		<input type="submit" value="pojo">
	</form>
	
</body>
</html>