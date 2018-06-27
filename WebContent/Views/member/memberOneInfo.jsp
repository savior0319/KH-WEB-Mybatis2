<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Document</title>
</head>
<body>
	<h1>회원정보</h1>
	<hr>
	아이디 : ${requestScope.memberInfo.userId}<br>
	비밀번호 : ${requestScope.memberInfo.userPw}<br>
	닉네임 : ${requestScope.memberInfo.userNick}<br>
	전화번호 : ${requestScope.memberInfo.userTel}<br> 
	가입일 : ${requestScope.memberInfo.regDate}<br>
</body>
</html>