<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ include file="./ssi.jsp" %>
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
		#reverse{
			display : inline-block;
			float : right;
		}
	</style>
	<script type="text/javascript">
		function first() {
			open_form.userid.focus();
		}//first end
		function reverseWrite(){
			let ccc = open_form.reverse.value;
			if(ccc){
				  opener.document.getElementById("code").value =document.getElementById("userid").value;  
			}	
			window.close();
			
		}
	</script>
</head>
<body bgcolor="yellow" onload="first();">
    <%
      String data = request.getParameter("userid");
      String msg2 = "";
      String a = "취소";
      //System.out.println("openID.jsp문서" );
      //System.out.println("넘어온code = " + data);
      msg = "select count(*) as cnt from guest where code="+data ;
      ST = CN.createStatement(); 
      RS = ST.executeQuery(msg);
      RS.next();
      Gtotal = RS.getInt("cnt");
      if(Gtotal>0){
    	  msg2="code가 중복되었습니다. 다시입력하세요.";
    	  a = "취소";
    	  data="";
      }else{
    	  msg2 ="사용가능한 code 입니다.";
    	  a = "사용하기";
    	}
    %>
  
	<h2> openID.jsp </h2>
	<img src="images/bar.gif" width=400><br>
		<form  name="open_form" action = "openID.jsp">
		   userid: <input type="text"  id="userid" name="userid" value="<%= data %>">
		   <input type="submit" value="중복처리"> 
	   		<input type="button" name ="reverse" id="reverse" onclick="reverseWrite();" value=<%=a %>> 
		</form>
	<span><% out.print(msg2); %></span>
	<img src="images/bar.gif" width=400><br>
</body>
</html>