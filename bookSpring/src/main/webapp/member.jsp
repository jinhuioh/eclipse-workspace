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

</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="memberTop.jsp"></jsp:include>
		</div>
		<div id="center">
		<% if(session.getAttribute("userId") == null) { %><h3 class="active">회원 로그인</h3>
			<form action="memberCheck">
					<table>
					<tr>
						<td class="left">아이디</td>
						<td class="right"><input  class="form-control input-lg"  type="text" name="id"></td>
					</tr>
					<tr>
						<td class="left">패스워드</td>
						<td class="right"><input  class="form-control input-lg"  type="text" name="pw"></td>
					</tr>
					<tr>
						<td colspan="2">
						<button  style="width:200px; height:50px;" class="btn btn-danger" type="submit">로그인하기</button>
						</td>
					</tr>
				</table>
			</form>
						<a href="memberCre.jsp"><button  style="width:200px; height:50px;" class="btn btn-danger">회원가입하기</button></a>
			
			
			<% }else{ %>
			<span style="color:red; font-size: 20px; font-weight: bold;">${userName}님!! 환영합니다. 아이디가 ${userId}로 로그인되었습니다.</span>
			<a href="logout">
			<button style="width:200px; height:50px;" class="btn btn-success" >로그아웃</button>
			</a>
			<% } %>
		</div>
	</div>
</body>
</html>