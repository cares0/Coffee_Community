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
					      <c:if test="${favoriteDTO.rPoint==1}">
					      	Light Roasting
					      </c:if>
					      <c:if test="${favoriteDTO.rPoint==2}">
					      	Medium Roasting
					      </c:if>
					      <c:if test="${favoriteDTO.rPoint==3}">
					      	Dark Roasting
					      </c:if>
					    </div>
					  </li>
					  <li class="list-group-item d-flex justify-content-between align-items-center">
					    <div class="ms-2 me-auto">
					      <div class="fw-bold">향미</div>
					      <c:if test="${favoriteDTO.flavor==1}">
					      	산미 위주의 상큼한 커피
					      </c:if>
					      <c:if test="${favoriteDTO.flavor==2}">
					      	고소하면서 부드러운 커피
					      </c:if>
					      <c:if test="${favoriteDTO.flavor==3}">
					      	묵직하면서 단맛이 잘 느껴지는 커피
					      </c:if>
					    </div>
					  </li>
				</ul>
			</div>
		</div>
		<br>
		<a class="btn btn-secondary" href="./update?id=${registerDTO.id}">정보수정하기</a>
		<br>
	</div>
</body>
</html>