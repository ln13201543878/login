<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
$(function() {
	 $("#btn").click(function(){
		$.ajax({
	url:"User_reg",
	data:{ucount:$("#count").val(),
			upwd:$("#pwd").val()},
	success:function(xx){
		if(xx=="账号已存在"){
			$("#prompt").html("账号已存在");
			}
	}
			});
	});
});



</script>
<body>
	<form  method="post">
		账号：<input id="count" type="text" name="ucount" /><span id="prompt"></span><br>
		 密码：<input id="pwd"   type="text" name="upwd" /> <br>
		     <button type="button" id="btn" >提交</button>
			
	</form>
</body>
</html>