<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
	<nav class="navbar navbar-expand-md navbar-dark fixed-top bg-secondary">
      <div class="container-fluid d-flex justify-content-between">        
        <div class="collapse navbar-collapse d-flex justify-content-between" id="navbarCollapse">
          <ul class="navbar-nav">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="/p1/board/list?category=1">공지사항</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="/p1/board/list?category=2">자유게시판</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="/p1/board/list?category=3">질문게시판</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="/p1/board/list?category=4">센서리게시판</a>
            </li>
          </ul>
          <ul class="navbar-nav d-flex justify-content-end">
			<c:choose>
				<c:when test="${empty member}">
		            <li class="nav-item">
		              <a class="nav-link active" aria-current="page" href="/p1/register/login">Login</a>
		            </li>
		            <li class="nav-item">
		              <a class="nav-link active" aria-current="page" href="/p1/register/join">Join</a>
		            </li>
            	</c:when>
            	<c:otherwise>
            		<li class="nav-item">
		              <a class="nav-link active" aria-current="page" href="/p1/register/mypage">Mypage</a>
		            </li>
		            <li class="nav-item">
		              <a class="nav-link active" aria-current="page" href="/p1/register/logout">Logout</a>
		            </li>
            	</c:otherwise>
            </c:choose>
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="/p1/">Home</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <br><br><br>
