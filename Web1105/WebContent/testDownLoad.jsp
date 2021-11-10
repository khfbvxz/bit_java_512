<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ page import="java.io.File" %>
<%@ page import="java.io.InputStream" %>
<%@ page import="java.io.FileInputStream" %>
<%@ page import="java.io.OutputStream" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>testDownload.jsp</title>
 <style type="text/css">
   *{font-size:16pt;}
   a{font-size:16pt; text-decoration:none;  font-family: Comic Sans MS ; }
   a:hover{font-size:20pt; text-decoration:underline; color:green;  font-family: Comic Sans MS ; }
 </style>
 
 <script type="text/javascript">
 </script>
 
</head>
<body>

<h2> testDownload.jsp.jsp 다운로드문서 </h2>	
<%
 try{ 
	 //a href="testDownload.jsp?idx전달자=Gcode실제값&fname전달자=Gimage실제값
	String path = application.getRealPath("storage");
    System.out.println("경로 = " + path) ;
 
	String data = request.getParameter("idx"); 
	String fname = request.getParameter("fname"); //파일이름이 문자열
    System.out.println("코드데이터:"+ data + "  파일명:" + fname);
	File file = new File(path, fname);
	
	//response.setHeader(1,2);
	response.setHeader("Content-Disposition", "attachment;filename="+fname);
	
	InputStream is  = new FileInputStream(file);
	OutputStream os = response.getOutputStream();
	
	byte[] bt = new byte[(int)file.length()];
	is.read(bt, 0, bt.length);
	os.write(bt); //기록
	
	is.close();
	os.close();
  }catch(Exception ex){ System.out.println("testDownload에러 " + ex.toString()); }
 %> 
  
<a href="testWrite.jsp">[testWrite]</a>
<a href="testList.jsp">[testList]</a>

</body>
</html>






