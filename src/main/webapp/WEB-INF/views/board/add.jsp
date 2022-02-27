<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<c:import url="../template/css_import.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>

	<div class="container">
		<div class="text-center">
			<h1>Board Add Page</h1>
		</div>
		<br>
		<form action="./add" method="post">
			<div class="form-floating mb-3">
			  <input type="text" class="form-control" id="title" name="title" placeholder="title">
			  <label for="title">title</label>
			</div>
			<br>
			<div class="form-floating">
			  <textarea class="form-control" placeholder="contents" id="contents" name="contents" style="height: 300px"></textarea>
			  <label for="contents">Contents</label>
			</div>
			<br>
			<div class="d-flex justify-content-end">
			<button class="btn btn-secondary text-center" type="submit">등록하기</button>
			</div>
		</form>
		
	
	
	</div>

</body>
</html>
