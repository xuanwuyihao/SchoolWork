<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jstl1.jsp' starting page</title>
    
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
    request.setAttribute("state","登陆成功！");
    %>
    jsp获取<%=request.getAttribute("state") %><br/>
    El表达式获取：${state }<br/>
    
     <!--1、 使用JSTL标签库之前 要先添加JSTL 支持 -->
     <!-- 右键项目 - MyEclipse - Add JSTL Libralies - finish -->
     <!-- 2、在jsp页面顶部 引入要使用的标签  使用taglib指令 uri表示标签库的引用地址 prefix标签前缀 -->
    
    JSTL加JSP标签输出
    <c:out value="<%=request.getAttribute("state") %>"></c:out><br/>
    JSTL加EL输出
    <c:out value="${state}"></c:out><br/>
    
    <!-- c:set设置属性   c:out获取属性 -->
    <!-- 设置属性 var属性名称  value属性值  scope作用域 -->
    <c:set var="ss" value="张三" scope="request"></c:set><br/>
    
    <!-- 获取属性 -->
    c标签获取c标签设置的属性<c:out value="${ss}"></c:out><br/>
    
    <!-- 当value为null是输出默认值 -->
    默认值：<c:out value="${att1}" default="默认值"></c:out><br/>
    
    <!-- escapeXml设置是否要编译value中的内容 true是不编译 false编译  -->
    <c:out value="<p>这是内容</p>" escapeXml="true"></c:out><br/>
    <c:out value="<p>这是内容</p>" escapeXml="false"></c:out><br/>
    <c:out value="<p>这是内容</p>"></c:out><br/>
    
    <!-- 移除属性 -->
    <c:remove var="state"/>
    
      </body>
</html>
