<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Document</title>
</head>
<body>
	<h1>회원정보수정</h1>
	<hr>
	<form action="/mybatis5" method="POST">
		아이디 :
		<input type="text" name="id" value="${requestScope.memberInfo.userId}" readonly><br>
		비밀번호 : 
		<input type="password" name="pw" value="${requestScope.memberInfo.userPw}"><br>
		닉네임 : 
		<input type="text" name="nick" value="${requestScope.memberInfo.userNick}"><br>
		전화번호 : 
		<input type="text" name="tel" value="${requestScope.memberInfo.userTel}"><br>
		가입일 : 
		<input type="text" name="regDate" value="${requestScope.memberInfo.regDate}" readonly>
		<br>
		<button type="submit">수정</button>
	</form>
</body>
</html>