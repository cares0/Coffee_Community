<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
	<div class="container-fluid">
		<div class="row justify-content-between">
			<div class="col-8">
				<a href="/p1/">공지사항</a>
		 		<a href="/p1/">자유게시판</a>
				<a href="/p1/">질문게시판</a>
				<a href="/p1/">센서리게시판</a>
			</div>
			<div class="col-2">
				<c:choose>
					<c:when test="${empty member}">
						<a href="/p1/register/join">Join</a>
						<a href="/p1/register/login">Login</a>
					</c:when>
					<c:otherwise>
						<a href="/p1/register/mypage">MyPage</a>
						<a href="/p1/register/logout">Logout</a>
					</c:otherwise>
				</c:choose>
			</div>			
		</div>
	</div>