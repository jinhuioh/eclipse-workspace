<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Dialog - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $("#b1").click(function() {
    	$('#dialog11').css('visibility','visible')
    	$('#dialog11').dialog(); //.dialog();는 위에 src주소에 들어있는 함수라서 바꾸면 안된다.
    })
  
    $("#b2").click(function() {
   		$('#dialog22').dialog();
    })
  });
  </script>
</head>
<body>
 
 <button id="b1">오늘 점심메뉴는?</button>
 <button id="b2">오늘 일정은?</button>
<div id="dialog11" title="오늘 점심메뉴는?" style="visibility: hidden;">
 <p>서브웨이가기.</p>
</div>
<div id="dialog22" title="오늘일정은?">
  <p>수업하구 집@</p>
</div>
 
 
</body>
</html>