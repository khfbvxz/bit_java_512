<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ include file="ssi.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>guestEdit.jsp</title>
  
<style>
    *{font-size:16pt;}
    a{font-size:16pt; text-decoration:none; font-weight:bold; color:blue;  font-family: Comic Sans MS ; }
    a:hover{font-size:20pt; text-decoration:underline; color:green;  font-family: Comic Sans MS ; } }
    #email_ch{
       color: red;
       font-size: 14pt;
    }
</style>
</head>
<body>
<h2> guestEdit.jsp=단독실행금지 </h2>
<%
try{
	Gcode = Integer.parseInt( request.getParameter("idx"));
	msg = "select * from guest where code = "+ Gcode;
	ST = CN.createStatement(); 
    RS = ST.executeQuery(msg);
    if(RS.next()==true){
    	Gcode = RS.getInt("code");
    	Gtitle = RS.getString("title");
    	Gpay = RS.getInt("pay");
    	Gemail = RS.getString("email");	
    }//if end
	// seletc 해서 
}catch(Exception ex){
	System.out.println("수정 에러 이유 : "+ex.toString());
}
%>
<form name="myform" method="get" action="guestEditSave.jsp">
    코드: <input type="text" name="code" value=<%=Gcode %>>         <br>
    제목: <input type="text" name="title" value=<%=Gtitle %>> <span></span> <br>
    급여: <input type="text" name="pay" value=<%=Gpay %>> <span></span> <br>
    메일: <input type="text" name="email" id="email"  value=<%=Gemail %>> <span id="email_ch"></span> <br>
    <input type="reset" value="수정취소">
    <input type="submit" value="서브밋수정">
</form>
	
<p>
<a href="gugudan.jsp">[gugudan]</a>
<a href="guestWrite.jsp">[방명록등록]</a>
<a href="guestList.jsp">[전체출력]</a>
</body>
</html>















