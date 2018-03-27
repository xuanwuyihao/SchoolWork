<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'prototype.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	<script type="text/javascript" src="script/prototype.js"></script>
	<script type="text/javascript">
	function test1(){
	
	var d=$('mydiv');
	alert(d.innerText);
	alert("-------");
	
	
	//测试$F()-返回文本框中的内容
	//var d=$F('mg');
	//alert(d);
	//alert("-------");
	
	
	}
	function test2(){
	var divs=$('mydiv','myotherdiv');
	for(i=0; i<divs.length; i++){
	alter(divs[i].innerText)
	}
	}
	</script>
  </head>
 
  <body>
   <div id="mydiv">
  <p>this is a paragraph</p>
  </div>
  
  <div id="myotherdiv">
  <p>xxxxxxxxxxxxx</p>
  </div>
  
    <input type="password" name="mg" />
  
    <input type="button" value="登录" onclick="test1()">
  </body> 
</html>
