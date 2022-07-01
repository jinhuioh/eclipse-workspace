<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/project.css">
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('#addMember').click(function(){
		console.log('addMember click!');
		if($('#id').val() == ''){				
			alert('아이디를 입력해주세요.');
		} else if($('#pw').val() == ''){		
			alert('비밀번호를 입력해주세요.');
		} else if($('#pw2').val() == ''){		
			alert('비밀번호 중복확인을 해주세요.');
		} else if($('#pw').val() != $('#pw2').val()){					
			alert('password가 일치하지 않습니다.');
		} else if($('#name').val() == ''){			
			alert('이름을 입력하세요.');
		}  else if($('#tel').val() == ''){			
			alert('phone 번호를 입력하세요.');
		} else if($('#email').val() == ''){		
			alert('이메일을 입력 하세요.');
		} else{
			$('#form').submit();
		}
	})	
	

	
	$('#idCheck').click(function() {
		alert('test')
		$.ajax({
			url:"memberIdCheck",
			data:{'id':$('#id').val()},
			success: function(data) { //views아래에 있는 memberIdCheck.jsp의 실행결과가 data에 담김.
				alert(data)
				if(data == 1) {
					alert("중복된 아이디 입니다.")
				} else {
					alert("사용가능한 아이디 입니다.")
				}
			}
		})
	})

});
</script>
</head>
<body>
<h3 class="active">회원가입</h3>
			<form action="memberCreate" id="form">
				<table>
					<tr>
						<td class="left">아이디</td>
						<td class="right"><input  class="form-control input-lg"  type="text" name="id" id="id"></td>
					</tr>
					<tr>
						<td class="left">패스워드</td>
						<td class="right"><input  class="form-control input-lg"  type="text" name="pw" id="pw"></td>
					</tr>
					<tr>
						<td class="left">패스워드확인</td>
						<td class="right"><input  class="form-control input-lg"  type="text" name="pw2" id="pw2"></td>
					</tr>
					<tr>
						<td class="left">이름</td>
						<td class="right"><input  class="form-control input-lg"  type="text" name="name" id="name"></td>
					</tr>
					<tr>
						<td class="left">전화번호</td>
						<td class="right"><input  class="form-control input-lg"  type="text" name="tel" id="tel"></td>
					</tr>
					<tr>
						<td class="left">이메일</td>
						<td class="right"><input  class="form-control input-lg"  type="text" name="email" id="email"></td>
					</tr>
					<tr>
						<td colspan="2">
						<button style="width:200px; height:50px;" class="btn btn-success" type="button" id="addMember">회원가입하기</button>
						</td>
					</tr>
				</table>
			</form>
				<button style="width:200px; height:50px;" class="btn btn-success" type="button" id="idCheck">아이디중복확인</button>
			<hr>
			<div id="result"></div>
			
			
</body>
</html>