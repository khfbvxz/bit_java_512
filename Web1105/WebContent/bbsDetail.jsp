<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ include file="ssi.jsp" %><%@ page import="net.bitcamp.guest.GuestDTO" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title> guestDetail.jsp </title>
 <style type="text/css">
   *{font-size:16pt;}
   a{font-size:16pt; text-decoration:none; font-weight:bold; color:blue;  font-family: Comic Sans MS ; }
   a:hover{font-size:20pt; text-decoration:underline; color:green;  font-family: Comic Sans MS ; }
 </style>
</head>
<body>
<p></p>
<%
  //bbsDetail.jsp단독실행금지 
  int data = Integer.parseInt(request.getParameter("idx"));
  
%>	    
	
<table border="1" width="900"  cellspacing="0" cellpadding="20px">
   <tr align="center">
   	 <td colspan="2">
   	 	<font style="font-size:26pt;color:blue; font-weight:bold;"> bbsDetail.jsp 상세페이지 </font> 
   	  </td>
   </tr>
  	<tr>
  		<td width="250"  rowspan="4" align="center" >
  		  <img src="images/bbb.gif" width="350" height="200"> 
  		</td> 
  		<td> 코드:  <%= "11" %>  </td>
  	</tr> 	
  	<tr>
  	   <td> 제목: <%= "11" %>  </td>
  	</tr>
  	<tr>
  	   <td> 급여: <%= "11" %>  </td>
  	</tr>
   	<tr>  
  	   <td> 메일: <%= "11" %>  </td>
  	</tr>
  	
  	<tr align="center">
  	   <td colspan="2"> 
  	   	    <a href="login.jsp">[login]</a>
  			<a href="bbbWrite.jsp">[bbs등록]</a>
			<a href="bbbList.jsp">[bbs전체출력]</a>
			<a href="testList.jsp">[testList]</a>  	   
		</td>
  	</tr>
 </table>

</body>
</html>




















