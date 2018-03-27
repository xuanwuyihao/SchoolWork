<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'mycollect.jsp' starting page</title>
    
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
   <table width="90%" border="1" align="center">
     <tr><td width="33%">商品图片信息</td><td>商品类型</td><td>商品单价</td></tr>
     <c:forEach items="${map}" var="m">
               <tr><td colspan="5"></td></tr>          
               <tr>
               <td >      
               <table  align="center">
               <tr><td rowspan="4"><a href="onshop?method=selprodbyid&pid=${m.value.pid }"><img src="${m.value.bdesc }" width="150" height="100"/></a></td></tr>
               <tr><td><a href="onshop?method=selprodbyid&pid=${m.value.pid }">${m.value.pname }</a></td></tr>
               <tr><td><a href="onshop?method=selprodbyid&pid=${m.value.pid }">${m.value.btrad}</a></td></tr>
               </table>
               </td>           
               <td  align="center">${m.value.ptype1 }</td>
               <td  align="center">￥${m.value.pprice }</td>
               </tr>
               </c:forEach>
     </table>
  </body>
</html>
