<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ include file="ssi.jsp" %>

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
<p></p>
<%
try{
	//guestDetai.jsp단독실행금지 
	String data = request.getParameter("idx");
	msg = "select * from guest where code = " + data;
	ST = CN.createStatement(); 
    RS = ST.executeQuery(msg);
    if(RS.next()==true){
    	Gcode = RS.getInt("code");
    	Gtitle = RS.getString("title");
    	Gpay = RS.getInt("pay");
    	Gemail = RS.getString("email");	
    }//if end
}catch(Exception ex){ System.out.println("한건출력에러 11월03일 " + ex.toString());}
%>	    
	
<table border="1" width="900"  cellspacing="0" cellpadding="20px">
   <tr align="center">
   	 <td colspan="2">
   	 	<font style="font-size:26pt;color:blue; font-weight:bold;"> guestDetail.jsp 상세페이지 </font> 
   	  </td>
   </tr>
  	<tr>
  		<td width="250"  rowspan="4" align="center" >
  		  <img src="images/bbb.gif" width="350" height="200"> 
  		</td> 
  		<td> 코드:  <%= Gcode %>  </td>
  	</tr> 	
  	<tr>
  	   <td> 제목: <%= Gtitle %>  </td>
  	</tr>
  	<tr>
  	   <td> 급여: <%= Gpay %>  </td>
  	</tr>
   	<tr>  
  	   <td> 메일: <%= Gemail %>  </td>
  	</tr>
  	
  	<tr align="center">
  	   <td colspan="2"> 
  			<a href="guestList.jsp">[guestList]</a>
  			<a href="guestDeleteSave.jsp?idx=<%= Gcode %>">[삭제]</a>
  			<a href="guestWrite.jsp">[등록화면]</a>
  			 <a href="guestEdit.jsp?code=<%= Gcode %>&title=<%=Gtitle%>&pay=<%=Gpay%>&email=<%=Gemail%>">[수정]</a>
  	   </td>
  	</tr>
 </table>

</body>
</html>




















