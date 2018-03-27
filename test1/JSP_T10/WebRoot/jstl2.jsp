<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="javax.xml.registry.infomodel.User"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jstl2.jsp' starting page</title>
    
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
    <!-- 1、c:if 没有else -->
    <c:set var="cid" value="10000"></c:set>
    
    <!-- 判断逻辑 使用test属性来返回true或false  字符串加单引号 -->
    <c:if test="${cid==10000}">
    小明
    </c:if>
    <c:if test="${cid!=10000}">
    其他人
    </c:if><br/>
    
    <!-- 2、c:choose  c:when c:otherwise 相当于if if else else -->
    <c:choose>
    <c:when test="${cid==10000}">小小明</c:when>
    <c:when test="${cid==10001}">小张</c:when>
    <c:when test="${cid==10002}">小邱</c:when>
    <c:otherwise>都不是</c:otherwise>
    </c:choose>
    
    <!-- 3、c:forEach 循环标签 -->
    <%
    String[] str={"xxxxxxxxx","yyyyyyyy","zzzzzzzzz"};
    request.setAttribute("ss",str);
    %>
    <br/>
   
    <c:forEach items="${ss}" var="s" step="1">
    ${s }<br/>
    </c:forEach>
    
    
    
  </body>
</html>
