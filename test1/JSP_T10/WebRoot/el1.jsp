<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'el1.jsp' starting page</title>
    
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
    String uname=request.getParameter("uname");
    String pwd=request.getParameter("pwd");
    
    %>
    用户名：<%=uname %>,密码：<%=pwd %>
    
    <br/>
    用EL表达式(使用param.参数名获取)
    用户名：${param.uname }，用户密码：${param.pwd }
    
    2、EL表达式自动类型转换
    <%
    String age=request.getParameter("age");
    int a=Integer.parseInt(age);
    %>
    <br/>
    年龄:<%=a+10 %>
    El年龄：${param.age+10 }
    
    
  </body>
</html>
