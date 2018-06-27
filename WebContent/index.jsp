<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>마이바티스 실습하기</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	1. 회원 ID를 입력하여 해당 회원이 존재하는지 확인(ID 검증 용도)
	<br> - 있으면 사용불가 출력, 없으면 사용 가능 출력
	<br>
	<input type="text" id="checkId" placeholder="아이디 입력">
	<button type="button" id="checkIdBtn">확인</button>
	<hr>
	2. 회원 ID, PW를 이용하여 회원 정보 가져오기
	<br> - ID와 PW가 일치하는 회원에 대하여 정보 가져와서 VIEW Page를 이용하여 출력하기 - 모든 정보 출력(EL 사용)
	<form action="/mybatis2" method="POST" accept-charset="utf-8">
		<input type="text" name="id" placeholder="아이디 입력"><br>
		<input type="password" name="pw" placeholder="비밀번호 입력">
		<button type="submmit">확인</button>
	</form>
	<hr>
	3. 회원 가입 만들어 보기
	<br> - ID, PW, 닉네임, 전화번호로 INSERT
	<form action="/mybatis3" method="POST"> 
		<input type="text" name="id" value="" placeholder="아이디">
		<input type="password" name="pw" value="" placeholder="비밀번호">
		<input type="text" name="nick" value="" placeholder="닉네임">
		<input type="text" name="tel" value="" placeholder="전화번호">
		<button type="submmit">가입</button>
	</form>
	<hr>
	4. 회원 정보 수정 하기
	<br> - ID, PW를 넘겨받아 회원 정보를 가져온 후
	<br> - 정보 수정 후 변경하기 버튼을 클릭 시 변경하기(단, PW, 닉네임, 전화번호만 변경 가능)
	<form action="/mybatis4" method="POST" accept-charset="utf-8">
		<input type="text" name="id" placeholder="아이디 입력"><br>
		<input type="password" name="pw" placeholder="비밀번호 입력">
		<button type="submmit">확인</button>
	</form>
	<hr>
	5. ID, PW를 입력받아 회원 탈퇴 처리하기
	<form action="/mybatis6" method="POST" accept-charset="utf-8">
		<input type="text" name="id" placeholder="아이디 입력"><br>
		<input type="password" name="pw" placeholder="비밀번호 입력">
		<button type="submmit">확인</button>
	</form>
	<hr>
	6. 전체 회원 정보 출력하기
	<form action="/mybatis7" method="POST">
		<button type="submmit">전체정보</button>
	</form>
	<hr>
</body>

<script type="text/javascript">
	$(document).ready(function() {
		$('#checkIdBtn').click(function(){
			var id = $('#checkId').val();
			$.ajax({
				url : '/mybatis1',
				type : 'POST',
				data : {id : id},
				success : function(data){
					if(data == "1"){
						alert('사용 중인 아이디');
					} else {
						alert('사용 안하고 있는 아이디');
					}
				}
			})
		});
	});
</script>

</html>