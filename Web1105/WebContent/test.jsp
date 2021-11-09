<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>

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
   
   <script type="text/javascript">
   </script>
</head>
<body>
	<h2> .jsp </h2>
	<h2>
		세션 ID <%=session.getId() %>
	</h2>
<%
Cookie[] ck = request.getCookies();
if(ck != null){
	for(int i=0; i<ck.length; i++){
	    out.print("test.jsp "+ ck[i].getName() + ":" + ck[i].getValue());
	}
}
%>

</body>
</html>