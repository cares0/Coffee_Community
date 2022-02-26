<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<c:import url="../template/css_import.jsp"></c:import>
	<style type="text/css">
		.contents_box {
			height: 15rem;
		}
	</style>
<title>Insert title here</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	
	<div class="container">
		<h1 class="text-center">Board Detail Page</h1>
		<ul class="list-group">
		  <li class="list-group-item d-flex justify-content-between align-items-center">
		    <div class="ms-2 me-auto">
		      <div class="fw-bold">제목</div>
		      ${dto.title}
		    </div>
		  </li>
		  <li class="list-group-item d-flex justify-content-between align-items-start">
		    <div class="contents_box ms-2 me-auto">
		      <div class="fw-bold">내용</div>
		      ${dto.contents}
		      
		    </div>
		  </li>
		</ul>
		<ul class="list-group list-group-horizontal">
		  <li class="list-group-item d-flex flex-fill justify-content-between align-items-start">
		    <div class="ms-2 me-auto">
		      <div class="fw-bold">작성자</div>
		      ${dto.writer}
		    </div>
		  </li>
		  <li class="list-group-item d-flex flex-fill justify-content-between align-items-start">
		    <div class="ms-2 me-auto">
		      <div class="fw-bold">조회수</div>
		      ${dto.hit}
		    </div>
		  </li>
		  <li class="list-group-item d-flex flex-fill justify-content-between align-items-start">
		    <div class="ms-2 me-auto">
		      <div class="fw-bold">작성일자</div>
		      ${dto.regDate}
		    </div>
		  </li>
		</ul>
	</div>
	
</body>
</html>