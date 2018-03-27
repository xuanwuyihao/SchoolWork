<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userbean2.jsp' starting page</title>
    
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
    <!-- jsp:userbean标签 实例化一个javabean 
    id:javabean的对象名称
    scopen:指定javabean的包名.类名
    scope:指定Javabean的作用域 page默认的 request session application
    
    -->
    <jsp:useBean id="user" class="Bean.Userbean" scope="page"></jsp:useBean>
    
    <!-- jsp:setproperty 对Javabean设置
    name:指定Javabean的对象名称
    property：指定个那个属性设置
    value：设什么值 -->
    
    <jsp:setProperty name="user" property="id" value="1000"/>
    <jsp:setProperty name="user" property="uname" value="张三"/>
    <jsp:setProperty name="user" property="marry" value="true"/>
    
    <!-- jsp.getproperty获取Javabean的属性值 -->
    ID:<jsp:getProperty name="user" property="id"/>
    名称:<jsp:getproperty name="user" property="uname"/>
    婚否：<jsp:getProperty name="user" property="marry"/>
    
  </body>
</html>
