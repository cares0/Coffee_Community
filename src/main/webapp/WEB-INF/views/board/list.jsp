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
	<div class="container text-center">
		
		<c:choose>
			<c:when test="${pager.category==1}">
				<h1>Notice List Page</h1>
			</c:when>
			<c:when test="${pager.category==2}">
				<h1>Free Board List Page</h1>
			</c:when>
			<c:when test="${pager.category==3}">
				<h1>QnA List Page</h1>
			</c:when>
			<c:otherwise>
				<h1>Sensory List Page</h1>
			</c:otherwise>
		</c:choose>
		
		<br>
		<form action="./list" method="get">
		<div class="input-group">
		  <input type="hidden" name="category" value="${pager.category}">
		  <select class="form-select" name="kind">
		    <option selected value="col1">무슨 기준으로 검색하시겠습니까?</option>
		    <option value="col1">제목</option>
		    <option value="col2">내용</option>
		    <option value="col3">작성자</option>
		  </select>
		  <input type="text" class="form-control" name="search" value="${pager.search}" placeholder="검색어를 입력하세요" >
		  <button class="btn btn-outline-secondary" type="submit">Search</button>
		</div>
		</form>
		<br>
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
		<div class="d-flex justify-content-between align-items-start">
			<nav aria-label="Page navigation example">
			  <ul class="pagination">
				
				<c:if test="${pager.pre}">
			    <li class="page-item">
			      <a class="page-link" href="./list?page=${pager.startNum-1}&search=${pager.search}&kind=${pager.kind}&category=${pager.category}" aria-label="Previous">
			        <span aria-hidden="true">&laquo;</span>
			      </a>
			    </li>
			    </c:if>
			    
				<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
			    	<li class="page-item"><a class="page-link" href="./list?page=${i}&search=${pager.search}&kind=${pager.kind}&category=${pager.category}">${i}</a></li>
				</c:forEach>
				
				<c:if test="${pager.next}">
			    <li class="page-item">
			      <a class="page-link" href="./list?page=${pager.lastNum+1}&search=${pager.search}&kind=${pager.kind}&category=${pager.category}" aria-label="Next">
			        <span aria-hidden="true">&raquo;</span>
			      </a>
			    </li>
				</c:if>
				
			  </ul>
			</nav>
			<br>
			<c:if test="${not empty member}">
				<a class="btn btn-secondary" href="./add?category=${pager.category}">글 등록하기</a>
			</c:if>
		</div>
	</div>
</body>
</html>