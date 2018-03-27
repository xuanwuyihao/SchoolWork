<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP '乘法表.jsp' starting page</title>
    
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script>
	for(var i=1;i<10;i++){
		for(var x=1;x<=i;x++){
		document.write(i+"*"+x+"="+i*x+"&nbsp;&nbsp;")
		}
		document.write("<br/>")
	}
	</script>
  </head>
  
  <body>
    
  </body>
</html>
