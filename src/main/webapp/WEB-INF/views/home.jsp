<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Examples</h2>
<ul>
<c:forEach var="ex" items="${examples}">
  <li>${ex.id} : ${ex.name}</li>
</c:forEach>
</ul>
</body>
</html>
