<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>전체 정보 조회</title>
</head>
<body>
	<c:forEach items="${requestScope.list}" var="mb">
	아이디 : ${mb.userId}<br>
	비밀번호 : ${mb.userPw}<br>
	닉네임 : ${mb.userNick}<br>
	전화번호 : ${mb.userTel}<br>
	가입일 : ${mb.regDate}<br>
		<hr>
	</c:forEach>
</body>
</html>