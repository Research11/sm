<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="login">test sessionAttributes</a>

<form action="login" method="post">
	<form:errors path="*"></form:errors>
	<input type="hidden" name="id" value="1"/>
	姓名：<input type="text" name="name" value="${person.name}"/>
	<form:errors path="name"></form:errors>
	<!-- 年龄：<input type="text" name="age"/> -->
	<!-- 邮箱：<input type="text" name="email"/> -->
	<!-- 日期：<input type="text" name="birthday"/> -->
	<input type="submit" value="提交"/>
</form>
</body>
</html>