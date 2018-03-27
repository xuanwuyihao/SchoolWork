<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dongzuoyuansu(include).jsp' starting page</title>
    
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
    动作元素标签用于执行一些标准的JSP网页动作，例如：转向，包含，插件，使用javabean
    
    //向被包含的页面传递参数的方法
    //1、直接在URL上加[?参数名=参数值[&参数=参数值]]  第二个以后要用&连接
    //2、在include之间插入jsp:param标签 传递name属性表示参数名 value表示参数值


    <jsp:include page="2.jsp">
    <jsp:param name="id" value="10000"/>
    <jsp:param name="uname" value="xiao"/>
    </jsp:include>
   
  </body>
</html>
