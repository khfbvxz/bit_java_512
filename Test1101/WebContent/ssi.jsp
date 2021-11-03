<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
	<style>
	*{	font-size : 20pt; }
	a{ font-size : 14pt; text-decoration: none;  color:blue;}
	a : hover{ font-size : 14pt; text-decoration: underline; color:green;}
	</style>
</head>
<body>
	<%! 
	// server  side include . jsp 문서
		Connection CN;
		Statement ST;
		PreparedStatement PST;
		ResultSet RS;
		
		int Grn,Grow, Gsabun, Gcode, Gpay, Ghit, Gtotal, GStotal;
		String  Gtitle, Gemail, Gmemo, GID, GPWD;
		java.util.Date GDate, Gwdate;
		String Gmsg, msg , Gdata;
		int Rrn, Rnum, Rsabun, Rcode;
		String Rwriter, Rcontent;
		
		int dcode , dpay;  // guestSave.jsp
		String dtitle, demail;
	%>
	<%
	try{
	     Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이브로드
	     String url="jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
	     CN=DriverManager.getConnection(url,"system","1234");
	     //System.out.println("ssi 문서 DB연결 성송 OK  11/03");
	     ST=CN.createStatement();
	 }catch (Exception e) {System.out.println("ssi문서 DB연결 실패 "+e.toString());}
	// insert into guest values(9900,'aaa',21,'aa@LG.com')
	%>
	
	
</body>
</html>