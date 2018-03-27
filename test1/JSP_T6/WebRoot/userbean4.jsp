<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="Bean.Userbean"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userbean4.jsp' starting page</title>
    
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
    <% %>
    <!-- 用动作元素初始化javabean 可以用Java代码设置/获取属性 -->
    <!-- 初始化Javabean -->
    <jsp:useBean id="user" class="Bean.Userbean" scope="page"></jsp:useBean>
    
    <!-- 移除javabean -->
    <%-- pageContext.removeAttribute("user")--%>
    
    <!--设置-->
    <jsp:setproperty name="user" property="id" value="1000"/>
     <jsp:setproperty name="user" property="uname" value="张三"/>
     
     ID:<%=user.getId() %>
     名称:<%=user.getUname() %>
     
     <!-- 2、不允许Java初始化javabean 用jsp标签获取 -->
     <%Userbean users=new Userbean(); %>
     <jsp:setProperty name="user" property="id" value="1000"/>
     <jsp:setProperty name="user" property="uname" value="张三"/>
     
     ID:<jsp:getProperty name="user" property="id"/>
     
  </body>
</html>
