<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ include file="ssi.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>guestDeleteSave.jsp</title>
 <style type="text/css">
   *{font-size:16pt;}
   a{font-size:16pt; text-decoration:none; font-weight:bold; color:blue;  font-family: Comic Sans MS ; }
   a:hover{font-size:20pt; text-decoration:underline; color:green;  font-family: Comic Sans MS ; }
 </style>
</head>
<body>

<!-- guestDeleteSave.jsp단독실행하면 에러발생 -->
<div align = "center">
	<h2>guestDelete.jsp</h2>
	<img src = " images/tulips.png" width=500 hegiht =300>
	<p>
	<a href="guestWrite.jsp">[방명록등록]</a>
	<a href="guestList.jsp">[전체출력]</a>
</div>
<%
try{
  String data = request.getParameter("idx");
  msg ="delete from guest  where code  =" + data ;
  ST = CN.createStatement();
  int OK = ST.executeUpdate(msg);
  if( OK>0){
	 // System.out.println(data+"코드 데이터 삭제 성공했습니다.");
	  out.println("<div align = 'center'>");
	  out.println("<font color='blue'><b>"+data+" 데이터 삭제 성공했습니다. </b> </font><br>");
	  out.println("</div>");
  }else{
	  
  }
}catch(Exception ex){ System.out.println(" 삭제 실패했습니다. : " + ex.toString()); }
  //response.sendRedirect("guestList.jsp"); 
%>
	
<script type = "text/javascript">
	setTimeout("location.href='guestList.jsp'",3000); 
</script>
</body>
</html>




