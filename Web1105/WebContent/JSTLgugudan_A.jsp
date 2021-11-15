<%@ page language="java" contentType="text/html; charset=utf-8"   pageEncoding="utf-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
 <title> JSTLgugudan_A.jsp </title>
 
 <style type="text/css">
   *{font-size:16pt;}
   a{font-size:16pt; text-decoration:none; font-weight:bold; color:blue;  font-family: Comic Sans MS ; }
   a:hover{font-size:20pt; text-decoration:underline; color:green;  font-family: Comic Sans MS ; }
 </style>
</head>
<body>
   <h1>JSTLgugudan_A.jsp</h1>
   
 <%
 try{
	 int dan = 12 ;
	 for(int i=1; i<10; i++){
	     out.println(dan+"*"+i+"="+(dan*i) +"<br>");
	 }
	 
	 out.println("<br>");
	 int su= 78;
	 //if~elseif~else제어문으로 음수,제로,양수
	 if(su<0){out.println(su+" 음수입니다"); }
	 else if(su==0){out.println(su+" 제로입니다");}
	 else if(su>0){out.println(su+" 양수입니다");}
	 else{out.println(su+" 정수가 아닙니다");}
	 out.println("<p>");
	 
	 String[] data={ "파이썬","스프링","서블릿", "루돌프","산타" };
	 //for반복문대신 향샹된for반복문으로 출력 
	 for(String tmp: data){
		 out.println(tmp+" ");
	 }
	 out.println("<br>");
 }catch(Exception ex){ out.println("에러이유 " + ex.toString()); }
%>
<p>
   
   
   
   	<p>
	<a href="JSTLgugudan_B.jsp">[JSTLgugudan_B]</a>
	<a href="bbsList.jsp">[bbsList]</a>
</body>
</html>