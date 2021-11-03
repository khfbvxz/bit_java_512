<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ include file="ssi.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>guestEditSave.jsp</title>
 <style type="text/css">
   *{font-size:16pt;}
   a{font-size:16pt; text-decoration:none; font-weight:bold; color:blue;  font-family: Comic Sans MS ; }
   a:hover{font-size:20pt; text-decoration:underline; color:green;  font-family: Comic Sans MS ; }
 </style>
</head>
<body>

<!-- guestEditSave.jsp단독실행하면 에러발생 -->
<h2>guestEditSave.jsp</h2>
<%
try{
  dcode = Integer.parseInt(request.getParameter("code"));
  dtitle = request.getParameter("title");
  dpay = Integer.parseInt(request.getParameter("pay"));
  demail = request.getParameter("email");
  
  System.out.println("수정 코드 = " + dcode +"<br>"); //콘솔창출력
  System.out.println("수정 제목 = " + dtitle +"<br>");
  System.out.println("수정 급여 = " + dpay +"<br>");
  System.out.println("수정 메일 = " + demail +"<br>");
  
  msg ="update  guest  set  title=?, pay=?, email=? where code = ?";
  PST = CN.prepareStatement(msg);
  	PST.setInt(4, dcode);
	PST.setString(1, dtitle);
	PST.setInt(2, dpay);
	PST.setString(3, demail);
  PST.executeUpdate(); // 진짜 저장 처리 
System.out.println("콘솔출력 guest테이블 수정성공했습니다. 11/03");
  response.sendRedirect("guestList.jsp"); 
}catch(Exception ex){  }
%>
	
<p>
<a href="guestWrite.jsp">[방명록등록]</a>
<a href="guestList.jsp">[전체출력]</a>
</body>
</html>




