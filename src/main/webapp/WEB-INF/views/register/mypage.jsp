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
		<div class="row">
			<div class="col">
				<ul class="list-group">
				  <li class="list-group-item d-flex justify-content-between align-items-center">
				    <div class="ms-2 me-auto">
				      <div class="fw-bold">개인정보</div>
				    </div>
				  </li>
				  <li class="list-group-item d-flex justify-content-between align-items-center">
				    <div class="ms-2 me-auto">
				      <div class="fw-bold">아이디</div>
				      ${registerDTO.id}
				    </div>
				  </li>
				  <li class="list-group-item d-flex justify-content-between align-items-start">
				    <div class="ms-2 me-auto">
				      <div class="fw-bold">이름</div>
				      ${registerDTO.name}
				    </div>
				  </li>
				  <li class="list-group-item d-flex justify-content-between align-items-start">
				    <div class="ms-2 me-auto">
				      <div class="fw-bold">별명</div>
				      ${registerDTO.nickname}
				    </div>
				  </li>
				  <li class="list-group-item d-flex justify-content-between align-items-start">
				    <div class="ms-2 me-auto">
				      <div class="fw-bold">성별</div>
				      <c:if test="${registerDTO.gender==1}">남</c:if>
				      <c:if test="${registerDTO.gender==2}">여</c:if>
				    </div>
				  </li>
				  <li class="list-group-item d-flex justify-content-between align-items-start">
				    <div class="ms-2 me-auto">
				      <div class="fw-bold">전화번호</div>
				      ${registerDTO.phone}
				    </div>
				  </li>
				  <li class="list-group-item d-flex justify-content-between align-items-start">
				    <div class="ms-2 me-auto">
				      <div class="fw-bold">이메일</div>
				      ${registerDTO.email}
				    </div>
				  </li>
				  <li class="list-group-item d-flex justify-content-between align-items-start">
				    <div class="ms-2 me-auto">
				      <div class="fw-bold">주소</div>
				      ${registerDTO.adress}
				    </div>
				  </li>
				</ul>
			</div>
			<div class="col">
				<ul class="list-group">
					  <li class="list-group-item d-flex justify-content-between align-items-center">
					    <div class="ms-2 me-auto">
					      <div class="fw-bold">관심있는 원두</div>
					    </div>
					  </li>
					  <li class="list-group-item d-flex justify-content-between align-items-center">
					    <div class="ms-2 me-auto">
					      <div class="fw-bold">컵노트</div>
					      ${favoriteDTO.cupnote1}
					    </div>
					  </li>
					  <li class="list-group-item d-flex justify-content-between align-items-center">
					    <div class="ms-2 me-auto">
					      <div class="fw-bold">로스팅포인트</div>
					      ${favoriteDTO.rPoint}
					    </div>
					  </li>
					  <li class="list-group-item d-flex justify-content-between align-items-center">
					    <div class="ms-2 me-auto">
					      <div class="fw-bold">컵노트</div>
					      ${favoriteDTO.flavor}
					    </div>
					  </li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>