<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
<h1>main page</h1>
<table border="1">
<tr><th>아이디</th></tr>
<c:forEach var="userID" items="${list}">
<tr><td>${userID}</td></tr>
</c:forEach>
</table>
</body>
</html>