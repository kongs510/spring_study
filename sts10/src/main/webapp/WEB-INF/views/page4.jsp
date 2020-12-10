<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/sockjs-client@1/dist/sockjs.min.js"></script>
</head>
<body>
	<h2>PUBLIC page</h2>
	<nav>
		<a href="/sts10/">page1</a>
		<a href="/sts10/emp/page2">page2</a>
		<a href="/sts10/dept/page3">page3</a>
		<a href="/sts10/page4">page4</a>
		<c:if test="${sessionScope.login}">
			${sessionScope.who }님 로그인 중<a href="./logout">[logout]</a>
		</c:if>
		<c:if test="${sessionScope.login eq null }">
		<a href="./login">login</a>
		</c:if>
	</nav>
	
</body>
</html>