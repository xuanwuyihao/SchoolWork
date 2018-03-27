<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	function displayDate(){
		document.getElementById("demo").innerHTML=Date();
	}
	
	
	function bian(){
		x=document.getElementById("demo1");
		x.innerHTML="love you!"
	}
	
	//javascript显示时间-------来源菜鸟教程
	var myvar=setInterval(function(){myTime()},1000);
	function myTime(){
		var d=new Date();
		var t=d.toLocaleTimeString();
		document.getElementById("demo3").innerHTML=t;
	}
</script>
</head>
<body>
<p id="demo1">爱你!</p>
<p id="demo"></p>
<p id="demo3"></p>
<button type="button" onclick="displayDate()">显示日期</button>
<button type="b1" onclick="alert('你好！')">点我</button>
<button tupe="b2" onclick="bian()">变内容</button>


</body>
</html>