<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<style>
button {
	position: right;
}

table {
	width: 800px;
	border-top: 1px solid #444444;
	border-collapse: collapse;
}

th, td {
	border: 1px solid #444444;
	padding: 10px;
}

.left {
	background: #dbdad5;
}
</style>

<meta charset="UTF-8">
<title>${one.service_title}</title>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="../../top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="../../top2.jsp"></jsp:include>
		</div>
		<div class="row" style="width: 1200px; margin: auto;">
			<div id="center">

				<h3>글 상세 페이지</h3>
				<hr>
				<table>
					<tr>
						<td class="left">제목</td>
						<td class="right">${one.service_title}</td>
						<td class="left">글쓴이</td>
						<td class="right">${one.user_id}</td>
					</tr>
					<tr>
						<td class="left">등록일</td>
						<td class="right" colspan="3">${one.service_rgstday}</td>
					</tr>
					<tr>
						<td class="left">내용</td>
						<td class="right" colspan="3" height=300px>${one.service_question}</td>
					</tr>



					<tr>
						<td colspan="4"><a href="serviceList.jsp"><button>목록</button></a>

							<!--  자기 글일때만  삭제, 수정 버튼 활성화. --> <%
 	if (session.getAttribute("user_id") != null) {
 %>
							<c:if test="${user_id eq one.user_id}">
								<a href="serviceDelete?service_idx=${one.service_idx}"><button>삭제</button></a>
								<a href="serviceUpdate2?service_idx=${one.service_idx}"><button>수정</button></a>
								<a
									href="serviceAnswer.jsp?service_idx=${one.service_idx}&service_id_origin=${one.service_id_origin}&service_idx_re=${one.service_idx_re}&service_reply_group=${one.service_reply_group}"><button
										id="Answer">답변하기</button></a></td>
						</c:if>
						<!-- 유저아이디가 admin..즉 관리자인경우 답변하기 버튼 활성화 -->
						<%
							if ((int) (session.getAttribute("user_level")) == 2) {
						%>
						<a href="serviceDelete?service_idx=${one.service_idx}"><button>삭제</button></a>
						<a href="serviceUpdate2?service_idx=${one.service_idx}"><button>수정</button></a>
						<a
							href="serviceAnswer.jsp?service_idx=${one.service_idx}&service_id_origin=${one.service_id_origin}&service_idx_re=${one.service_idx_re}&service_reply_group=${one.service_reply_group}"><button
								id="Answer">답변하기</button></a>
						</td>
						<%
							}
						%>
						<%
							}
						%>
					</tr>
				</table>
				<hr>
			</div>
		</div>
	</div>
</body>
</html>