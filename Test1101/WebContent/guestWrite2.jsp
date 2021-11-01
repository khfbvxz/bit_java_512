<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
<script type="text/javascript">
	function codeNumber() {
		var pays = myform.pay.value;
		var pay_size = document.myform.pay.value.length; // 입력란 문자열길이
		for (i = 0; i < pay_size; i++) {
			if (pays.charAt(i) < '0' || pays.charAt(i) > '9') {
				alert("숫자를 입력하셔야 합니다.");
				myform.pay.value = pays.substring(0, i);
				myform.pay.focus();
			}//if end
		}//for end

	}
	function check() {
		var title_ch = myform.title.value;
		var pay_ch = myform.pay.value;
		if (title_ch == "" || title_ch == null) {
			alert("제목입력란의 데이터가 공백입니다 \n다시입력하세요");
			myform.title.focus();
			return ;
		} else {
			myform.pay.focus();
		}
		if (pay_ch == "" || pay_ch == null) {
			alert("제목입력란의 데이터가 공백입니다 \n다시입력하세요");
			myform.pay.focus();
			return;
		} else {
			pay.submit();
			title.submit();
		}
	}
</script>
<style>
* {
	font-size: 20pt;
}
</style>

</head>
<body>
	<h2>guestWrite2.jsp</h2>
	<form name="myform" action="guestSave.jsp" method="POST">
		제목 : <input type="text" id="title" name="title"> <br>
		가격 : <input type="text" id="pay" name="pay" onKeyup="codeNumber();" />  <br> 
		<input type="button" value="데이터저장">
		<input type="reset" value="입력취소">
	</form>
	<p>
		<a href="gugudan.jsp">[gugudan]</a> <a href="guestWrite.jsp">[Write]</a>
</body>
</html>