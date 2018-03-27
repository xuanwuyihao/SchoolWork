<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'userbean3.jsp' starting page</title>
    
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
    <%   %>
    <!-- javabean的自省机制：当组件中的name跟Javabean中的属性一样时 可以自动获取jsp表单中的传递参数值 -->
    
    <!-- 初始化Java -->
	    <jsp:useBean id="user" class="Bean.Userbean"></jsp:useBean>
	    
	    <!-- 1、设置属性 -->
	    <jsp:setproperty name="user" property="id"/>
	    <jsp:setproperty name="user" property="uname"/>
	    
	    <!-- 2、设置属性用*代替所有列 -->
	    <jsp:setproperty name="user" property="*"/>
	    
	    <!-- 3、若控件名与属性名不匹配 用param属性指定控件名 -->
	    <jsp:property name="user" property="name" param="uname"/>
	    
	    <!-- 获取属性 -->
	    ID：<jsp:getProperty name="user" property="id"/>
	    名称：<jsp:getProperty name="user" property="unaem"/>
	    
	    爱好：<% String[] aihaos=user.getAihao();
	    for(int i=0;i<aihaos.length;i++){
	    	out.print(aihaos[i]+"	");
	    }
	    %>
  </body>
</html>
