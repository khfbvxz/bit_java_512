<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<style>
	*{	font-size : 20pt; }
	a{ font-size : 14pt; text-decoration: none; font-weghit:bold; color:blue;}
	a : hover{ font-size : 14pt; text-decoration: underline; color:green;}
	#email_ch{color : red;font-size:12pt;}
</style>
<script type="text/javascript">
	var Gflag = false; // 전역 변수
	var aaa;
	function nullCheck() {
	  var a = myform.code.value;
	  var code_size = document.myform.code.value.length; // 입력란 문자열길이
	  var b = document.myform.title.value;
	  var c = document.myform.pay.value;
 	  var d = document.myform.email.value;
	  
	  // 문자를 입력하면 입력 막고 숫자만 입력하도록 
	  if (a == "" || a == null) {
	    alert("코드입력란 데이터가 공백입니다.\n제목 데이터를 정확하게 입력하세요");
	    myform.code.focus();
	    return;
	  } else { myform.title.focus(); }
	  if (b == "" || b == null) {
	    alert("제목입력란 데이터가 공백입니다.\n제목 데이터를 정확하게 입력하세요");
	    myform.title.focus();
	    return;
	  } else { myform.pay.focus(); }
	  
	  if (c == "" || c == null) {
		    alert("제목입력란 데이터가 공백입니다.\n제목 데이터를 정확하게 입력하세요");
		    myform.pay.focus();
		    return;
		  } else { myform.email.focus(); }
	
	///^([a-zA-Z0-9-_\.]{3,15})@([a-zA-Z]{2,15})\.([a-zA-Z]{2,10})$/;
	  if (d == "" || d == null) {
	    document.getElementById("email_ch").innerHTML="<font style='font-size : 12px;'>*메일데이터를 입력하세요</font>";
	    myform.email.focus();
	    return;
	  }else {
	    var mail_reg = /^([a-zA-Z0-9-_\.]{3,7})@([a-zA-Z]{2,7})\.([a-zA-Z]{2,10})$/;
	    if(mail_reg.test(d)==false){
	      document.getElementById("email_ch").innerHTML="<font style='font-size:12pt; color:red'>*sky@nate.com형식으로 입력하세요*</font>";
	      myform.email.value="";
	      myform.email.focus();
	      
	    }else{
	      document.getElementById("email_ch").innerHTML="";
	    }
	  }
	  //전역변수 
	  if(Gflag==false){
		  alert("중복체크를 안하셨군요!");
		  myform.code.focus();
		  return;
	  }
	  
	  if(confirm("선택한 데이터 내용이 맞습니까?")==true) {
	  	document.myform.submit();
	  }
	  
	}// nullCheck end
	
	function idCheck(){
		  var dcode = myform.code.value;
		  var dcode_size = document.myform.code.value.length; // 입력란 문자열길이
		  if (dcode == "" || dcode == null) {
		    alert("code check 데이터가 공백입니다. ");
		    myform.code.focus();
		    return;
		  } 
		  if(dcode_size !=4){
			  alert("code  데이터가 4글자입니다. ");
			  myform.code.value="";
			  myform.code.focus();
			  return;  
		  }
		  window.open("openID.jsp?idx="+dcode,"child","width=700, height=170,left=700,top=200");
		  //window 내장개체는 생략가능 
		  Gflag = true;
		  
		 
	}
	function codeNumber(){
	  var code = myform.code.value;
	  var code_size = document.myform.code.value.length; // 입력란 문자열길이
	  for(i=0 ; i<code_size ; i++ ){
	    if(code.charAt(i)<'0' || code.charAt(i)>'9'){
	      alert("숫자를 입력하셔야 합니다.");
	      myform.code.value = code.subst(0,i);
	      myform.code.focus();
	    }//if end
	  }//for end
	}// codeNumber end
	
	
	function payNumber(){
		  var code = myform.pay.value;
		  var code_size = document.myform.pay.value.length; // 입력란 문자열길이
		  for(i=0 ; i<code_size ; i++ ){
		    if(code.charAt(i)<'0' || code.charAt(i)>'9'){
		      alert("숫자를 입력하셔야 합니다.");
		      myform.code.value = code.subst(0,i);
		      myform.code.focus();
		    }//if end
		  }//for end
		  
		}// codeNumber end

</script>
<style>
* {
	font-size: 20pt;
}
</style>

</head>
<body>
	<h2>guestWrite2.jsp</h2>
	<form name="myform" action="guestSave.jsp" method="get">
		코드 : <input type="text" id="code" name="code" size="8"/> 
		<input type="button" onclick="idCheck();" value="중복확인" > <span></span> <br>
		제목 : <input type="text" id="title" name="title" value="snow" /> <span></span> <br>
		가격 : <input type="text" id="pay" name="pay" value="21" onKeyup="payNumber();" />    <span></span><br>
		메일 : <input type="text" id="email" name="email" value="abc@naver.com"> <span id="email_ch"></span><br> 
		<input type="button" onclick="nullCheck();" value="데이터저장">
		<input type="reset" value="입력취소">
		<input type="submit" onclick="nullCheck();" value="서브밋 권장">
	</form>
	<p>
		<a href="gugudan.jsp">[gugudan]</a> <a href="guestWrite.jsp">[Write]</a>
</body>
</html>