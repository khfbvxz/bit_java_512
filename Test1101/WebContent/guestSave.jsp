<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<style>
* {
	font-size: 20pt;
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
	try {
		String a = request.getParameter("title");
		int b = Integer.parseInt(request.getParameter("pay"));
		out.println("넘어온 제목 = " + a + "<br>");
		out.println("넘어온 금액  = " + b + "<br>");
	} catch (Exception e) {
		out.println("최악을 피핮");
	}
	%>
	<p>
		<a href="gugudan.jsp">[gugudan]</a>
		<a href="guestWrite.jsp">[Write]</a>
</body>
</html>