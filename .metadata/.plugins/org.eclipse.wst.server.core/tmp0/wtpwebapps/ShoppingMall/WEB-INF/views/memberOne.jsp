<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:100,200,300,400,500,600,700,800,900"
	rel="stylesheet">

<!-- Bootstrap core CSS -->
<script type="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">


<!-- Additional CSS Files -->
<link rel="stylesheet" href="resources/assets/css/fontawesome.css">
<link rel="stylesheet" href="resources/assets/css/templatemo-eduwell-style.css">
<link rel="stylesheet" href="resources/assets/css/owl.css">
<link rel="stylesheet" href="resources/assets/css/lightbox.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<!-- member.css파일 -->	
<link rel = "stylesheet" type = "text/css" href = "resources/css/member.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- <body bgcolor="skyblue"> -->
<body>
<h3>회원상세정보입니다</h3>
<table border=2>
   <tr>
      <td>아이디</td>
      <td>${one.user_id}</td> <!-- one.getId -->
   </tr>
   <tr>
      <td>이름</td>
      <td>${one.user_name}</td>
   </tr>
   <tr>
      <td>패스워드</td>
      <td>${one.user_pw}</td>
   </tr>
   <tr>
      <td>전화번호</td>
      <td>${one.user_tel}</td>
   </tr>
   <tr>
      <td>나이</td>
      <td>${one.user_age}</td>
   </tr>
   <tr>
      <td>주소</td>
      <td>${one.user_addr}</td>
   </tr>
   <tr>
      <td>레벨</td>
      <td>${one.level}</td>
   </tr>
</table>

<h3>회원삭제</h3>
<form action="memberAdDelete">
아이디 : <input type="text" name="user_id" value="${one.user_id}" readonly="readonly"><br>
<button class="btn btn-light">회원삭제</button>
</form>
<h3>회원 수정</h3>
<form action="memberAdUpdate">
		<table>
			<tr>
				<td class="left">아이디</td>
				<td class="right"><input class="form-control input-lg"
					type="text" name="user_id" id="id" value="${one.user_id}">
				</td>
			</tr>
			<tr>
				<td class="left">이름</td>
				<td class="right"><input class="form-control input-lg"
					type="text" name="user_name" id="name" value="${one.user_name}">
				</td>
			</tr>
			<tr>
				<td class="left">패스워드</td>
				<td class="right"><input class="form-control input-lg"
					type="text" name="user_pw" id="pw" value="${one.user_pw}">
				</td>
			</tr>
		</table>
<button type="submit" class="btn btn-light">회원수정</button>
</form>
</body>
</html> 