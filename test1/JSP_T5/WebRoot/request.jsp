<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>request内置对象</title>
    
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
    //1、request属性的操作
    //设置属性
    request.setAttribute("attle1","value1");
    request.setAttribute("attle2","value2");
    
    //获取属性、如果不存在返回null
    out.print("request属性："+request.getAttribute("attle2"));
    
    
    //获取request作用域的所有属性名称
    Enumeration en= request.getAttributeNames();
    while(en.hasMoreElements()){//判断是否有下一个元素
    	System.out.println(request.getAttribute(en.nextElement()+""));
    }
    
    //2、request对参数操作
   // request.getParameter("");
    
    
    %>
    <br/>
    设置请求编码：<%= request.getCharacterEncoding() %><br/>
    内容类型：<%= request.getContentType() %><br/>
    站点名称：<%= request.getContextPath() %><br/>
    请求方式：<%= request.getMethod() %><br/>
    协议：<%= request.getProtocol()%><br/>
    IP地址：<%= request.getRemoteHost()%><br/>
    basepath:<%=basePath %>
  </body>
</html>
