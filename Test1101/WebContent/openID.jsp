<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
	<style type="text/css">
		*{ font-size : 20pt}
		a{ font-size : 14pt; text-decoration: none; font-weghit:bold; color:blue;}
		a : hover{ font-size : 14pt; text-decoration: underline; color:green;}
		#email_ch{color : red;font-size:12pt;}
	</style>
	<script type="text/javascript">
		document.setEelmentById("codea").value = document.getEelmentById("code").value;
		function first() {
			open_form.userid.focus();
		}//first end
		
	</script>
</head>
<body bgcolor="yellow" onload="first();">
    <%
      String data = request.getParameter("idx");
      //System.out.println("openID.jsp문서" );
      //System.out.println("넘어온code = " + data);
    %>
  
	<h2> openID.jsp </h2>
	<img src="images/bar.gif" width=400><br>
		<form  name="open_form">
		   userid: <input type="text" name="userid" value="<%= data %>">
		   <input type="submit" value="중복처리"> 
		</form>
	<img src="images/bar.gif" width=400><br>
</body>
</html>