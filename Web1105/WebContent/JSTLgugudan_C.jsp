<%@ page language="java" contentType="text/html; charset=utf-8"   pageEncoding="utf-8"%>
<%@ taglib prefix="c"    uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn"   uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
 <title> JSTLgugudan_C.jsp </title>
 
 <style type="text/css">
   *{font-size:20pt;  }
   a{font-size:20pt; text-decoration:none; font-weight:bold; color:blue;  font-family: Comic Sans MS ; }
   a:hover{font-size:26pt; text-decoration:underline; color:green;  font-family: Comic Sans MS ; }
 </style>
</head>
<body>
 <h1>JSTLgugudan_C.jsp</h1>
 
 <c:set value="12" var="su" />  <!--  jstl변수선언  -->
 <c:catch>
   <c:forEach var="i" begin="1" end="10" step="1">
		${su} * ${i} = ${su*i} <br>       
   </c:forEach>
 </c:catch>
 
 <br>
 <c:catch>
   <c:set value="-79" var="num"/>
   <c:choose>
   		<c:when test="${num<0}"> ${num}음수입니다 </c:when>
   		<c:when test="${num==0}"> ${num}제로입니다 </c:when>
   		<c:when test="${num>0}"> ${num}양수입니다 </c:when>
   		<c:otherwise><h2>${num}숫자가 아닙니다</h2></c:otherwise>
   </c:choose> 
 </c:catch>  <br>

<p>
<a href="JSTLgugudan_A.jsp">[JSTLgugudan_AX]</a>
<a href="bbsList.jsp">[bbsList]</a>
</body>
</html>