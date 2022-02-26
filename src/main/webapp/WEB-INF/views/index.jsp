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
	<h1>index Page</h1>
	
	<c:choose>
		<c:when test="${empty member}">
			<a href="./register/join">Join</a>
			<a href="./register/login">Login</a>
		</c:when>
		<c:otherwise>
			<a href="./register/mypage">MyPage</a>
			<a href="./register/logout">Logout</a>
			<h1>${member.nickname}님 환영합니다.</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>