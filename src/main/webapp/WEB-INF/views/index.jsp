<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<c:import url="./template/css_import.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
	<c:import url="./template/header.jsp"></c:import>
	<br>
	<h1 class="text-center">index Page</h1>
	<c:if test="${not empty member}"><h1 class="text-center">${member.nickname}님 환영합니다.</h1></c:if>
			
</body>
</html>