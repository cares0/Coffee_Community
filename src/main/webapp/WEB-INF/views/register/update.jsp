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
	<br>
	<div class="container">
		<h1 class="text-center">My Page</h1>
		<form action="./update" method="post">
			<input type="hidden" name="id" value="${registerDTO.id}"> 
			<ul class="list-group">
			  <li class="list-group-item d-flex justify-content-between align-items-center">
			    <div class="ms-2 me-auto">
			      <div class="fw-bold">개인정보</div>
			    </div>
			  </li> 
			  <li class="list-group-item d-flex justify-content-between align-items-start">
			    <div class="ms-2 me-auto">
			      <div class="fw-bold">이름</div>
			      <input type="text" name="name" value ="${registerDTO.name}">
			    </div>
			  </li>
			  <li class="list-group-item d-flex justify-content-between align-items-start">
			    <div class="ms-2 me-auto">
			      <div class="fw-bold">전화번호</div>
			      <input type="text" name="phone" value ="${registerDTO.phone}">
			    </div>
			  </li>
			  <li class="list-group-item d-flex justify-content-between align-items-start">
			    <div class="ms-2 me-auto">
			      <div class="fw-bold">이메일</div>
			      <input type="text" name="email" value ="${registerDTO.email}">
			    </div>
			  </li>
			  <li class="list-group-item d-flex justify-content-between align-items-start">
			    <div class="ms-2 me-auto">
			      <div class="fw-bold">주소</div>
			      <input type="text" name="adress" value ="${registerDTO.adress}">
			    </div>
			  </li>
			</ul>
			<button class="btn btn-secondary" type="submit">수정하기</button>
		</form>
	</div>
</body>
</html>