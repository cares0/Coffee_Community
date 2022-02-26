<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<c:import url="../template/css_import.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<div class="container text-center">
		<h1>Board List Page</h1>
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th class="col-8" scope="col">제목</th>
		      <th scope="col">작성자</th>
		      <th scope="col">작성일자</th>
		      <th scope="col">조회수</th>
		    </tr>
		  </thead>
		  <tbody>	    
		    <c:forEach items="${list}" var="dto">
			    <tr>
			      <td><a href="./detail?num=${dto.num}">${dto.title}</a></td>
			      <td>${dto.writer}</td>
			      <td>${dto.regDate}</td>
			      <td>${dto.hit}</td>
			    </tr>
		    </c:forEach>
		  </tbody>
		</table>
	</div>
</body>
</html>