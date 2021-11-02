<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<style>
* {
	font-size: 20pt; font-wegiht = bold;
}
</style>
</head>
<body>
	<img src="images/bar.gif">
	<br>
	<img src="images/bar.gif">
	<br>
	<img src="images/bar.gif">
	<br>
	<%
	// guestSave.jsp 단독실행하면 에러 발생 합니다. 
	out.println("<h2>guestSave.jsp</h2>");
	//try {
		int dcode = Integer.parseInt(request.getParameter("code"));
		String dtitle = request.getParameter("title");
		int dpay = Integer.parseInt(request.getParameter("pay"));
		String demail = request.getParameter("email");
		out.println("넘어온 코드 = " + dcode + "<br>");
		out.println("넘어온 제목  = " + dtitle + "<br>");
		out.println("넘어온 금액  = " + dpay + "<br>");
		out.println("넘어온 메일  = " + demail + "<br>");
	//} 
	//catch (Exception e) {}
	%>
	코드출력 : <%=dcode %>
	제목출력 : <%=dtitle %>
	금액출력 : <%=dpay %>
	이메일출력 : <%=demail %>
	<p>
		<a href="gugudan.jsp">[gugudan]</a>
		<a href="guestWrite.jsp">[Write]</a>
</body>
</html>