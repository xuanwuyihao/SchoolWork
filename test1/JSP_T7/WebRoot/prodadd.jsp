<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>商品添加</title>
    
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
    <form action="prod?method=add" method="post">
    <table align="center">
    <tr><td colspan="2"><h3>商品新增：</h3></td></tr>
    <tr><td>商品名称：</td><td><input type="text" name="pname"></td></tr>
    <tr><td>价格：</td><td><input type="text" name="price"></td></tr>
    <tr><td>生产日期：</td><td><input type="text" name="pricty"></td></tr>
    <tr><td>产地：</td><td><input type="text" name="pdate"></td></tr>
    <tr><td>库存：</td><td><input type="text" name="pcount"></td></tr>
    <tr colspan="2"><td><input type="submit" value="新增"></td></tr>
    </table>
    </form>
  </body>
</html>
