<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="UserBean.Bean"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'lts.jsp' starting page</title>
    
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
    <%
    //当前登录用户
    Bean acc=(Bean)session.getAttribute("acc");
    
    //所有用户列表
    
    List list=(List)application.getAttribute("user");
    %>
    
    <%
    //发送消息，把消息存在application中
    request.setCharacterEncoding("utf-8");
    //先获取聊天内容
    
    %>
    

  </body>
</html>
