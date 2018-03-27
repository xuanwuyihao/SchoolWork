<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Canshuchuandi.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="zc" method="post">
    用户名：<input type="text" name="uname"/></br>
    爱好：<input type="checkbox" name="aihao" value="上网">上网
    <input type="checkbox" name="aihao" value="体育">体育
    <input type="checkbox" name="aihao" value="听音乐">听音乐
    </br>
    隐藏域：<input type="hidden" name="age" value="18"></br>
    <input type="submit" value="提交"/>
    </form>
  </body>
</html>
