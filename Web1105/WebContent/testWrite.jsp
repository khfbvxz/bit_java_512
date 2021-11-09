<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ include file="ssi.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>testWrite.jsp</title>
  
<style type="text/css">
  *{font-size:16pt;}
  a{font-size:16pt; text-decoration:none; font-weight:bold; color:blue;  font-family: Comic Sans MS ; }
  a:hover{font-size:20pt; text-decoration:underline; color:green;  font-family: Comic Sans MS ; }
</style>
   
<script type="text/javascript">
	function handleFileSelect(){
		var files = document.getElementById('file').files[0]; 
   		var reader = new FileReader();     
        reader.onload = (function(theFile) {
          return function(e) {  
          //원본 var img_view = ['<img src="', e.target.result, '" name="', escape(theFile.name),'"   width="400" height="200"  alt="tis" />'].join('');
          var img_view = ['<img src=', e.target.result + '  width="400" height="200"  alt="bit" />'].join('');
              document.getElementById('preview').innerHTML = img_view ;
          };
       })(files);
     reader.readAsDataURL(files);    
	}
</script>
</head>
<body>
<h2> testWrite.jsp </h2>
  <form name="myform" method="post" enctype="multipart/form-data"  action="testSave.jsp"    >
      제목:  <input type="text" name="title" >  <br>
      급여:  <input type="text" name="pay" value="71">  <br>
      성별:  <input type="radio" name="gender" value="man" checked="checked">남자
         <input type="radio" name="gender" value="woman" >여자    <br>
      파일:  <input type="file" name="file1" id="file" onchange="handleFileSelect()"> <br>
         <input type="submit" value="이미지게시판jsp저장" > &nbsp;
         <input type="reset" value="취소">  
  </form>
  
  <br>
  <div id="preview"></div>
  
  <p>
  <a href="testWrite.jsp">[testWrite]</a>
  <a href="testList.jsp">[testList]</a>
  <a href="#">[index]</a>	
</body>
</html>