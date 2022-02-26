<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
	<div class="container-fluid">
		<div class="main_header row align-items-center justify-content-between">
			<div class="col">
				<a class="header_nav" href="/p1/">공지사항</a>
		 		<a class="header_nav" href="/p1/">자유게시판</a>
				<a class="header_nav" href="/p1/">질문게시판</a>
				<a class="header_nav" href="/p1/">센서리게시판</a>
			</div>
		
			<div class="col text-end">
				
				<c:choose>
					<c:when test="${empty member}">
						<a class="header_nav" href="/p1/register/login">Login</a>
						<a class="header_nav" href="/p1/register/join">Join</a>
					</c:when>
					<c:otherwise>
						<a class="header_nav" href="/p1/register/mypage">Mypage</a>
						<a class="header_nav" href="/p1/register/logout">Logout</a>
					</c:otherwise>
				</c:choose>
				<a class="header_nav" href="/p1/">Home</a>
			</div>			
		</div>
	</div>