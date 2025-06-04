<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<h2>회원가입</h2>
	<form:form modelAttribute="user" method="post" action="/spring-legacy/auth/signup">
    아이디: <form:input path="id" />
		<br />
    이름: <form:input path="username" />
		<br />
    이메일: <form:input path="email" />
		<br />
    비밀번호: <form:password path="password" />
		<br />
		<input type="submit" value="가입" />
	</form:form>
</body>
</html>