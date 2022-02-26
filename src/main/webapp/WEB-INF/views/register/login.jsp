<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<c:import url="../template/css_import.jsp"></c:import>

	
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<br>
	<div class="container">	
		<div class="row justify-content-center">
			<div class="col"><h1 class="text-center">Member Login Page</h1></div>
		</div>
	
		<form action="./login" method="post">
			<div class="row">
				  <div class="mb-3">
				    <label for="id" class="form-label">아이디를 입력하세요</label>
				    <input type="text" class="form-control" id="id" name="id" placeholder="id" value="${cookie.remember.value}">
				  </div>
				  <div class="mb-3">
				    <label for="pw" class="form-label">비밀번호를 입력하세요</label>
				    <input type="password" class="form-control" id="pw" name="pw" placeholder="password">
				  </div>
			</div>
			<div class="row">
				  <div class="col-lg-6 col-sm-12 text-lg-start form-check">
				    <input type="checkbox" class="form-check-input" id="remember" name="remember" value="1">
				    <label class="form-check-label" for="remember">Remember Me</label>
				  </div>
				  <div class="col-lg-6 col-sm-12 text-lg-end text-center">
				  <button type="submit" class="btn btn-dark">로그인</button>
				  </div>
			</div>
		</form>
	</div>



</body>
</html>