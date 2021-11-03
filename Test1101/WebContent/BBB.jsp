<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>BBB</title>
 <style type="text/css">
   *{font-size:16pt;}
   a{font-size:16pt; text-decoration:none; font-weight:bold; color:blue;  font-family: Comic Sans MS ; }
   a:hover{font-size:20pt; text-decoration:underline; color:green;  font-family: Comic Sans MS ; }
 </style>
</head>
<body>
	<h2>BBB.jsp = 데이터 받는 입장</h2>
	<img src="images/aaa.gif"><img src="images/aaa.gif">
	<img src="images/aaa.gif"><img src="images/aaa.gif"><img src="images/aaa.gif"><br>
	
	<%
		//BBB.jsp 문서 = guestDetail.jsp 문서
		String a =request.getParameter("idx");
		String b =request.getParameter("title");;
		out.println("넘어온 코드 = " + a+"<br>");
		out.println("넘어온 title = " + b);
	%>
	넘어온 코드 <%=a %><br>
	넘어온 제못 <%=b %>
	
	<p></p>
	<a href="AAA.jsp">[AAA]</a>
	<a href="guestList.jsp">[전체출력]</a>
	<a href="guestWrite.jsp">[방명록등록]</a>
</body>
</html>