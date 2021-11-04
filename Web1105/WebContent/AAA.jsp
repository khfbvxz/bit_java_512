<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AAA</title>
 <style type="text/css">
   *{font-size:16pt;}
   a{font-size:16pt; text-decoration:none; font-weight:bold; color:blue;  font-family: Comic Sans MS ; }
   a:hover{font-size:20pt; text-decoration:underline; color:green;  font-family: Comic Sans MS ; }
 </style>
</head>
<body>
	<h2>AAA.jsp</h2>
	<img src="images/a1.png"><p>
	Web1105플젝a태그으로 값 전달 테스트 <br>
	Web1105플젝a태그으로 값 전달 테스트 <br>
	<%
		int Gcode = 5567;
		String Gtitle = "bitcamp";
	%>
	<a href="BBB.jsp?idx=<%=Gcode%>&title=<%=Gtitle%>">[BBB]</a>
	<a href="guestList.jsp">[전체출력]</a>
</body>
</html>