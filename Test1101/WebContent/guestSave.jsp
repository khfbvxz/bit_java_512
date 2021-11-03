<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ include file="./ssi.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title></title>
 <style type="text/css">
   *{font-size:16pt;}
   a{font-size:16pt; text-decoration:none; font-weight:bold; color:blue;  font-family: Comic Sans MS ; }
   a:hover{font-size:20pt; text-decoration:underline; color:green;  font-family: Comic Sans MS ; }
 </style>
</head>
<body>
	 <img src="images/bar.gif"><br>
	 <img src="images/bar.gif"><br>
	 <img src="images/bar.gif"><br>
	 <h2>Save.jsp</h2>
	<%
	  //guestSave.jsp단독실행하면 에러발생합니다 
	  //web에서 데이터를 넘기면 무조건 문자열로 인식 
	  out.println("<h2>guestSave.jsp</h2>");
	try{
	  dcode = Integer.parseInt(request.getParameter("code"));
	  dtitle = request.getParameter("title");
	  dpay = Integer.parseInt(request.getParameter("pay"));
	  demail = request.getParameter("email");
	  //out.println("넘어온 코드 = " + dcode +"<br>");
	  //out.println("넘어온 제목 = " + dtitle +"<br>");
	  //out.println("넘어온 급여 = " + dpay +"<br>");
	 // out.println("넘어온 메일 = " + demail +"<br>");
	  
	  System.out.println("넘어온 코드 = " + dcode +"<br>"); //콘솔창출력
	  System.out.println("넘어온 제목 = " + dtitle +"<br>");
	  System.out.println("넘어온 급여 = " + dpay +"<br>");
	  System.out.println("넘어온 메일 = " + demail +"<br>");
		msg = "insert into guest values(?,?,?,?)";
		PST = CN.prepareStatement(msg);
			PST.setInt(1, dcode);
			PST.setString(2, dtitle);
			PST.setInt(3, dpay);
			PST.setString(4, demail);
		PST.executeUpdate(); // 진짜 저장 처리 
		System.out.println("콘솔출력 guest테이블 저장성공했습니다. 11/03");
		out.println("웹브라우저 출력 guest테이블 저장성공했습니다. 11/03");
		//response.sendRedirect("guestList.jsp"); //문서이동 
	}catch(Exception ex){  }
	%>
	<br>
	코드출력: <%= dcode  %> <br>
	제목출력: <%= dtitle  %>  <br>
	급여출력: <%= dpay  %>  <br>
	메일출력: <%= demail  %>  <br>
	

	<p>
	<a href="gugudan.jsp">[gugudan]</a>
	<a href="guestWrite.jsp">[방명록등록]</a>
	<a href="guestList.jsp">[전체출력]</a>
</body>
</html>




