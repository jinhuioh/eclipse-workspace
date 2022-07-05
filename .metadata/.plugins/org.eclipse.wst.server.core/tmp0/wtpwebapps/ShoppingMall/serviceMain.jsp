<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:100,200,300,400,500,600,700,800,900"
	rel="stylesheet">

<!-- Bootstrap core CSS -->
<link href="resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">


<!-- Additional CSS Files -->
<link rel="stylesheet" href="resources/assets/css/fontawesome.css">
<link rel="stylesheet"
	href="resources/assets/css/templatemo-eduwell-style.css">
<link rel="stylesheet" href="resources/assets/css/owl.css">
<link rel="stylesheet" href="resources/assets/css/lightbox.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!--

TemplateMo 573 EduWell

https://templatemo.com/tm-573-eduwell

-->

<title>고객센터</title>
</head>

<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript">
	function deleteValue() {
		var url = "serviceFaqDelete" //Controller로 보내고자 하는 url
		var valueArr = new Array();
		var list = $("input[name='RowCheck']");
		for (var i = 0; i < list.length; i++) {
			if (list[i].checked) {
				valueArr.push(list[i].value);
			}
		}
		if (valueArr.length == 0) {
			alert("선택된 글이 없습니다.")
		} else {
			var chk = confirm("정말 삭제하시겠습니까?");
			$.ajax({
				url : url,
				type : 'POST',
				traditional : true,
				data : {
					service_faq_idx : valueArr
				},
				success : function(jdata) {
					console.log(valueArr)
					if (jdata = 1) {
						alert("삭제 성공");
						location.replace("serviceMain.jsp")
					} else {
						alert("삭제실패");
					}
				}
			});
		}
	}

	function modifyValue() {
		var url = "serviceFaqUpdate2" //Controller로 보내고자 하는 url
		var valueArr = new Array();
		var list = $("input[name='RowCheck']");
		for (var i = 0; i < list.length; i++) {
			if (list[i].checked) {
				valueArr.push(list[i].value);
			}
		}

		location.href = "serviceFaqUpdate2?service_faq_idx=" + valueArr;
	}

	var a = 0;
	function showCheck() {
		console.log("체크박스클릭됨")
		a = a + 1
		console.log(a)
		$(function() {
			if (a % 2 == 1) {
				$("input[name='chk']").val('체크박스 숨기기');
				$("input[name='RowCheck']").css("display", "inline");
				$("input[name='modi']").css("display", "inline");
				$("input[name='del']").css("display", "inline");

			} else {
				$("input[name='chk']").val('체크박스 활성화');
				$("input[name='RowCheck']").css("display", "none");
				$("input[name='modi']").css("display", "none");
				$("input[name='del']").css("display", "none");
			}
		});

	}
	$(function() {
		$.ajax({
			url : "faqList",
			success : function(list1) {
				$("#result").html(list1);
			},
			error : function() {
				alert('실패');
			}
		});
		$(".tot").mouseenter(function() {
			$.ajax({
				url : "faqList",
				success : function(list1) {
					$("#result").html(list1);
				},
				error : function() {
					alert('실패');
				}
			});
		});
		var myClass;
		$(".cate").mouseenter(function() {
			myClass = $(this).attr("id");
			$(this).addClass("active");
			$.ajax({
				url : "faqListView?service_faq_category=" + myClass,
				type : 'POST',
				traditional : true,

				success : function(list1) {
					$("#result").html(list1);
				},
				error : function() {
					alert('실패');
				}
			});

		});

	});
</script>
<style>

.nav-tabs>li>a:hover {
    background: #dc8cdb;
    transition: background-color .5s;
  }
</style>
<body>
	<div class="row" style="width: 1200px; margin: auto;">
		<div id="total">
			<div id="top">
				<jsp:include page="top.jsp"></jsp:include>
			</div>
			<div id="top2">
				<jsp:include page="top2.jsp"></jsp:include>
			</div>
			<div class="row" style="width: 1200px; margin: auto;">
				<div id="center">
					<h3>고객센터</h3>
					<div class="well" style="width: 30%; height: 150px; float: left;">
						<h1>FAQ</h1>
						<p>자주 묻는 질문사항</p>
					</div>
					<div class="well" style="width: 70%; height: 150px; float: left;">
						<div id="faqBtn">
							<h4>
								<a href="serviceMain.jsp">FAQ</a>
							</h4>
						</div>
						<div id="qnaBtn">
							<h4>
								<a href="serviceList.jsp">QnA</a>
							</h4>
						</div>
						<div id="NoticeBtn">
							<h4>
								<a href="serviceNoticeList">Notice</a>
							</h4>
						</div>
						<%
							if (session.getAttribute("user_id") != null) {
						%>
						<div id="myBtn">
							<h4>
								<a href="serviceMyQuestion.jsp">내 문의사항</a>
							</h4>
						</div>
						<%
							}
						%>
					</div>

					<hr>

					<ul class="nav nav-tabs" name="service_faq_category" style="float:left">
						<li><a href="#" class="tot" id="전체" value="*">전체</a></li>
						<li><a href="" class="cate" id="교환/환불" value="교환/환불">교환/환불</a></li>
						<li><a href="" class="cate" id="주문결제" value="주문결제">주문결제</a></li>
						<li><a href="" class="cate" id="배송안내" value="배송안내">배송안내</a></li>
						<li><a href="" class="cate" id="상품/회원관련" value="상품/회원관련">상품/회원관련</a></li>
					</ul>
					<div id="result"></div>

					<%
						if (session.getAttribute("user_id") != null) {
					%>
					<%
						if ((int) (session.getAttribute("user_level")) == 2) {
					%>
					<div>
						<a href="serviceFaqCreate.jsp"><button>추가</button></a> <input
							type="button" name="chk" value="체크박스 활성화" onclick="showCheck()">
						<input type="button" name="del" style="display: none" value="삭제"
							onclick="deleteValue()"> <input type="button" name="modi"
							style="display: none" value="수정" onclick="modifyValue()">
					</div>

					<%
						}
					%>
					<%
						}
					%>

				</div>
			</div>
		</div></div>
</body>
</html>