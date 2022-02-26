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

	<div class="container">	
		<div class="row justify-content-center">
			<div class="col-4"><p class="text-center">Member Join Page</p></div>	
		</div>
		<br>
		<form action="./join" method="post">
			<div class="row">
				<div class="col mb-3">
				  <label for="id" class="form-label">ID를 입력하세요</label>
				  <input type="text" class="form-control" id="id" name="id" placeholder="id">
				</div>
				<div class="col mb-3">
				  <label for="pw" class="form-label">PW를 입력하세요</label>
				  <input type="password" class="form-control" id="pw" name="pw" placeholder="password">
				</div>
			</div>			
			<div class="row">
				<div class="col mb-3">
				  <label for="name" class="form-label">이름을 입력하세요</label>
				  <input type="text" class="form-control" id="name" name="name" placeholder="name">
				</div>
				<div class="col mb-3">
				  <label for="nickname" class="form-label">별명을 입력하세요</label>
				  <input type="text" class="form-control" id="nickname" name="nickname" placeholder="nickname">
				</div>
				<div class="col mb-3">		
					<label for="gender" class="form-label">성별을 골라주세요</label>	
					<select class="form-select" aria-label="Default select example" id="gender" name="gender">
					  <option selected>성별을 골라주세요</option>
					  <option value="1">남</option>
					  <option value="2">여</option>
					</select>
				</div>			
			</div>
			<div class="row">
				<div class="col mb-3">
				  <label for="email" class="form-label">이메일주소를 입력하세요</label>
				  <input type="email" class="form-control" id="email" name="email" placeholder="email@example.com">
				</div>
			</div>
			<div class="row">
				<div class="col mb-3">
				  <label for="phone" class="form-label">전화번호를 입력하세요</label>
				  <input type="text" class="form-control" id="phone" name="phone" placeholder="-를 제외한 숫자만 입력하세요">
				</div>
			</div>
			<div class="row">
				<div class="col mb-3">
				  <label for="adress" class="form-label">주소를 입력하세요</label>
				  <input type="text" class="form-control" id="adress" name="adress" placeholder="도로명 주소로 기입하세요">
				</div>
			</div>	
			<div class="d-flex justify-content-center">
 				 <button class="btn btn-dark">회원가입하기</button>
			</div>					
		</form>
	</div>
	
</body>
</html>