<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ include file="ssi.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>bbsList.jsp</title>
 <style type="text/css">
   *{font-size:16pt;}
   a{font-size:16pt; text-decoration:none;  font-family: Comic Sans MS ; }
   a:hover{font-size:20pt; text-decoration:underline; color:green;  font-family: Comic Sans MS ; }
 </style>
</head>

<body>
<h2>bbsList.jsp전체출력</h2>	
<%
 
%>

<table border="1" width="900" cellspacing="0" cellpadding="5px">
<tr>
   <td colspan=5 align="right">
        <a href="#">[로그인]</a>
        <a href="bbsWrite.jsp">[bbs글쓰기]</a>
   		총레코드갯수: <%= Gtotal %> &nbsp; &nbsp;
   </td>
</tr>
<tr bgcolor="yellow">
	<td>사 번</td>  <td>이 름</td>  <td>제 목</td>  <td>날 짜</td>  <td>조회수</td>    
</tr>	
<%
 
%>    	
  <tr>
    <td>  <%= "1234" %> </td>
    <td>  <%= "영림" %>  </td>
    <td>  <a href="bbsDetail.jsp"> <%= "rain" %> </a> </td>
    <td>  <%= "11-10" %> </td>
    <td>  <%= "3" %> </td>
  </tr>  
<%  
  
%>	
</table>
		
<p>
<a href="bbbWrite.jsp">[bbs등록]</a>
<a href="bbbList.jsp">[bbs전체출력]</a>
<a href="testList.jsp">[testList]</a>
</body>
</html>








